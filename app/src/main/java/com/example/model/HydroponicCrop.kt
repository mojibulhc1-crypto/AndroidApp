package com.example.model

enum class CropCategory(val title: String, val hindiTitle: String) {
    LEAFY_GREEN("Leafy Greens", "पत्तेदार सब्जियां"),
    FRUITING_CROP("Fruiting Crops", "फल और सब्जियां")
}

data class CropStageGuide(
    val stageName: String,
    val hindiStageName: String,
    val durationDays: String,
    val targetEc: String,
    val targetPh: String,
    val instructions: List<String>,
    val hindiInstructions: List<String>,
    val keyTips: List<String>,
    val hindiKeyTips: List<String>
)

data class NutrientRecipe(
    val vegetativeNpk: String,
    val floweringFruitingNpk: String,
    val partADetails: String,
    val partBDetails: String,
    val partCDetails: String,
    val mixingGuide: String,
    val hindiMixingGuide: String,
    val flushSchedule: String,
    val hindiFlushSchedule: String
)

data class PollinationGuide(
    val isSelfPollinating: Boolean,
    val requiresManualPollinationIndoors: Boolean,
    val flowerTypes: String,
    val hindiFlowerTypes: String,
    val handPollinationTechnique: String,
    val hindiHandPollinationTechnique: String,
    val bestTimeToPollinate: String,
    val optimalHumidityForPollen: String
)

data class PruningGuide(
    val trellisingMethod: String,
    val hindiTrellisingMethod: String,
    val suckeringRules: String,
    val hindiSuckeringRules: String,
    val leafPruning: String,
    val hindiLeafPruning: String,
    val toppingRule: String,
    val hindiToppingRule: String
)

data class HydroponicCrop(
    val id: String,
    val name: String,
    val hindiName: String,
    val scientificName: String,
    val category: CropCategory,
    val iconEmoji: String,
    val shortOverview: String,
    val hindiShortOverview: String,
    // Numerical parameters
    val ecMin: Double,
    val ecMax: Double,
    val ppm500Min: Int,
    val ppm500Max: Int,
    val phMin: Double,
    val phMax: Double,
    val idealWaterTempMin: Int,
    val idealWaterTempMax: Int,
    val dayTempMin: Int,
    val dayTempMax: Int,
    val nightTempMin: Int,
    val nightTempMax: Int,
    val lightHoursPerDay: Int,
    val recommendedDli: String,
    val recommendedSystems: List<String>,
    val hindiRecommendedSystems: List<String>,
    val germinationDays: String,
    val harvestDaysFromSeed: String,
    val plantSpacingCm: String,
    val waterPerPlantDaily: String,
    // Step-by-step guides
    val seedlingGuide: CropStageGuide,
    val vegetativeGuide: CropStageGuide,
    val fruitingGuide: CropStageGuide?,
    val pollinationGuide: PollinationGuide?,
    val pruningGuide: PruningGuide?,
    val nutrientRecipe: NutrientRecipe,
    val harvestingGuide: String,
    val hindiHarvestingGuide: String,
    val commonPestsAndDiseases: List<String>,
    val hindiCommonPestsAndDiseases: List<String>
)
