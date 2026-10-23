package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.SystemsData
import com.example.model.HydroponicSystem
import com.example.ui.components.StepCard
import com.example.ui.components.tr
import com.example.ui.theme.FruitTomatoRed
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterSoft
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel

@Composable
fun SystemsScreen(
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    val systems = remember { SystemsData.getSystemsList() }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("systems_screen"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Text(
                text = tr("The 6 Core Hydroponic Systems", "৬ টা প্ৰধান হাইড্ৰ'পনিক পদ্ধতি", lang),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = tr(
                    "Detailed blueprints, specs, equipment checklists, and DIY instructions for each method.",
                    "প্ৰতিটো পদ্ধতিৰ কাৰ্যপ্ৰণালী, সামগ্ৰীৰ তালিকা, লাভ-লোকচান আৰু ঘৰতে সজাৰ কৌশল।",
                    lang
                ),
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }

        items(systems) { system ->
            SystemExpandableCard(
                system = system,
                lang = lang
            )
        }
    }
}

@Composable
fun SystemExpandableCard(
    system: HydroponicSystem,
    lang: AppLanguage
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("system_card_${system.id}")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(HydroWaterTeal),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "System",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = tr(system.name, system.hindiName, lang),
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                    )
                    Text(
                        text = tr(system.tagLine, system.hindiTagLine, lang),
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = HydroGreenPrimary,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
                Icon(
                    imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = "Expand",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            // Quick Working Principle Preview
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = tr(system.workingPrinciple, system.hindiWorkingPrinciple, lang),
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface,
                    lineHeight = 20.sp
                ),
                maxLines = if (expanded) Int.MAX_VALUE else 3
            )

            // Flow rate badge
            Spacer(modifier = Modifier.height(8.dp))
            Surface(
                color = HydroWaterSoft,
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "⚙️ ${tr(system.flowRateOrSpecs, system.hindiFlowRateOrSpecs, lang)}",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = HydroGreenDark
                    ),
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }

            AnimatedVisibility(visible = expanded) {
                Column(modifier = Modifier.padding(top = 14.dp)) {
                    // Best Crops
                    Text(
                        text = tr("Best Crops for this System:", "এই পদ্ধতিৰ বাবে উপযোগী শস্যসমূহ:", lang),
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    val crops = if (lang != AppLanguage.ENGLISH) system.hindiBestCrops else system.bestCrops
                    Text(
                        text = crops.joinToString(", "),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = HydroGreenPrimary,
                            fontWeight = FontWeight.SemiBold
                        )
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // Equipment Checklist
                    Text(
                        text = tr("Equipment & Parts Needed:", "প্ৰয়োজনীয় সঁজুলি আৰু সামগ্ৰী:", lang),
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    val equipment = if (lang != AppLanguage.ENGLISH) system.hindiEquipmentRequired else system.equipmentRequired
                    equipment.forEach { eq ->
                        Row(modifier = Modifier.padding(vertical = 2.dp), verticalAlignment = Alignment.Top) {
                            Text(text = "•", color = HydroWaterTeal, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(text = eq, style = MaterialTheme.typography.bodySmall.copy(lineHeight = 18.sp))
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // DIY Build Steps
                    Text(
                        text = tr("Step-by-Step DIY Build Guide:", "নিজেই নিৰ্মাণ কৰাৰ নিৰ্দেশনা (DIY Guide):", lang),
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold, color = HydroGreenPrimary)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    val diySteps = if (lang != AppLanguage.ENGLISH) system.hindiDiyBuildSteps else system.diyBuildSteps
                    diySteps.forEachIndexed { idx, step ->
                        StepCard(
                            stepNumber = idx + 1,
                            title = tr("Step ${idx + 1}", "পদক্ষেপ ${idx + 1}", lang),
                            description = step
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Advantages & Disadvantages
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        // Advantages
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = HydroMint,
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = "Advantages",
                                        tint = HydroGreenDark,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = tr("Advantages", "সুবিধাসমূহ", lang),
                                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroGreenDark)
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                val advs = if (lang != AppLanguage.ENGLISH) system.hindiAdvantages else system.advantages
                                advs.forEach { adv ->
                                    Text(
                                        text = "+ $adv",
                                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp, color = HydroGreenDark)
                                    )
                                }
                            }
                        }

                        // Disadvantages
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = Color(0xFFFFEBEE),
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.Close,
                                        contentDescription = "Disadvantages",
                                        tint = FruitTomatoRed,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = tr("Challenges", "সচেতনতা / সীমাবদ্ধতা", lang),
                                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = FruitTomatoRed)
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                val disadvs = if (lang != AppLanguage.ENGLISH) system.hindiDisadvantages else system.disadvantages
                                disadvs.forEach { dis ->
                                    Text(
                                        text = "- $dis",
                                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp, color = FruitTomatoRed)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
