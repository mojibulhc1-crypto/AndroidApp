package com.example.model

data class HydroponicSystem(
    val id: String,
    val name: String,
    val hindiName: String,
    val tagLine: String,
    val hindiTagLine: String,
    val workingPrinciple: String,
    val hindiWorkingPrinciple: String,
    val bestCrops: List<String>,
    val hindiBestCrops: List<String>,
    val equipmentRequired: List<String>,
    val hindiEquipmentRequired: List<String>,
    val flowRateOrSpecs: String,
    val hindiFlowRateOrSpecs: String,
    val diyBuildSteps: List<String>,
    val hindiDiyBuildSteps: List<String>,
    val advantages: List<String>,
    val hindiAdvantages: List<String>,
    val disadvantages: List<String>,
    val hindiDisadvantages: List<String>,
    val maintenanceTips: List<String>,
    val hindiMaintenanceTips: List<String>
)
