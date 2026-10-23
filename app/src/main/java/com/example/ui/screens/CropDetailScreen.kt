package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.ui.theme.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.CropCategory
import com.example.model.HydroponicCrop
import com.example.ui.components.InfoAlertCard
import com.example.ui.components.MetricBadge
import com.example.ui.components.StepCard
import com.example.ui.components.tr
import com.example.ui.theme.FruitPepperOrange
import com.example.ui.theme.FruitTomatoRed
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterDark
import com.example.ui.theme.HydroWaterSoft
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel

@Composable
fun CropDetailScreen(
    crop: HydroponicCrop,
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    var showAddedSnackbar by remember { mutableStateOf(false) }

    val tabTitles = listOf(
        tr("A to Z Guide", "A to Z সম্পূৰ্ণ নিৰ্দেশনা", lang),
        tr("Nutrient Recipe", "সাৰৰ ফৰ্মুলা", lang),
        tr("Pollination & Pruning", "পৰাগযোগ আৰু ডাল কটা", lang),
        tr("Troubleshooting", "সমস্যা আৰু সমাধান", lang)
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .testTag("crop_detail_screen_${crop.id}")
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentPadding = PaddingValues(bottom = 24.dp)
        ) {
            // Header Section
            item {
                Card(
                    shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = crop.iconEmoji,
                                fontSize = 44.sp
                            )
                            Spacer(modifier = Modifier.width(14.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = tr(crop.name, crop.hindiName, lang),
                                    style = MaterialTheme.typography.headlineSmall.copy(
                                        fontWeight = FontWeight.ExtraBold,
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                )
                                Text(
                                    text = crop.scientificName,
                                    style = MaterialTheme.typography.bodyMedium.copy(
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
                                        tr("Fruiting Crop", "ফল আৰু পাচলি", lang)
                                    },
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = if (crop.category == CropCategory.LEAFY_GREEN) HydroGreenDark else FruitTomatoRed
                                    ),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = tr(crop.shortOverview, crop.hindiShortOverview, lang),
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 20.sp
                            )
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        // Horizontal Metric Badges Scroll
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            item {
                                MetricBadge(
                                    label = "EC Range",
                                    value = "${crop.ecMin}-${crop.ecMax}",
                                    unit = "mS/cm",
                                    color = HydroWaterTeal
                                )
                            }
                            item {
                                MetricBadge(
                                    label = "pH Range",
                                    value = "${crop.phMin}-${crop.phMax}",
                                    color = HydroGreenPrimary
                                )
                            }
                            item {
                                MetricBadge(
                                    label = "PPM (500)",
                                    value = "${crop.ppm500Min}-${crop.ppm500Max}",
                                    unit = "ppm",
                                    color = Color(0xFF6A1B9A)
                                )
                            }
                            item {
                                MetricBadge(
                                    label = tr("Water Temp", "পানীৰ উষ্ণতা", lang),
                                    value = "${crop.idealWaterTempMin}-${crop.idealWaterTempMax}°C",
                                    color = HydroWaterTeal
                                )
                            }
                            item {
                                MetricBadge(
                                    label = tr("Harvest", "চপোৱাৰ সময়", lang),
                                    value = crop.harvestDaysFromSeed,
                                    color = FruitPepperOrange
                                )
                            }
                            item {
                                MetricBadge(
                                    label = tr("Light Hours", "পোহৰৰ সময়", lang),
                                    value = "${crop.lightHoursPerDay} hrs",
                                    color = Color(0xFFF57F17)
                                )
                            }
                        }
                    }
                }
            }

            // Recommended Systems Banner
            item {
                Card(
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = HydroWaterSoft),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 10.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = "Systems",
                                tint = HydroWaterDark,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = tr("Recommended Hydroponic Systems:", "উপযুক্ত হাইড্ৰ'পনিক পদ্ধতিসমূহ:", lang),
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = HydroWaterDark
                                )
                            )
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        val systems = if (lang != AppLanguage.ENGLISH) crop.hindiRecommendedSystems else crop.recommendedSystems
                        systems.forEach { sys ->
                            Text(
                                text = "• $sys",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = HydroWaterDark,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                        }
                    }
                }
            }

            // Tab Selector
            item {
                ScrollableTabRow(
                    selectedTabIndex = selectedTabIndex,
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = HydroGreenPrimary,
                    edgePadding = 16.dp,
                    indicator = { tabPositions ->
                        TabRowDefaults.SecondaryIndicator(
                            Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                            color = HydroGreenPrimary
                        )
                    }
                ) {
                    tabTitles.forEachIndexed { index, title ->
                        Tab(
                            selected = selectedTabIndex == index,
                            onClick = { selectedTabIndex = index },
                            text = {
                                Text(
                                    text = title,
                                    style = MaterialTheme.typography.labelLarge.copy(
                                        fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal
                                    )
                                )
                            },
                            modifier = Modifier.testTag("crop_tab_$index")
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

            // TAB CONTENT
            when (selectedTabIndex) {
                0 -> {
                    // TAB 1: A to Z Step-by-Step Guide
                    item {
                        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                            // Stage 1: Seedling
                            StageHeader(
                                stageTitle = tr("Stage 1: ${crop.seedlingGuide.stageName}", "পৰ্যায় ১: ${crop.seedlingGuide.hindiStageName}", lang),
                                duration = crop.seedlingGuide.durationDays,
                                targetEc = crop.seedlingGuide.targetEc,
                                targetPh = crop.seedlingGuide.targetPh,
                                badgeColor = HydroWaterTeal
                            )
                            val seedSteps = if (lang != AppLanguage.ENGLISH) crop.seedlingGuide.hindiInstructions else crop.seedlingGuide.instructions
                            seedSteps.forEachIndexed { idx, step ->
                                StepCard(
                                    stepNumber = idx + 1,
                                    title = tr("Step ${idx + 1}", "পদক্ষেপ ${idx + 1}", lang),
                                    description = step
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            val seedTips = if (lang != AppLanguage.ENGLISH) crop.seedlingGuide.hindiKeyTips else crop.seedlingGuide.keyTips
                            if (seedTips.isNotEmpty()) {
                                InfoAlertCard(
                                    title = tr("⚠️ Critical Nursery Tip", "⚠️ নাৰ্চাৰীৰ গুৰুত্বপূৰ্ণ পৰামৰ্শ", lang),
                                    message = seedTips.joinToString("\n• ", prefix = "• "),
                                    containerColor = Color(0xFFFFF8E1),
                                    contentColor = Color(0xFFE65100)
                                )
                            }

                            Spacer(modifier = Modifier.height(18.dp))

                            // Stage 2: Vegetative Growth
                            StageHeader(
                                stageTitle = tr("Stage 2: ${crop.vegetativeGuide.stageName}", "পৰ্যায় ২: ${crop.vegetativeGuide.hindiStageName}", lang),
                                duration = crop.vegetativeGuide.durationDays,
                                targetEc = crop.vegetativeGuide.targetEc,
                                targetPh = crop.vegetativeGuide.targetPh,
                                badgeColor = HydroGreenPrimary
                            )
                            val vegSteps = if (lang != AppLanguage.ENGLISH) crop.vegetativeGuide.hindiInstructions else crop.vegetativeGuide.instructions
                            vegSteps.forEachIndexed { idx, step ->
                                StepCard(
                                    stepNumber = idx + 1,
                                    title = tr("Step ${idx + 1}", "পদক্ষেপ ${idx + 1}", lang),
                                    description = step
                                )
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            val vegTips = if (lang != AppLanguage.ENGLISH) crop.vegetativeGuide.hindiKeyTips else crop.vegetativeGuide.keyTips
                            if (vegTips.isNotEmpty()) {
                                InfoAlertCard(
                                    title = tr("💡 Vegetative Growth Secret", "💡 বৃদ্ধিৰ মূল গোপন কৌশল", lang),
                                    message = vegTips.joinToString("\n• ", prefix = "• "),
                                    containerColor = HydroMint,
                                    contentColor = HydroGreenDark
                                )
                            }

                            // Stage 3: Fruiting (if fruiting crop)
                            if (crop.fruitingGuide != null) {
                                Spacer(modifier = Modifier.height(18.dp))
                                StageHeader(
                                    stageTitle = tr("Stage 3: ${crop.fruitingGuide.stageName}", "পৰ্যায় ৩: ${crop.fruitingGuide.hindiStageName}", lang),
                                    duration = crop.fruitingGuide.durationDays,
                                    targetEc = crop.fruitingGuide.targetEc,
                                    targetPh = crop.fruitingGuide.targetPh,
                                    badgeColor = FruitTomatoRed
                                )
                                val fruitSteps = if (lang != AppLanguage.ENGLISH) crop.fruitingGuide.hindiInstructions else crop.fruitingGuide.instructions
                                fruitSteps.forEachIndexed { idx, step ->
                                    StepCard(
                                        stepNumber = idx + 1,
                                        title = tr("Step ${idx + 1}", "পদক্ষেপ ${idx + 1}", lang),
                                        description = step
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                val fruitTips = if (lang != AppLanguage.ENGLISH) crop.fruitingGuide.hindiKeyTips else crop.fruitingGuide.keyTips
                                if (fruitTips.isNotEmpty()) {
                                    InfoAlertCard(
                                        title = tr("🌟 Maximum Yield & Flavor Formula", "🌟 সৰ্বাধিক উৎপাদন আৰু সোৱাদৰ ফৰ্মুলা", lang),
                                        message = fruitTips.joinToString("\n• ", prefix = "• "),
                                        containerColor = Color(0xFFFFEBEE),
                                        contentColor = FruitTomatoRed
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(18.dp))

                            // Harvesting Guide Card
                            Card(
                                shape = RoundedCornerShape(14.dp),
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Text(text = "✂️", fontSize = 20.sp)
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = tr("Harvesting & Post-Harvest Technique", "ফচল চপোৱা আৰু সংৰক্ষণ পদ্ধতি", lang),
                                            style = MaterialTheme.typography.titleMedium.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = HydroGreenPrimary
                                            )
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = tr(crop.harvestingGuide, crop.hindiHarvestingGuide, lang),
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            lineHeight = 20.sp
                                        )
                                    )
                                }
                            }
                        }
                    }
                }

                1 -> {
                    // TAB 2: Nutrient Recipe & Chemistry
                    item {
                        Column(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Card(
                                shape = RoundedCornerShape(14.dp),
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            imageVector = Icons.Default.Science,
                                            contentDescription = "Nutrient Recipe",
                                            tint = HydroWaterTeal
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = tr("3-Part Nutrient Recipe (Per 100L Water)", "৩-অংশীয় সাৰ মিশ্ৰণ (প্ৰতি ১০০ লিটাৰ পানীত)", lang),
                                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(12.dp))

                                    RecipeItemRow(
                                        part = "Part A",
                                        title = "Calcium Nitrate + Iron",
                                        detail = crop.nutrientRecipe.partADetails,
                                        color = HydroWaterTeal
                                    )
                                    RecipeItemRow(
                                        part = "Part B",
                                        title = "Hydroponic NPK Formula",
                                        detail = crop.nutrientRecipe.partBDetails,
                                        color = HydroGreenPrimary
                                    )
                                    RecipeItemRow(
                                        part = "Part C",
                                        title = "Epsom Salt (MgSO4)",
                                        detail = crop.nutrientRecipe.partCDetails,
                                        color = Color(0xFF6A1B9A)
                                    )
                                }
                            }

                            // Mixing order card
                            InfoAlertCard(
                                title = tr("⚡ Strict Mixing Order (Never violate!)", "⚡ সাৰ মিশ্ৰণৰ নিয়ম (কেতিয়াও উলংঘা নকৰিব!)", lang),
                                message = tr(crop.nutrientRecipe.mixingGuide, crop.nutrientRecipe.hindiMixingGuide, lang),
                                containerColor = Color(0xFFFFF3E0),
                                contentColor = Color(0xFFE65100)
                            )

                            // Flushing Schedule
                            Card(
                                shape = RoundedCornerShape(14.dp),
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        text = tr("💧 Substrate & Reservoir Flush Schedule", "💧 ৰিজাৰ্ভাৰ আৰু শিপা পৰিষ্কাৰ (ফ্লাশিং)", lang),
                                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold, color = HydroWaterTeal)
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(
                                        text = tr(crop.nutrientRecipe.flushSchedule, crop.nutrientRecipe.hindiFlushSchedule, lang),
                                        style = MaterialTheme.typography.bodyMedium.copy(lineHeight = 20.sp)
                                    )
                                }
                            }
                        }
                    }
                }

                2 -> {
                    // TAB 3: Pollination & Pruning
                    item {
                        Column(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(14.dp)
                        ) {
                            if (crop.pollinationGuide != null) {
                                Card(
                                    shape = RoundedCornerShape(14.dp),
                                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(16.dp)) {
                                        Text(
                                            text = tr("🐝 Pollination & Fruit Setting Guide", "🐝 পৰাগযোগ আৰু গুটি ধৰাৰ নিৰ্দেশনা", lang),
                                            style = MaterialTheme.typography.titleMedium.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = FruitTomatoRed
                                            )
                                        )
                                        Spacer(modifier = Modifier.height(10.dp))

                                        Text(
                                            text = tr("Flower Structure & Behavior:", "ফুলৰ গঠন আৰু ধৰণ:", lang),
                                            style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                                        )
                                        Text(
                                            text = tr(crop.pollinationGuide.flowerTypes, crop.pollinationGuide.hindiFlowerTypes, lang),
                                            style = MaterialTheme.typography.bodyMedium.copy(lineHeight = 20.sp)
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Text(
                                            text = tr("Hand Pollination Technique:", "হাতেৰে পৰাগযোগ কৰোৱাৰ কৌশল:", lang),
                                            style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold, color = HydroGreenPrimary)
                                        )
                                        Text(
                                            text = tr(crop.pollinationGuide.handPollinationTechnique, crop.pollinationGuide.hindiHandPollinationTechnique, lang),
                                            style = MaterialTheme.typography.bodyMedium.copy(lineHeight = 20.sp)
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            Surface(
                                                color = HydroMint,
                                                shape = RoundedCornerShape(8.dp),
                                                modifier = Modifier.weight(1f)
                                            ) {
                                                Column(modifier = Modifier.padding(8.dp)) {
                                                    Text(
                                                        text = tr("Best Time", "উপযুক্ত সময়", lang),
                                                        style = MaterialTheme.typography.labelSmall.copy(color = HydroGreenDark)
                                                    )
                                                    Text(
                                                        text = crop.pollinationGuide.bestTimeToPollinate,
                                                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroGreenDark)
                                                    )
                                                }
                                            }
                                            Surface(
                                                color = HydroWaterSoft,
                                                shape = RoundedCornerShape(8.dp),
                                                modifier = Modifier.weight(1f)
                                            ) {
                                                Column(modifier = Modifier.padding(8.dp)) {
                                                    Text(
                                                        text = tr("Optimal Humidity", "আৰ্দ্ৰতা", lang),
                                                        style = MaterialTheme.typography.labelSmall.copy(color = HydroWaterDark)
                                                    )
                                                    Text(
                                                        text = crop.pollinationGuide.optimalHumidityForPollen,
                                                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroWaterDark)
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if (crop.pruningGuide != null) {
                                Card(
                                    shape = RoundedCornerShape(14.dp),
                                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(16.dp)) {
                                        Text(
                                            text = tr("🌿 Pruning, De-suckering & Trellising", "🌿 ডাল কটা, অপ্ৰয়োজনীয় কুঁহি ভাঙা আৰু ট্ৰেলিচিং", lang),
                                            style = MaterialTheme.typography.titleMedium.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = HydroGreenPrimary
                                            )
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        PruningSectionItem(
                                            title = tr("Trellis & Support:", "ট্ৰেলিচ আৰু জাঁপৰ ব্যৱস্থা:", lang),
                                            desc = tr(crop.pruningGuide.trellisingMethod, crop.pruningGuide.hindiTrellisingMethod, lang)
                                        )
                                        PruningSectionItem(
                                            title = tr("Sucker / Lateral Shoot Removal:", "কাষৰ অপ্ৰয়োজনীয় শাখা (Suckers) কটা:", lang),
                                            desc = tr(crop.pruningGuide.suckeringRules, crop.pruningGuide.hindiSuckeringRules, lang)
                                        )
                                        PruningSectionItem(
                                            title = tr("Leaf Pruning & De-leafing:", "তলৰ পুৰণি পাত কটা:", lang),
                                            desc = tr(crop.pruningGuide.leafPruning, crop.pruningGuide.hindiLeafPruning, lang)
                                        )
                                        PruningSectionItem(
                                            title = tr("Topping Rules:", "ওপৰৰ আগ কটা (Topping):", lang),
                                            desc = tr(crop.pruningGuide.toppingRule, crop.pruningGuide.hindiToppingRule, lang)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                3 -> {
                    // TAB 4: Troubleshooting & Pests
                    item {
                        Column(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Text(
                                text = tr("Watch Out For These Common Issues:", "সম্ভাব্য সমস্যা আৰু ৰোগসমূহ:", lang),
                                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                            )
                            val pests = if (lang != AppLanguage.ENGLISH) crop.hindiCommonPestsAndDiseases else crop.commonPestsAndDiseases
                            pests.forEach { issue ->
                                Card(
                                    shape = RoundedCornerShape(12.dp),
                                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = Alignment.Top
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Warning,
                                            contentDescription = "Warning",
                                            tint = FruitTomatoRed,
                                            modifier = Modifier.size(20.dp)
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = issue,
                                            style = MaterialTheme.typography.bodyMedium.copy(lineHeight = 20.sp)
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Button(
                                onClick = { onNavigate(AppScreen.DoctorDiagnosis) },
                                colors = ButtonDefaults.buttonColors(containerColor = HydroWaterTeal),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = tr("Open Full Symptom Checker Doctor >", "ৰোগ নিৰ্ণয় বিশেষজ্ঞ (ডাক্তৰ) চাওক >", lang),
                                    style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                                )
                            }
                        }
                    }
                }
            }
        }

        // Bottom Action Bar to Add Batch to My Farm
        Surface(
            shadowElevation = 8.dp,
            color = MaterialTheme.colorScheme.surface,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (showAddedSnackbar) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Added",
                        tint = HydroGreenPrimary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = tr("Batch Added to My Farm!", "মোৰ ফাৰ্মত শস্য যোগ কৰা হ'ল!", lang),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = HydroGreenPrimary
                        ),
                        modifier = Modifier.weight(1f)
                    )
                } else {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = tr("Grow this in Your Farm?", "আপোনাৰ ফাৰ্মত এই খেতি কৰিবনে?", lang),
                            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                        )
                        Text(
                            text = tr("Save to active batches & track daily EC/pH", "সক্ৰিয় বেচত যোগ কৰক আৰু দৈনিক EC/pH পৰীক্ষা কৰক", lang),
                            style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                    }
                }

                Button(
                    onClick = {
                        val harvestDaysInt = crop.harvestDaysFromSeed.filter { it.isDigit() }.toIntOrNull() ?: 45
                        viewModel.addCropBatch(
                            cropName = crop.name,
                            variety = "Standard Hydroponic",
                            systemType = crop.recommendedSystems.firstOrNull() ?: "NFT",
                            harvestDays = harvestDaysInt,
                            ecMin = crop.ecMin,
                            ecMax = crop.ecMax,
                            phMin = crop.phMin,
                            phMax = crop.phMax,
                            reservoirLiters = 50.0,
                            notes = "Planted from Hydroponic Grow Guide"
                        )
                        showAddedSnackbar = true
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = HydroGreenPrimary),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.testTag("start_batch_button")
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add"
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = tr("Start Batch", "খেতি আৰম্ভ কৰক", lang),
                        style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                    )
                }
            }
        }
    }
}

@Composable
fun StageHeader(
    stageTitle: String,
    duration: String,
    targetEc: String,
    targetPh: String,
    badgeColor: Color
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = badgeColor.copy(alpha = 0.09f)),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stageTitle,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = badgeColor
                    )
                )
                Text(
                    text = "Duration: $duration",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            }
            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = "EC: $targetEc",
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = badgeColor)
                )
                Text(
                    text = "pH: $targetPh",
                    style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                )
            }
        }
    }
}

@Composable
fun RecipeItemRow(
    part: String,
    title: String,
    detail: String,
    color: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.Top
    ) {
        Surface(
            shape = RoundedCornerShape(6.dp),
            color = color,
            modifier = Modifier.width(55.dp)
        ) {
            Text(
                text = part,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.SemiBold)
            )
            Text(
                text = detail,
                style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
            )
        }
    }
}

@Composable
fun PruningSectionItem(
    title: String,
    desc: String
) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            text = desc,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 20.sp
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
    }
}
