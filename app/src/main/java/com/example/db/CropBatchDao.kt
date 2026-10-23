package com.example.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface CropBatchDao {
    @Query("SELECT * FROM crop_batches WHERE isHarvested = 0 ORDER BY datePlantedMillis DESC")
    fun getActiveBatches(): Flow<List<CropBatch>>

    @Query("SELECT * FROM crop_batches WHERE isHarvested = 1 ORDER BY datePlantedMillis DESC")
    fun getHarvestedBatches(): Flow<List<CropBatch>>

    @Query("SELECT * FROM crop_batches WHERE id = :id LIMIT 1")
    suspend fun getBatchById(id: Long): CropBatch?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBatch(batch: CropBatch): Long

    @Update
    suspend fun updateBatch(batch: CropBatch)

    @Delete
    suspend fun deleteBatch(batch: CropBatch)

    @Query("DELETE FROM crop_batches WHERE id = :id")
    suspend fun deleteBatchById(id: Long)
}
