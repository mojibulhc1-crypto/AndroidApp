package com.example.model

data class NutrientElement(
    val symbol: String,
    val name: String,
    val hindiName: String,
    val type: String, // Macro or Micro
    val function: String,
    val hindiFunction: String,
    val deficiencySign: String,
    val hindiDeficiencySign: String
)

data class PlantIssue(
    val id: String,
    val name: String,
    val hindiName: String,
    val category: String, // Deficiency, Disease, Pest, Environmental
    val affectsCrops: List<String>,
    val visualSymptom: String,
    val hindiVisualSymptom: String,
    val primaryCause: String,
    val hindiPrimaryCause: String,
    val immediateFix: String,
    val hindiImmediateFix: String,
    val preventionTip: String,
    val hindiPreventionTip: String
)
