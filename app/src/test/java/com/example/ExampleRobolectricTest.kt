package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.CropsData
import com.example.data.SystemsData
import com.example.model.CropCategory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("Assam Hydroponic Grow", appName)
  }

  @Test
  fun `crops database contains leafy greens and fruiting crops`() {
    val crops = CropsData.allCrops
    assertTrue(crops.isNotEmpty())

    val leafyGreens = crops.filter { it.category == CropCategory.LEAFY_GREEN }
    val fruitingCrops = crops.filter { it.category == CropCategory.FRUITING_CROP }

    assertTrue("Should have leafy greens", leafyGreens.isNotEmpty())
    assertTrue("Should have fruiting crops", fruitingCrops.isNotEmpty())

    // Verify cucumber, tomato, capsicum, chilli exist
    assertNotNull(crops.find { it.id == "cucumber" })
    assertNotNull(crops.find { it.id == "tomato" })
    assertNotNull(crops.find { it.id == "capsicum" })
    assertNotNull(crops.find { it.id == "chilli" })
    assertNotNull(crops.find { it.id == "lettuce" })
  }

  @Test
  fun `systems guide contains all six core hydroponic methods`() {
    val systems = SystemsData.getSystemsList()
    assertEquals(6, systems.size)
    assertNotNull(systems.find { it.id == "nft" })
    assertNotNull(systems.find { it.id == "dutch_bucket" })
    assertNotNull(systems.find { it.id == "dwc" })
    assertNotNull(systems.find { it.id == "ebb_flow" })
    assertNotNull(systems.find { it.id == "drip" })
    assertNotNull(systems.find { it.id == "aeroponics" })
  }
}
