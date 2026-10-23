package com.example.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CropsData
import com.example.model.CropCategory
import com.example.model.HydroponicCrop
import com.example.ui.components.tr
import com.example.ui.theme.FruitTomatoRed
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel

@Composable
fun CropsCatalogScreen(
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    val selectedCategory by viewModel.selectedCategory.collectAsState()

    val filteredCrops = if (selectedCategory == null) {
        CropsData.allCrops
    } else {
        CropsData.allCrops.filter { it.category == selectedCategory }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .testTag("crops_catalog_screen")
    ) {
        // Filter Chips Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                selected = selectedCategory == null,
                onClick = { viewModel.filterCategory(null) },
                label = { Text(tr("All Crops (${CropsData.allCrops.size})", "সকলো শস্য (${CropsData.allCrops.size})", lang)) },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = HydroGreenPrimary,
                    selectedLabelColor = Color.White
                ),
                modifier = Modifier.testTag("filter_all_crops")
            )
            FilterChip(
                selected = selectedCategory == CropCategory.LEAFY_GREEN,
                onClick = { viewModel.filterCategory(CropCategory.LEAFY_GREEN) },
                label = { Text(tr("🥬 Leafy Greens", "🥬 শাক-পাচলি", lang)) },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = HydroGreenPrimary,
                    selectedLabelColor = Color.White
                ),
                modifier = Modifier.testTag("filter_leafy_greens")
            )
            FilterChip(
                selected = selectedCategory == CropCategory.FRUITING_CROP,
                onClick = { viewModel.filterCategory(CropCategory.FRUITING_CROP) },
                label = { Text(tr("🍅 Fruiting", "🍅 ফল আৰু পাচলি", lang)) },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = FruitTomatoRed,
                    selectedLabelColor = Color.White
                ),
                modifier = Modifier.testTag("filter_fruiting_crops")
            )
        }

        // Crops List
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(filteredCrops) { crop ->
                CropListItem(
                    crop = crop,
                    lang = lang,
                    onClick = { onNavigate(AppScreen.CropDetail(crop.id)) }
                )
            }
        }
    }
}

@Composable
fun CropListItem(
    crop: HydroponicCrop,
    lang: AppLanguage,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .testTag("crop_item_${crop.id}")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = crop.iconEmoji,
                    fontSize = 36.sp
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = tr(crop.name, crop.hindiName, lang),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Text(
                        text = crop.scientificName,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                        )
                    )
                }
                Surface(
                    color = if (crop.category == CropCategory.LEAFY_GREEN) HydroMint else Color(0xFFFFEBEE),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = if (crop.category == CropCategory.LEAFY_GREEN) {
                            tr("Leafy Green", "শাক-পাচলি", lang)
                        } else {
                            tr("Fruiting", "ফল-পাচলি", lang)
                        },
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = if (crop.category == CropCategory.LEAFY_GREEN) HydroGreenDark else FruitTomatoRed
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = tr(crop.shortOverview, crop.hindiShortOverview, lang),
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 18.sp
                ),
                maxLines = 2
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Parameter badges row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = HydroWaterTeal.copy(alpha = 0.1f),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "EC Range",
                            style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Text(
                            text = "${crop.ecMin} - ${crop.ecMax}",
                            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroWaterTeal)
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = HydroGreenPrimary.copy(alpha = 0.1f),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "pH Window",
                            style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Text(
                            text = "${crop.phMin} - ${crop.phMax}",
                            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroGreenPrimary)
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = Color(0xFFEF6C00).copy(alpha = 0.1f),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(vertical = 6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = tr("Harvest", "চপোৱাৰ সময়", lang),
                            style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Text(
                            text = crop.harvestDaysFromSeed,
                            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = Color(0xFFEF6C00))
                        )
                    }
                }
            }
        }
    }
}
