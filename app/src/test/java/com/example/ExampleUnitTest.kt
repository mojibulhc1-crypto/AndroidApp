package com.example

import com.example.data.CropsData
import com.example.data.DiagnosticsData
import com.example.data.FundamentalsData
import com.example.data.SystemsData
import com.example.model.CropCategory
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun testAllCropsDataCompleteness() {
        val crops = CropsData.allCrops
        assertTrue("Should have at least 8 crops", crops.size >= 8)

        // Verify Leafy Greens
        val leafyGreens = crops.filter { it.category == CropCategory.LEAFY_GREEN }
        val leafyIds = leafyGreens.map { it.id }
        assertTrue("Should contain lettuce", leafyIds.contains("lettuce"))
        assertTrue("Should contain spinach", leafyIds.contains("spinach"))
        assertTrue("Should contain coriander", leafyIds.contains("coriander"))
        assertTrue("Should contain mint", leafyIds.contains("mint"))
        assertTrue("Should contain Assam lai xak", leafyIds.contains("lai_xak"))

        // Verify Fruiting Crops requested by user
        val fruitingCrops = crops.filter { it.category == CropCategory.FRUITING_CROP }
        val fruitingIds = fruitingCrops.map { it.id }
        assertTrue("Should contain cucumber", fruitingIds.contains("cucumber"))
        assertTrue("Should contain tomato", fruitingIds.contains("tomato"))
        assertTrue("Should contain capsicum", fruitingIds.contains("capsicum"))
        assertTrue("Should contain chilli", fruitingIds.contains("chilli"))

        // Verify A to Z details for each crop
        for (crop in crops) {
            assertTrue("Crop ${crop.name} must have valid EC range", crop.ecMin > 0 && crop.ecMax >= crop.ecMin)
            assertTrue("Crop ${crop.name} must have valid pH range", crop.phMin in 4.0..7.5 && crop.phMax >= crop.phMin)
            assertNotNull("Crop ${crop.name} must have seedling guide", crop.seedlingGuide)
            assertNotNull("Crop ${crop.name} must have vegetative guide", crop.vegetativeGuide)
            assertNotNull("Crop ${crop.name} must have nutrient recipe", crop.nutrientRecipe)
            assertTrue("Crop ${crop.name} must have recommended systems", crop.recommendedSystems.isNotEmpty())
            assertTrue("Crop ${crop.name} must have Hindi translation", crop.hindiName.isNotBlank())
        }
    }

    @Test
    fun testHydroponicSystemsData() {
        val systems = SystemsData.getSystemsList()
        assertEquals("Should contain 6 hydroponic systems", 6, systems.size)
        val systemIds = systems.map { it.id }
        assertTrue("Should contain NFT", systemIds.contains("nft"))
        assertTrue("Should contain DWC", systemIds.contains("dwc"))
        assertTrue("Should contain Dutch Bucket", systemIds.contains("dutch_bucket"))
        assertTrue("Should contain Drip", systemIds.contains("drip"))
        assertTrue("Should contain Aeroponics", systemIds.contains("aeroponics"))
        assertTrue("Should contain Ebb & Flow", systemIds.contains("ebb_flow"))
    }

    @Test
    fun testFundamentalsData() {
        val topics = FundamentalsData.topics
        assertTrue("Should contain fundamentals topics", topics.isNotEmpty())
        val topicIds = topics.map { it.id }
        assertTrue("Should contain what is hydroponics", topicIds.contains("what_is_hydroponics"))
    }

    @Test
    fun testDiagnosticsData() {
        val issues = DiagnosticsData.allIssues
        assertTrue("Should have diagnostic plant issues", issues.isNotEmpty())
        val issueIds = issues.map { it.id }
        assertTrue("Should cover blossom end rot", issueIds.contains("blossom_end_rot"))
        assertTrue("Should cover tipburn", issueIds.contains("tipburn"))
        assertTrue("Should cover iron chlorosis", issueIds.contains("iron_chlorosis"))
        assertTrue("Should cover root rot", issueIds.contains("pythium_root_rot"))
    }

    @Test
    fun testEcToPpmConversionMath() {
        val ec = 2.0
        val ppm500 = (ec * 500).toInt()
        val ppm700 = (ec * 700).toInt()
        assertEquals(1000, ppm500)
        assertEquals(1400, ppm700)
    }
}

