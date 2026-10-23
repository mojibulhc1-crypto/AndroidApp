package com.example.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "crop_batches")
data class CropBatch(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val cropName: String,
    val variety: String,
    val systemType: String,
    val datePlantedMillis: Long,
    val expectedHarvestDays: Int,
    val currentStage: String, // Seedling, Vegetative, Flowering, Fruiting, Ready to Harvest
    val targetEcMin: Double,
    val targetEcMax: Double,
    val targetPhMin: Double,
    val targetPhMax: Double,
    val reservoirLiters: Double,
    val notes: String = "",
    val isHarvested: Boolean = false
)
