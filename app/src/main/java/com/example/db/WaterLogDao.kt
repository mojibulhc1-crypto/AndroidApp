package com.example.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WaterLogDao {
    @Query("SELECT * FROM water_logs WHERE batchId = :batchId ORDER BY timestampMillis DESC")
    fun getLogsForBatch(batchId: Long): Flow<List<WaterLog>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLog(log: WaterLog): Long

    @Delete
    suspend fun deleteLog(log: WaterLog)

    @Query("SELECT * FROM water_logs WHERE batchId = :batchId ORDER BY timestampMillis DESC LIMIT 1")
    suspend fun getLatestLogForBatch(batchId: Long): WaterLog?
}
