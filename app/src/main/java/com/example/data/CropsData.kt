package com.example.data

import com.example.data.crops.FruitingCropsData
import com.example.data.crops.LeafyGreensData
import com.example.model.HydroponicCrop

object CropsData {

    val allCrops: List<HydroponicCrop> = LeafyGreensData.crops + FruitingCropsData.crops

    fun getCropById(id: String): HydroponicCrop? {
        return allCrops.find { it.id.equals(id, ignoreCase = true) }
    }
}
