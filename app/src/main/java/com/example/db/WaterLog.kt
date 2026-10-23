package com.example.db

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "water_logs",
    foreignKeys = [
        ForeignKey(
            entity = CropBatch::class,
            parentColumns = ["id"],
            childColumns = ["batchId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["batchId"])]
)
data class WaterLog(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val batchId: Long,
    val timestampMillis: Long = System.currentTimeMillis(),
    val recordedEc: Double,
    val recordedPh: Double,
    val waterTempC: Double = 20.0,
    val waterAddedLiters: Double = 0.0,
    val notes: String = ""
)
