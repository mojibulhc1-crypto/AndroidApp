package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Healing
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.DiagnosticsData
import com.example.model.PlantIssue
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
fun DoctorDiagnosisScreen(
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }

    val filteredIssues = DiagnosticsData.allIssues.filter {
        it.name.contains(searchQuery, ignoreCase = true) ||
                it.hindiName.contains(searchQuery, ignoreCase = true) ||
                it.visualSymptom.contains(searchQuery, ignoreCase = true) ||
                it.hindiVisualSymptom.contains(searchQuery, ignoreCase = true) ||
                it.primaryCause.contains(searchQuery, ignoreCase = true)
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("doctor_diagnosis_screen"),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Text(
                text = tr("🩺 Plant Doctor & Disease Diagnosis", "🩺 উদ্ভিদ বিশেষজ্ঞ চিকিৎসক আৰু ৰোগ নিৰ্ণয়", lang),
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = tr(
                    "Identify yellow leaves, blossom end rot, burnt tips, and root diseases with proven cures.",
                    "হালধীয়া পাত, পচি যোৱা ফল, পাতৰ আগ ক'লা পৰা আৰু শিপাৰ ৰোগৰ চিনাক্তকৰণ তথা নিদান।",
                    lang
                ),
                style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { Text(tr("Search symptom (e.g. yellow, root, rot, curl)", "লক্ষণ সন্ধান কৰক (যেনে হালধীয়া, শিপা, দাগ)", lang)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search"
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("search_symptoms_input")
            )
        }

        items(filteredIssues) { issue ->
            IssueCard(issue = issue, lang = lang)
        }
    }
}

@Composable
fun IssueCard(
    issue: PlantIssue,
    lang: AppLanguage
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("issue_card_${issue.id}")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Warning,
                    contentDescription = "Warning",
                    tint = FruitTomatoRed,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = tr(issue.name, issue.hindiName, lang),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    )
                    Text(
                        text = issue.category,
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = FruitTomatoRed,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
                Icon(
                    imageVector = if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                    contentDescription = "Expand",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Visual Symptom
            Text(
                text = tr("🔍 Symptom: ", "🔍 প্ৰধান লক্ষণ: ", lang) + tr(issue.visualSymptom, issue.hindiVisualSymptom, lang),
                style = MaterialTheme.typography.bodyMedium.copy(
                    lineHeight = 20.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )

            AnimatedVisibility(visible = expanded) {
                Column(modifier = Modifier.padding(top = 12.dp)) {
                    // Primary Cause
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = Color(0xFFFFF3E0),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = tr("⚡ Primary Cause:", "⚡ মূল কাৰণ:", lang),
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFE65100)
                                )
                            )
                            Spacer(modifier = Modifier.height(3.dp))
                            Text(
                                text = tr(issue.primaryCause, issue.hindiPrimaryCause, lang),
                                style = MaterialTheme.typography.bodySmall.copy(lineHeight = 18.sp, color = Color(0xFFE65100))
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Immediate Fix
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = HydroMint,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = tr("💊 Immediate Cure & Action:", "💊 তাৎক্ষণিক প্ৰতিকাৰ আৰু চিকিৎসা:", lang),
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = HydroGreenDark
                                )
                            )
                            Spacer(modifier = Modifier.height(3.dp))
                            Text(
                                text = tr(issue.immediateFix, issue.hindiImmediateFix, lang),
                                style = MaterialTheme.typography.bodySmall.copy(lineHeight = 18.sp, color = HydroGreenDark)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Prevention
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = HydroWaterSoft,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = tr("🛡️ Long-term Prevention:", "🛡️ স্থায়ী প্ৰতিৰোধৰ উপায়:", lang),
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = HydroWaterTeal
                                )
                            )
                            Spacer(modifier = Modifier.height(3.dp))
                            Text(
                                text = tr(issue.preventionTip, issue.hindiPreventionTip, lang),
                                style = MaterialTheme.typography.bodySmall.copy(lineHeight = 18.sp, color = HydroWaterTeal)
                            )
                        }
                    }
                }
            }
        }
    }
}
