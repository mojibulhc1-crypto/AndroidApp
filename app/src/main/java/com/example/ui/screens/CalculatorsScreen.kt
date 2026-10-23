package com.example.ui.screens

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.tr
import com.example.ui.theme.FruitPepperOrange
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterSoft
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel
import java.util.Locale

@Composable
fun CalculatorsScreen(
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    // Calculator 1: EC <-> PPM
    var ecInput by remember { mutableStateOf("1.8") }
    val ecVal = ecInput.toDoubleOrNull() ?: 0.0
    val ppm500 = (ecVal * 500).toInt()
    val ppm700 = (ecVal * 700).toInt()

    // Calculator 2: EC Dose Estimator
    var currentEcInput by remember { mutableStateOf("1.2") }
    var targetEcInput by remember { mutableStateOf("2.2") }
    var tankLitersInput by remember { mutableStateOf("50") }

    val currentEc = currentEcInput.toDoubleOrNull() ?: 0.0
    val targetEc = targetEcInput.toDoubleOrNull() ?: 0.0
    val tankLiters = tankLitersInput.toDoubleOrNull() ?: 0.0

    val deltaEc = (targetEc - currentEc).coerceAtLeast(0.0)
    // Standard rule: 1.0 mS/cm EC in 100L requires ~60g Part A, ~60g Part B, ~30g Part C
    val partBNeeded = String.format(Locale.US, "%.1f", (deltaEc * 0.6 * tankLiters))
    val partANeeded = String.format(Locale.US, "%.1f", (deltaEc * 0.6 * tankLiters))
    val partCNeeded = String.format(Locale.US, "%.1f", (deltaEc * 0.3 * tankLiters))

    // Calculator 3: Tank Volume
    var lengthCm by remember { mutableStateOf("60") }
    var widthCm by remember { mutableStateOf("40") }
    var heightCm by remember { mutableStateOf("30") }

    val length = lengthCm.toDoubleOrNull() ?: 0.0
    val width = widthCm.toDoubleOrNull() ?: 0.0
    val height = heightCm.toDoubleOrNull() ?: 0.0

    val totalLiters = (length * width * height) / 1000.0
    val usableLiters = totalLiters * 0.85
    val gallons = usableLiters * 0.264172

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("calculators_screen"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = tr("Hydroponic Calculators & Tools", "হাইড্ৰ'পনিক কেলকুলেটৰ আৰু সঁজুলি", lang),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = tr(
                    "Precision nutrient dosing, EC to PPM conversions, and tank volume calculations.",
                    "সাৰৰ সঠিক পৰিমাণ, EC ৰ পৰা PPM ৰূপান্তৰ আৰু পানীৰ টেংকিৰ আয়তন গণনা।",
                    lang
                ),
                style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
            )
        }

        // TOOL 1: EC Dose Booster
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = tr("⚖️ Nutrient Stock & EC Dose Calculator", "⚖️ সাৰৰ মাত্ৰা আৰু EC বৃদ্ধিৰ কেলকুলেটৰ", lang),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = HydroGreenPrimary
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = tr(
                            "Calculate the exact grams of dry nutrients needed to boost your reservoir to target EC.",
                            "টেংকিত সাৰৰ মাত্ৰা (EC) লক্ষ্য অনুসৰি বঢ়াবলৈ কিমান গ্ৰাম Part A, B আৰু C লাগিব, সঠিকভাৱে গণক।",
                            lang
                        ),
                        style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = currentEcInput,
                            onValueChange = { currentEcInput = it },
                            label = { Text(tr("Current EC", "বৰ্তমান EC", lang)) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                            modifier = Modifier
                                .weight(1f)
                                .testTag("input_current_ec")
                        )
                        OutlinedTextField(
                            value = targetEcInput,
                            onValueChange = { targetEcInput = it },
                            label = { Text(tr("Target EC", "লক্ষ্য EC", lang)) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                            modifier = Modifier
                                .weight(1f)
                                .testTag("input_target_ec")
                        )
                        OutlinedTextField(
                            value = tankLitersInput,
                            onValueChange = { tankLitersInput = it },
                            label = { Text(tr("Tank Liters", "টেংকিৰ পানী (L)", lang)) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            modifier = Modifier
                                .weight(1f)
                                .testTag("input_tank_liters")
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Calculation Results
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = HydroMint,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Text(
                                text = tr("Exact Nutrients to Add:", "টেংকিত যোগ কৰিবলগীয়া সঠিক সাৰৰ পৰিমাণ:", lang),
                                style = MaterialTheme.typography.labelLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = HydroGreenDark
                                )
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceAround
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text("Part B (NPK)", style = MaterialTheme.typography.labelSmall.copy(color = HydroGreenDark))
                                    Text("$partBNeeded g", style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = HydroGreenPrimary))
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text("Part C (Epsom)", style = MaterialTheme.typography.labelSmall.copy(color = HydroGreenDark))
                                    Text("$partCNeeded g", style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = HydroWaterTeal))
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text("Part A (Calcium)", style = MaterialTheme.typography.labelSmall.copy(color = HydroGreenDark))
                                    Text("$partANeeded g", style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = Color(0xFFC2185B)))
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = tr(
                                    "Dissolve Part B first, then Part C. Add Part A LAST in diluted water!",
                                    "প্ৰথমে পানীত Part B গুলক, তাৰ পিছত Part C। শেষতহে পাতল পানীত Part A মিহলাওক!",
                                    lang
                                ),
                                style = MaterialTheme.typography.bodySmall.copy(
                                    fontSize = 11.sp,
                                    color = HydroGreenDark,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }
                }
            }
        }

        // TOOL 2: EC to PPM Converter
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = tr("🔄 EC to PPM Converter", "🔄 EC ৰ পৰা PPM (TDS) ৰূপান্তৰক", lang),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = HydroWaterTeal
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = tr(
                            "Enter EC in mS/cm to see equivalent TDS on both 500 (USA/Hanna) and 700 (Eutech) scales.",
                            "EC মাত্ৰা লিখক আৰু ৫০০ তথা ৭০০ স্কেলত সমতুল্য PPM মান চাওক।",
                            lang
                        ),
                        style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = ecInput,
                        onValueChange = { ecInput = it },
                        label = { Text("EC (mS/cm)") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("input_ec_converter")
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = HydroWaterSoft,
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                modifier = Modifier.padding(12.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "500 Scale (Hanna/USA)",
                                    style = MaterialTheme.typography.labelSmall.copy(color = HydroWaterTeal)
                                )
                                Text(
                                    text = "$ppm500 PPM",
                                    style = MaterialTheme.typography.titleLarge.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = HydroWaterTeal
                                    )
                                )
                            }
                        }

                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = Color(0xFFEDE7F6),
                            modifier = Modifier.weight(1f)
                        ) {
                            Column(
                                modifier = Modifier.padding(12.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "700 Scale (Truncheon/UK)",
                                    style = MaterialTheme.typography.labelSmall.copy(color = Color(0xFF5E35B1))
                                )
                                Text(
                                    text = "$ppm700 PPM",
                                    style = MaterialTheme.typography.titleLarge.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF5E35B1)
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }

        // TOOL 3: Tank Volume Calculator
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = tr("📐 Reservoir Tank Volume Calculator", "📐 পানীৰ টেংকিৰ আয়তন গণনা কেলকুলেটৰ", lang),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = FruitPepperOrange
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = tr(
                            "Enter reservoir dimensions in cm to calculate exact water capacity in liters and gallons.",
                            "চেণ্টিমিটাৰত (cm) দীঘ, প্ৰস্থ আৰু উচ্চতা লিখি টেংকিৰ সঠিক লিটাৰ ক্ষমতা জানক।",
                            lang
                        ),
                        style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = lengthCm,
                            onValueChange = { lengthCm = it },
                            label = { Text(tr("Length (cm)", "দীঘ (cm)", lang)) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            modifier = Modifier.weight(1f)
                        )
                        OutlinedTextField(
                            value = widthCm,
                            onValueChange = { widthCm = it },
                            label = { Text(tr("Width (cm)", "প্ৰস্থ (cm)", lang)) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            modifier = Modifier.weight(1f)
                        )
                        OutlinedTextField(
                            value = heightCm,
                            onValueChange = { heightCm = it },
                            label = { Text(tr("Height (cm)", "উচ্চতা (cm)", lang)) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = Color(0xFFFFF3E0),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = tr("Total Capacity", "মুঠ ক্ষমতা", lang),
                                    style = MaterialTheme.typography.labelSmall.copy(color = FruitPepperOrange)
                                )
                                Text(
                                    text = String.format(Locale.US, "%.1f L", totalLiters),
                                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = FruitPepperOrange)
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = tr("Safe Working Fill (85%)", "সুৰক্ষিত কাৰ্যকৰী পানী (৮৫%)", lang),
                                    style = MaterialTheme.typography.labelSmall.copy(color = FruitPepperOrange)
                                )
                                Text(
                                    text = String.format(Locale.US, "%.1f L", usableLiters),
                                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = FruitPepperOrange)
                                )
                            }
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = tr("US Gallons", "গেলন (Gal)", lang),
                                    style = MaterialTheme.typography.labelSmall.copy(color = FruitPepperOrange)
                                )
                                Text(
                                    text = String.format(Locale.US, "%.1f Gal", gallons),
                                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold, color = FruitPepperOrange)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
