package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.Eco
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Yard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import com.example.ui.components.HydroTopBar
import com.example.ui.components.tr
import com.example.ui.screens.CalculatorsScreen
import com.example.ui.screens.CropDetailScreen
import com.example.ui.screens.CropsCatalogScreen
import com.example.ui.screens.DashboardScreen
import com.example.ui.screens.DoctorDiagnosisScreen
import com.example.ui.screens.FundamentalsScreen
import com.example.ui.screens.MyFarmScreen
import com.example.ui.screens.SystemsScreen
import com.example.ui.theme.HydroGreenDark
import com.example.ui.theme.HydroGreenPrimary
import com.example.ui.theme.HydroMint
import com.example.ui.theme.HydroWaterTeal
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.AppLanguage
import com.example.ui.viewmodel.AppScreen
import com.example.ui.viewmodel.HydroponicsViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: HydroponicsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                HydroponicsApp(viewModel = viewModel)
            }
        }
    }
}

@Composable
fun HydroponicsApp(viewModel: HydroponicsViewModel) {
    val currentScreen by viewModel.currentScreen.collectAsState()
    val language by viewModel.language.collectAsState()

    // Handle back button on sub-screens
    if (currentScreen !is AppScreen.Dashboard) {
        BackHandler {
            viewModel.navigateBack()
        }
    }

    val screenTitle = when (currentScreen) {
        is AppScreen.Dashboard -> tr("Assam Hydroponic Grow", "অসম হাইড্ৰ'পনিক গ্ৰ'", "असम हाइड्रोपोनिक ग्रो", language)
        is AppScreen.CropsCatalog -> tr("Crops Catalog", "শস্য আৰু শাক-পাচলি", "फसलें व किस्में", language)
        is AppScreen.CropDetail -> {
            val crop = viewModel.getCropById((currentScreen as AppScreen.CropDetail).cropId)
            crop?.let { tr(it.name, it.hindiName, language) } ?: tr("Crop Detail", "শস্যৰ বিৱৰণ", "फसल विवरण", language)
        }
        is AppScreen.SystemsList -> tr("6 Hydro Systems", "৬ টা হাইড্ৰ'পনিক ব্যৱস্থা", "6 हाइड्रोपोनिक सिस्टम", language)
        is AppScreen.SystemDetail -> tr("System Blueprint", "পদ্ধতিৰ সম্পূৰ্ণ ব্লুপ্ৰিণ্ট", "सिस्टम का ढांचा", language)
        is AppScreen.Fundamentals -> tr("Hydro Fundamentals", "হাইড্ৰ'পনিক্সৰ মূল বিজ্ঞান", "मूल सिद्धांत व विज्ञान", language)
        is AppScreen.Calculators -> tr("Hydro Calculators", "সাৰ আৰু পানীৰ কেলকুলেটৰ", "कैलकुलेटर व टूल्स", language)
        is AppScreen.MyFarm -> tr("My Farm Batches", "মোৰ ফাৰ্ম ট্ৰেকাৰ", "मेरा फार्म ट्रैकर", language)
        is AppScreen.DoctorDiagnosis -> tr("Plant Doctor", "উদ্ভিদ ৰোগ নিৰ্ণয় ডাক্তৰ", "रोग निदान डॉक्टर", language)
    }

    val subtitle = when (currentScreen) {
        is AppScreen.Dashboard -> tr("A to Z Assam Farming Guide", "অসমৰ বাবে A to Z কৃষি নিৰ্দেশনা", "असम A to Z संपूर्ण मार्गदर्शिका", language)
        is AppScreen.CropDetail -> tr("Complete Stage-by-Stage Protocol", "বীজৰ পৰা চপোৱালৈকে সম্পূৰ্ণ পদ্ধতি", "शुरुआत से कटाई तक पूरी विधि", language)
        else -> null
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            HydroTopBar(
                title = screenTitle,
                subtitle = subtitle,
                showBackButton = currentScreen !is AppScreen.Dashboard,
                onBackClick = { viewModel.navigateBack() },
                currentLang = language,
                onToggleLang = { viewModel.toggleLanguage() }
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                modifier = Modifier.testTag("bottom_nav_bar")
            ) {
                NavigationBarItem(
                    selected = currentScreen is AppScreen.Dashboard,
                    onClick = { viewModel.navigateTo(AppScreen.Dashboard) },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text(tr("Home", "গৃহ", "होम", language), fontWeight = FontWeight.SemiBold) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HydroGreenPrimary,
                        selectedTextColor = HydroGreenPrimary,
                        indicatorColor = HydroMint
                    ),
                    modifier = Modifier.testTag("nav_item_home")
                )
                NavigationBarItem(
                    selected = currentScreen is AppScreen.CropsCatalog || currentScreen is AppScreen.CropDetail,
                    onClick = { viewModel.navigateTo(AppScreen.CropsCatalog) },
                    icon = { Icon(Icons.Default.Eco, contentDescription = "Crops") },
                    label = { Text(tr("Crops", "শস্য", "फसलें", language), fontWeight = FontWeight.SemiBold) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HydroGreenPrimary,
                        selectedTextColor = HydroGreenPrimary,
                        indicatorColor = HydroMint
                    ),
                    modifier = Modifier.testTag("nav_item_crops")
                )
                NavigationBarItem(
                    selected = currentScreen is AppScreen.SystemsList,
                    onClick = { viewModel.navigateTo(AppScreen.SystemsList) },
                    icon = { Icon(Icons.Default.Settings, contentDescription = "Systems") },
                    label = { Text(tr("Systems", "পদ্ধতি", "सिस्टम", language), fontWeight = FontWeight.SemiBold) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HydroWaterTeal,
                        selectedTextColor = HydroWaterTeal,
                        indicatorColor = HydroMint
                    ),
                    modifier = Modifier.testTag("nav_item_systems")
                )
                NavigationBarItem(
                    selected = currentScreen is AppScreen.Calculators,
                    onClick = { viewModel.navigateTo(AppScreen.Calculators) },
                    icon = { Icon(Icons.Default.Calculate, contentDescription = "Calculators") },
                    label = { Text(tr("Calculator", "গণক", language), fontWeight = FontWeight.SemiBold) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HydroGreenPrimary,
                        selectedTextColor = HydroGreenPrimary,
                        indicatorColor = HydroMint
                    ),
                    modifier = Modifier.testTag("nav_item_calc")
                )
                NavigationBarItem(
                    selected = currentScreen is AppScreen.MyFarm,
                    onClick = { viewModel.navigateTo(AppScreen.MyFarm) },
                    icon = { Icon(Icons.Default.Yard, contentDescription = "My Farm") },
                    label = { Text(tr("My Farm", "মোৰ ফাৰ্ম", "मेरा फार्म", language), fontWeight = FontWeight.SemiBold) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = HydroGreenPrimary,
                        selectedTextColor = HydroGreenPrimary,
                        indicatorColor = HydroMint
                    ),
                    modifier = Modifier.testTag("nav_item_farm")
                )
            }
        }
    ) { innerPadding ->
        when (val screen = currentScreen) {
            is AppScreen.Dashboard -> {
                DashboardScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.CropsCatalog -> {
                CropsCatalogScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.CropDetail -> {
                val crop = viewModel.getCropById(screen.cropId)
                if (crop != null) {
                    CropDetailScreen(
                        crop = crop,
                        viewModel = viewModel,
                        lang = language,
                        onNavigate = { viewModel.navigateTo(it) },
                        modifier = Modifier.padding(innerPadding)
                    )
                } else {
                    CropsCatalogScreen(
                        viewModel = viewModel,
                        lang = language,
                        onNavigate = { viewModel.navigateTo(it) },
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
            is AppScreen.SystemsList -> {
                SystemsScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.SystemDetail -> {
                SystemsScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.Fundamentals -> {
                FundamentalsScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.Calculators -> {
                CalculatorsScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.DoctorDiagnosis -> {
                DoctorDiagnosisScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
            is AppScreen.MyFarm -> {
                MyFarmScreen(
                    viewModel = viewModel,
                    lang = language,
                    onNavigate = { viewModel.navigateTo(it) },
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}
