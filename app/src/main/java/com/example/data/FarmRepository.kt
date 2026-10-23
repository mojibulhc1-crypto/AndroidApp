package com.example.data

import com.example.db.CropBatch
import com.example.db.CropBatchDao
import com.example.db.WaterLog
import com.example.db.WaterLogDao
import kotlinx.coroutines.flow.Flow

class FarmRepository(
    private val cropBatchDao: CropBatchDao,
    private val waterLogDao: WaterLogDao
) {
    val activeBatches: Flow<List<CropBatch>> = cropBatchDao.getActiveBatches()
    val harvestedBatches: Flow<List<CropBatch>> = cropBatchDao.getHarvestedBatches()

    suspend fun getBatchById(id: Long): CropBatch? = cropBatchDao.getBatchById(id)

    suspend fun insertBatch(batch: CropBatch): Long = cropBatchDao.insertBatch(batch)

    suspend fun updateBatch(batch: CropBatch) = cropBatchDao.updateBatch(batch)

    suspend fun deleteBatch(batch: CropBatch) = cropBatchDao.deleteBatch(batch)

    suspend fun deleteBatchById(id: Long) = cropBatchDao.deleteBatchById(id)

    fun getLogsForBatch(batchId: Long): Flow<List<WaterLog>> = waterLogDao.getLogsForBatch(batchId)

    suspend fun insertLog(log: WaterLog): Long = waterLogDao.insertLog(log)

    suspend fun getLatestLog(batchId: Long): WaterLog? = waterLogDao.getLatestLogForBatch(batchId)
}
