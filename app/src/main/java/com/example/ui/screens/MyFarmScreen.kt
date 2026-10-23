package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Opacity
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
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
import com.example.db.CropBatch
import com.example.db.WaterLog
import com.example.ui.components.tr
import com.example.ui.theme.FruitTomatoRed
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenLight
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterSoft
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun MyFarmScreen(
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    val activeBatches by viewModel.activeBatches.collectAsState()
    val harvestedBatches by viewModel.harvestedBatches.collectAsState()

    var showAddDialog by remember { mutableStateOf(false) }
    var batchForLogging by remember { mutableStateOf<CropBatch?>(null) }

    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .testTag("my_farm_screen"),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 88.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = tr("My Hydroponic Farm", "মোৰ হাইড্ৰ'পনিক ফাৰ্ম", lang),
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontWeight = FontWeight.ExtraBold,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        )
                        Text(
                            text = tr(
                                "Track growth stages, log daily pH & EC, record water refills.",
                                "শস্যৰ বৃদ্ধিৰ পৰ্যায়, দৈনিক pH আৰু EC ৰিডিং পৰীক্ষা কৰি ৰাখক।",
                                lang
                            ),
                            style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                    }
                }
            }

            if (activeBatches.isEmpty()) {
                item {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "🌱", fontSize = 48.sp)
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = tr("No Active Batches Yet", "বৰ্তমান কোনো সক্ৰিয় শস্য নাই", lang),
                                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = tr(
                                    "Tap '+ Add New Batch' or browse crops to start your first hydroponic crop!",
                                    "নতুন খেতি আৰম্ভ কৰিবলৈ তলৰ '+' বুটাম টিপক বা শস্য তালিকা বাছক!",
                                    lang
                                ),
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    lineHeight = 18.sp
                                )
                            )
                            Spacer(modifier = Modifier.height(14.dp))
                            Button(
                                onClick = { showAddDialog = true },
                                colors = ButtonDefaults.buttonColors(containerColor = HydroGreenPrimary),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(tr("+ Add First Crop", "+ প্ৰথম শস্য আৰম্ভ কৰক", lang))
                            }
                        }
                    }
                }
            } else {
                items(activeBatches) { batch ->
                    BatchItemCard(
                        batch = batch,
                        viewModel = viewModel,
                        lang = lang,
                        onLogClick = { batchForLogging = batch }
                    )
                }
            }

            if (harvestedBatches.isNotEmpty()) {
                item {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = tr("Harvested Batches (${harvestedBatches.size})", "চপোৱা সমাপ্ত হোৱা শস্যসমূহ (${harvestedBatches.size})", lang),
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                    )
                }

                items(harvestedBatches) { batch ->
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.8f)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "Harvested",
                                tint = HydroGreenPrimary
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = batch.cropName,
                                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                                )
                                Text(
                                    text = "${batch.variety} • ${batch.systemType}",
                                    style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                                )
                            }
                            IconButton(onClick = { viewModel.deleteBatch(batch) }) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Delete",
                                    tint = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    }
                }
            }
        }

        // FAB to add batch
        FloatingActionButton(
            onClick = { showAddDialog = true },
            containerColor = HydroGreenPrimary,
            contentColor = Color.White,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp)
                .testTag("fab_add_batch")
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add Batch")
        }

        // Dialogs
        if (showAddDialog) {
            AddBatchDialog(
                lang = lang,
                onDismiss = { showAddDialog = false },
                onConfirm = { name, variety, system, days, ecMin, ecMax, phMin, phMax, liters, notes ->
                    viewModel.addCropBatch(name, variety, system, days, ecMin, ecMax, phMin, phMax, liters, notes)
                    showAddDialog = false
                }
            )
        }

        if (batchForLogging != null) {
            LogWaterDialog(
                batch = batchForLogging!!,
                lang = lang,
                onDismiss = { batchForLogging = null },
                onConfirm = { ec, ph, temp, waterAdded, notes ->
                    viewModel.logWaterReading(batchForLogging!!.id, ec, ph, temp, waterAdded, notes)
                    batchForLogging = null
                }
            )
        }
    }
}

@Composable
fun BatchItemCard(
    batch: CropBatch,
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onLogClick: () -> Unit
) {
    var expandedLogs by remember { mutableStateOf(false) }
    val logs by viewModel.selectedBatchLogs.collectAsState()

    val daysElapsed = ((System.currentTimeMillis() - batch.datePlantedMillis) / (1000 * 60 * 60 * 24)).toInt().coerceAtLeast(1)
    val progress = (daysElapsed.toFloat() / batch.expectedHarvestDays.toFloat()).coerceIn(0f, 1f)

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("batch_card_${batch.id}")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = batch.cropName,
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                    )
                    Text(
                        text = "${batch.variety} • ${batch.systemType}",
                        style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                    )
                }

                Surface(
                    color = HydroMint,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = batch.currentStage,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = HydroGreenDark
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Progress Bar
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = tr("Day $daysElapsed of ${batch.expectedHarvestDays}", "$daysElapsed দিন (মুঠ ${batch.expectedHarvestDays})", lang),
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
                )
                Text(
                    text = "${(progress * 100).toInt()}%",
                    style = MaterialTheme.typography.labelMedium.copy(color = HydroGreenPrimary, fontWeight = FontWeight.Bold)
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            LinearProgressIndicator(
                progress = { progress },
                color = HydroGreenPrimary,
                trackColor = HydroGreenLight.copy(alpha = 0.2f),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Targets row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    color = HydroWaterSoft,
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Target EC", style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp))
                        Text("${batch.targetEcMin}-${batch.targetEcMax}", style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroWaterTeal))
                    }
                }
                Surface(
                    color = HydroMint,
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Target pH", style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp))
                        Text("${batch.targetPhMin}-${batch.targetPhMax}", style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = HydroGreenPrimary))
                    }
                }
                Surface(
                    color = Color(0xFFF3E5F5),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Tank Volume", style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp))
                        Text("${batch.reservoirLiters} L", style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold, color = Color(0xFF7B1FA2)))
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = onLogClick,
                    colors = ButtonDefaults.buttonColors(containerColor = HydroWaterTeal),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(imageVector = Icons.Default.Opacity, contentDescription = "Log", modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(tr("Log EC/pH", "EC/pH লিখক", lang), style = MaterialTheme.typography.labelMedium)
                }

                OutlinedButton(
                    onClick = {
                        expandedLogs = !expandedLogs
                        if (expandedLogs) {
                            viewModel.loadLogsForBatch(batch.id)
                        }
                    },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(imageVector = Icons.Default.History, contentDescription = "History", modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(tr("Logs History", "পুৰণি ৰেকৰ্ড", lang), style = MaterialTheme.typography.labelMedium)
                }
            }

            // Quick Stage Changer & Finish
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(
                    onClick = {
                        val stages = listOf("Seedling", "Vegetative", "Flowering", "Fruiting", "Ready to Harvest")
                        val curIdx = stages.indexOf(batch.currentStage)
                        if (curIdx < stages.size - 1) {
                            viewModel.updateBatchStage(batch, stages[curIdx + 1])
                        }
                    }
                ) {
                    Text(tr("Advance Stage >", "পৰৱৰ্তী পৰ্যায় >", lang), style = MaterialTheme.typography.labelMedium)
                }

                TextButton(
                    onClick = { viewModel.markBatchHarvested(batch) }
                ) {
                    Text(tr("Harvest Batch ✓", "চপোৱা সমাপ্ত ✓", lang), color = HydroGreenPrimary, style = MaterialTheme.typography.labelMedium)
                }
            }

            // Logs history expansion
            AnimatedVisibility(visible = expandedLogs) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                ) {
                    Text(
                        text = tr("Recent Water & Nutrient Logs:", "শেহতীয়া পানী আৰু সাৰৰ ৰেকৰ্ড:", lang),
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    if (logs.isEmpty()) {
                        Text(
                            text = tr("No logs recorded yet. Tap 'Log EC/pH' above.", "अभी कोई रिकॉर्ड नहीं है। ऊपर 'रीडिंग दर्ज करें' दबाएं।", lang),
                            style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                    } else {
                        logs.take(5).forEach { log ->
                            val dateStr = SimpleDateFormat("dd MMM, hh:mm a", Locale.getDefault()).format(Date(log.timestampMillis))
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = MaterialTheme.colorScheme.background,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 3.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(8.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column {
                                        Text(text = dateStr, style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold))
                                        if (log.notes.isNotEmpty()) {
                                            Text(text = log.notes, style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp))
                                        }
                                    }
                                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                        Text(text = "EC: ${log.recordedEc}", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = HydroWaterTeal))
                                        Text(text = "pH: ${log.recordedPh}", style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold, color = HydroGreenPrimary))
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AddBatchDialog(
    lang: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: (
        name: String,
        variety: String,
        system: String,
        harvestDays: Int,
        ecMin: Double,
        ecMax: Double,
        phMin: Double,
        phMax: Double,
        liters: Double,
        notes: String
    ) -> Unit
) {
    var cropName by remember { mutableStateOf("Tomato") }
    var variety by remember { mutableStateOf("Cherry Tomato") }
    var systemType by remember { mutableStateOf("Dutch Bucket") }
    var harvestDaysInput by remember { mutableStateOf("70") }
    var ecMinInput by remember { mutableStateOf("2.0") }
    var ecMaxInput by remember { mutableStateOf("3.0") }
    var phMinInput by remember { mutableStateOf("5.8") }
    var phMaxInput by remember { mutableStateOf("6.4") }
    var reservoirLitersInput by remember { mutableStateOf("50") }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(tr("Add Crop Batch to Farm", "नया फसल बैच शुरू करें", lang)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                OutlinedTextField(
                    value = cropName,
                    onValueChange = { cropName = it },
                    label = { Text(tr("Crop Name (e.g. Cucumber, Tomato)", "फसल का नाम (जैसे खीरा, टमाटर)", lang)) },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = variety,
                    onValueChange = { variety = it },
                    label = { Text(tr("Variety / Seed Name", "किस्म / बीज का नाम", lang)) },
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = systemType,
                    onValueChange = { systemType = it },
                    label = { Text(tr("System Type (NFT, Dutch Bucket, DWC)", "सिस्टम प्रकार (NFT, डच बकेट)", lang)) },
                    modifier = Modifier.fillMaxWidth()
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = harvestDaysInput,
                        onValueChange = { harvestDaysInput = it },
                        label = { Text("Days to Harvest") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedTextField(
                        value = reservoirLitersInput,
                        onValueChange = { reservoirLitersInput = it },
                        label = { Text("Tank Liters") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    onConfirm(
                        cropName,
                        variety,
                        systemType,
                        harvestDaysInput.toIntOrNull() ?: 60,
                        ecMinInput.toDoubleOrNull() ?: 1.8,
                        ecMaxInput.toDoubleOrNull() ?: 2.5,
                        phMinInput.toDoubleOrNull() ?: 5.8,
                        phMaxInput.toDoubleOrNull() ?: 6.2,
                        reservoirLitersInput.toDoubleOrNull() ?: 50.0,
                        ""
                    )
                },
                colors = ButtonDefaults.buttonColors(containerColor = HydroGreenPrimary)
            ) {
                Text(tr("Create Batch", "बैच शुरू करें", lang))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(tr("Cancel", "रद्द करें", lang))
            }
        }
    )
}

@Composable
fun LogWaterDialog(
    batch: CropBatch,
    lang: AppLanguage,
    onDismiss: () -> Unit,
    onConfirm: (ec: Double, ph: Double, temp: Double, waterAdded: Double, notes: String) -> Unit
) {
    var ecInput by remember { mutableStateOf("2.2") }
    var phInput by remember { mutableStateOf("6.0") }
    var tempInput by remember { mutableStateOf("21.0") }
    var waterAddedInput by remember { mutableStateOf("0.0") }
    var notesInput by remember { mutableStateOf("") }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(tr("Log Water & Nutrient Reading", "दैनिक पानी व EC/pH रीडिंग", lang)) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = "${batch.cropName} (${batch.systemType})",
                    style = MaterialTheme.typography.labelLarge.copy(color = HydroWaterTeal, fontWeight = FontWeight.Bold)
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = ecInput,
                        onValueChange = { ecInput = it },
                        label = { Text("EC (mS/cm)") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedTextField(
                        value = phInput,
                        onValueChange = { phInput = it },
                        label = { Text("pH Level") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedTextField(
                        value = tempInput,
                        onValueChange = { tempInput = it },
                        label = { Text("Water Temp °C") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedTextField(
                        value = waterAddedInput,
                        onValueChange = { waterAddedInput = it },
                        label = { Text("Refill Water (L)") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                        modifier = Modifier.weight(1f)
                    )
                }
                OutlinedTextField(
                    value = notesInput,
                    onValueChange = { notesInput = it },
                    label = { Text(tr("Notes (e.g. pruned, flowers appeared)", "नोट्स (जैसे प्रूनिंग की, फूल निकले)", lang)) },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    onConfirm(
                        ecInput.toDoubleOrNull() ?: 2.0,
                        phInput.toDoubleOrNull() ?: 6.0,
                        tempInput.toDoubleOrNull() ?: 21.0,
                        waterAddedInput.toDoubleOrNull() ?: 0.0,
                        notesInput
                    )
                },
                colors = ButtonDefaults.buttonColors(containerColor = HydroWaterTeal)
            ) {
                Text(tr("Save Reading", "सुरक्षित करें", lang))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(tr("Cancel", "रद्द करें", lang))
            }
        }
    )
}
