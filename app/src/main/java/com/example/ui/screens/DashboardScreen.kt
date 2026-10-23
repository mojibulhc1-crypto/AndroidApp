package com.example.ui.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.Eco
import androidx.compose.material.icons.filled.Healing
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.Opacity
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Yard
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.CropsData
import com.example.model.CropCategory
import com.example.ui.components.tr
import com.example.ui.theme.FruitPepperOrange
import com.example.ui.theme.FruitTomatoRed
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenLight
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterDark
import com.example.ui.theme.HydroWaterSoft
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel

@Composable
fun DashboardScreen(
    viewModel: HydroponicsViewModel,
    lang: AppLanguage,
    onNavigate: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("dashboard_screen"),
        contentPadding = PaddingValues(bottom = 32.dp)
    ) {
        // Hero Banner
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hero_hydroponic_farm_1790677972686),
                    contentDescription = "Hydroponic Farm",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                // Gradient scrim
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    HydroGreenDark.copy(alpha = 0.85f),
                                    HydroGreenDark
                                )
                            )
                        )
                )
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(16.dp)
                ) {
                    Surface(
                        color = HydroGreenLight,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = tr("A to Z Hydroponic Master Guide", "A to Z সম্পূৰ্ণ হাইড্ৰ'পনিক পথপ্ৰদৰ্শক", lang),
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            ),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = tr("Assam Hydroponic Grow", "অসম হাইড্ৰ'পনিক গ্ৰ' (Assam Hydroponic Grow)", lang),
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White
                        )
                    )
                    Text(
                        text = tr(
                            "Leafy Greens to Fruiting (Cucumber, Tomato, Capsicum, Chilli, Lai Xak)",
                            "শাক-পাচলিৰ পৰা ফল-পাচলি (তিয়ঁহ, বিলাহী, ক্যাপচিকাম, জলকীয়া আৰু লাই শাক)",
                            lang
                        ),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = HydroMint
                        )
                    )
                }
            }
        }

        // Quick Category Nav Cards
        item {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                Text(
                    text = tr("Explore Categories", "শস্যৰ বিভাগ বাছক", lang),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Leafy Greens Card
                    DashboardActionCard(
                        title = tr("Leafy Greens", "শাক-পাচলি", lang),
                        subtitle = tr("Lettuce, Palak, Dhaniya, Mint, Lai Xak", "লেটুচ, পালেং, ধনিয়া, পুদিনা, লাই শাক", lang),
                        badge = tr("NFT & DWC", "NFT আৰু DWC", lang),
                        icon = Icons.Default.Eco,
                        color = HydroGreenPrimary,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("action_leafy_greens"),
                        onClick = {
                            viewModel.filterCategory(CropCategory.LEAFY_GREEN)
                            onNavigate(AppScreen.CropsCatalog)
                        }
                    )

                    // Fruiting Crops Card
                    DashboardActionCard(
                        title = tr("Fruiting Crops", "ফল আৰু পাচলি", lang),
                        subtitle = tr("Cucumber, Tomato, Capsicum, Chilli", "তিয়ঁহ, বিলাহী, ক্যাপচিকাম, জলকীয়া", lang),
                        badge = tr("Dutch Bucket", "ডাট্চ বাকেট", lang),
                        icon = Icons.Default.LocalFlorist,
                        color = FruitTomatoRed,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("action_fruiting_crops"),
                        onClick = {
                            viewModel.filterCategory(CropCategory.FRUITING_CROP)
                            onNavigate(AppScreen.CropsCatalog)
                        }
                    )
                }
            }
        }

        // Fast Action Grid
        item {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)) {
                Text(
                    text = tr("Core Learning & Tools", "মূল তত্ব আৰু প্ৰয়োজনীয় সঁজুলি", lang),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    QuickToolItem(
                        title = tr("Hydro Basics", "হাইড্ৰ'পনিক্স কি?", lang),
                        subtitle = tr("How it works & DO", "কাৰ্যপ্ৰণালী আৰু অক্সিজেন", lang),
                        icon = Icons.Default.Psychology,
                        tint = HydroGreenPrimary,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("nav_fundamentals"),
                        onClick = { onNavigate(AppScreen.Fundamentals) }
                    )
                    QuickToolItem(
                        title = tr("6 Systems", "৬ টা প্ৰধান পদ্ধতি", lang),
                        subtitle = tr("NFT, Dutch Bucket, DWC", "NFT, ডাট্চ বাকেট, DWC", lang),
                        icon = Icons.Default.Settings,
                        tint = HydroWaterTeal,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("nav_systems"),
                        onClick = { onNavigate(AppScreen.SystemsList) }
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    QuickToolItem(
                        title = tr("Calculators", "সাৰৰ কেলকুলেটৰ", lang),
                        subtitle = tr("EC/PPM, Dosage, Tank L", "EC/PPM আৰু পানীৰ পৰিমাণ", lang),
                        icon = Icons.Default.Calculate,
                        tint = FruitPepperOrange,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("nav_calculators"),
                        onClick = { onNavigate(AppScreen.Calculators) }
                    )
                    QuickToolItem(
                        title = tr("Doctor Diagnosis", "ৰোগ আৰু চিকিৎসা", lang),
                        subtitle = tr("Symptoms, Cure & BER", "হালধীয়া পাত, শিপা পচা", lang),
                        icon = Icons.Default.Healing,
                        tint = Color(0xFFC2185B),
                        modifier = Modifier
                            .weight(1f)
                            .testTag("nav_doctor"),
                        onClick = { onNavigate(AppScreen.DoctorDiagnosis) }
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                // My Farm Tracker Card
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = HydroWaterSoft),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onNavigate(AppScreen.MyFarm) }
                        .testTag("nav_my_farm")
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(CircleShape)
                                .background(HydroWaterTeal),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Yard,
                                contentDescription = "My Farm",
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = tr("My Hydroponic Farm Tracker", "মোৰ হাইড্ৰ'পনিক ফাৰ্ম ট্ৰেকাৰ", lang),
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = HydroWaterDark
                                )
                            )
                            Text(
                                text = tr("Track active batches, log daily pH/EC readings", "সক্ৰিয় শস্য, দৈনিক pH আৰু EC পৰীক্ষা লিপিবদ্ধ কৰক", lang),
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = HydroWaterDark.copy(alpha = 0.8f)
                                )
                            )
                        }
                        Button(
                            onClick = { onNavigate(AppScreen.MyFarm) },
                            colors = ButtonDefaults.buttonColors(containerColor = HydroWaterTeal),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(
                                text = tr("Open", "খোলক", lang),
                                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                            )
                        }
                    }
                }
            }
        }

        // Daily Golden Rule Card
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 10.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "💡",
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = tr("Assam Hydroponic Golden Rule", "অসমৰ কৃষকৰ সোণালী নিয়ম", lang),
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = HydroGreenPrimary
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = tr(
                            "\"NEVER mix concentrated Part A (Calcium Nitrate) and Part B (Masterblend / Sulfates) directly together in a cup. Doing so forms insoluble Calcium Sulfate (plaster) which falls out as white sludge and locks out both nutrients permanently. Always dissolve in the full water tank one by one! In Assam, always filter groundwater to eliminate high Iron (Fe) before adding nutrients.\"",
                            "\"কেতিয়াও Part A (কেলচিয়াম নাইট্ৰেট) আৰু Part B (NPK আৰু ছালফেট) পানীত নিমিহলোৱাকৈ একেলগে নুগুলিব! অন্যথা দুয়োটা মিলি অদ্ৰৱণীয় বগা জিপচাম গেদ হৈ সাৰ নষ্ট হৈ পৰিব। সদায় পানীৰ মূল টেংকিত প্ৰথমে Part B, তাৰ পিছত Part C আৰু শেষতহে Part A মিহলাওক! লগতে অসমৰ ভূগৰ্ভৰ পানী ব্যৱহাৰ কৰিলে আইৰণ মুক্ত কৰি ল'ব বা বৰষুণৰ পানী ব্যৱহাৰ কৰক।\"",
                            lang
                        ),
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 20.sp
                        )
                    )
                }
            }
        }

        // Featured Crops Horizontal Scroll
        item {
            Column(modifier = Modifier.padding(vertical = 10.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = tr("Featured Crops", "বিশেষ শস্যসমূহ", lang),
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    Text(
                        text = tr("View All >", "সকলো চাওক >", lang),
                        style = MaterialTheme.typography.labelLarge.copy(
                            color = HydroGreenPrimary,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.clickable {
                            viewModel.filterCategory(null)
                            onNavigate(AppScreen.CropsCatalog)
                        }
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(CropsData.allCrops) { crop ->
                        CropMiniCard(
                            crop = crop,
                            lang = lang,
                            onClick = { onNavigate(AppScreen.CropDetail(crop.id)) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DashboardActionCard(
    title: String,
    subtitle: String,
    badge: String,
    icon: ImageVector,
    color: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = color.copy(alpha = 0.08f)),
        modifier = modifier
            .clickable(onClick = onClick)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .background(color),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = title,
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                }
                Surface(
                    color = color.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = badge,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = color
                        ),
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 11.sp
                ),
                maxLines = 1
            )
        }
    }
}

@Composable
fun QuickToolItem(
    title: String,
    subtitle: String,
    icon: ImageVector,
    tint: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier.clickable(onClick = onClick)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(tint.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = tint,
                    modifier = Modifier.size(20.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.SemiBold
                    ),
                    maxLines = 1
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    ),
                    maxLines = 1
                )
            }
        }
    }
}

@Composable
fun CropMiniCard(
    crop: com.example.model.HydroponicCrop,
    lang: AppLanguage,
    onClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .width(160.dp)
            .clickable(onClick = onClick)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(
                text = crop.iconEmoji,
                fontSize = 32.sp
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = tr(crop.name, crop.hindiName, lang),
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
                maxLines = 1
            )
            Text(
                text = "EC: ${crop.ecMin}-${crop.ecMax} | pH: ${crop.phMin}-${crop.phMax}",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = HydroWaterTeal,
                    fontWeight = FontWeight.Medium,
                    fontSize = 11.sp
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Surface(
                color = if (crop.category == CropCategory.LEAFY_GREEN) HydroMint else Color(0xFFFFEBEE),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text(
                    text = crop.harvestDaysFromSeed,
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = if (crop.category == CropCategory.LEAFY_GREEN) HydroGreenDark else FruitTomatoRed,
                        fontWeight = FontWeight.SemiBold
                    ),
                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                )
            }
        }
    }
}
