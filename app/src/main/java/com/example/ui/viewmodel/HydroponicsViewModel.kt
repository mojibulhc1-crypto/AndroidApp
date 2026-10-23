package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.CropsData
import com.example.data.DiagnosticsData
import com.example.data.FarmRepository
import com.example.data.FundamentalsData
import com.example.data.SystemsData
import com.example.db.CropBatch
import com.example.db.HydroponicDatabase
import com.example.db.WaterLog
import com.example.model.CropCategory
import com.example.model.HydroponicCrop
import com.example.model.HydroponicSystem
import com.example.model.PlantIssue
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

enum class AppLanguage(val label: String) {
    ASSAMESE("অসমীয়া"),
    ENGLISH("English"),
    HINDI("হিন্দী / Hindi")
}

sealed class AppScreen {
    object Dashboard : AppScreen()
    object CropsCatalog : AppScreen()
    data class CropDetail(val cropId: String) : AppScreen()
    object SystemsList : AppScreen()
    data class SystemDetail(val systemId: String) : AppScreen()
    object Fundamentals : AppScreen()
    object Calculators : AppScreen()
    object MyFarm : AppScreen()
    object DoctorDiagnosis : AppScreen()
}

class HydroponicsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: FarmRepository

    init {
        val database = HydroponicDatabase.getDatabase(application)
        repository = FarmRepository(database.cropBatchDao(), database.waterLogDao())
    }

    // Language state - Default is Assamese for Assam Hydroponic Grow
    private val _language = MutableStateFlow(AppLanguage.ASSAMESE)
    val language: StateFlow<AppLanguage> = _language.asStateFlow()

    fun setLanguage(lang: AppLanguage) {
        _language.value = lang
    }

    fun toggleLanguage() {
        _language.value = when (_language.value) {
            AppLanguage.ASSAMESE -> AppLanguage.ENGLISH
            AppLanguage.ENGLISH -> AppLanguage.HINDI
            AppLanguage.HINDI -> AppLanguage.ASSAMESE
        }
    }

    // Navigation state
    private val _currentScreen = MutableStateFlow<AppScreen>(AppScreen.Dashboard)
    val currentScreen: StateFlow<AppScreen> = _currentScreen.asStateFlow()

    private val screenStack = mutableListOf<AppScreen>()

    fun navigateTo(screen: AppScreen) {
        screenStack.add(_currentScreen.value)
        _currentScreen.value = screen
    }

    fun navigateBack(): Boolean {
        if (screenStack.isNotEmpty()) {
            _currentScreen.value = screenStack.removeAt(screenStack.size - 1)
            return true
        }
        return false
    }

    // Crops filter
    private val _selectedCategory = MutableStateFlow<CropCategory?>(null)
    val selectedCategory: StateFlow<CropCategory?> = _selectedCategory.asStateFlow()

    fun filterCategory(category: CropCategory?) {
        _selectedCategory.value = category
    }

    // Room Database State
    val activeBatches: StateFlow<List<CropBatch>> = repository.activeBatches
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val harvestedBatches: StateFlow<List<CropBatch>> = repository.harvestedBatches
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Selected batch logs
    private val _selectedBatchLogs = MutableStateFlow<List<WaterLog>>(emptyList())
    val selectedBatchLogs: StateFlow<List<WaterLog>> = _selectedBatchLogs.asStateFlow()

    fun loadLogsForBatch(batchId: Long) {
        viewModelScope.launch {
            repository.getLogsForBatch(batchId).collect { logs ->
                _selectedBatchLogs.value = logs
            }
        }
    }

    fun addCropBatch(
        cropName: String,
        variety: String,
        systemType: String,
        harvestDays: Int,
        ecMin: Double,
        ecMax: Double,
        phMin: Double,
        phMax: Double,
        reservoirLiters: Double,
        notes: String
    ) {
        viewModelScope.launch {
            val batch = CropBatch(
                cropName = cropName,
                variety = variety,
                systemType = systemType,
                datePlantedMillis = System.currentTimeMillis(),
                expectedHarvestDays = harvestDays,
                currentStage = "Seedling",
                targetEcMin = ecMin,
                targetEcMax = ecMax,
                targetPhMin = phMin,
                targetPhMax = phMax,
                reservoirLiters = reservoirLiters,
                notes = notes
            )
            repository.insertBatch(batch)
        }
    }

    fun updateBatchStage(batch: CropBatch, newStage: String) {
        viewModelScope.launch {
            repository.updateBatch(batch.copy(currentStage = newStage))
        }
    }

    fun markBatchHarvested(batch: CropBatch) {
        viewModelScope.launch {
            repository.updateBatch(batch.copy(isHarvested = true, currentStage = "Harvested"))
        }
    }

    fun deleteBatch(batch: CropBatch) {
        viewModelScope.launch {
            repository.deleteBatch(batch)
        }
    }

    fun logWaterReading(
        batchId: Long,
        ec: Double,
        ph: Double,
        tempC: Double,
        waterAddedLiters: Double,
        notes: String
    ) {
        viewModelScope.launch {
            val log = WaterLog(
                batchId = batchId,
                recordedEc = ec,
                recordedPh = ph,
                waterTempC = tempC,
                waterAddedLiters = waterAddedLiters,
                notes = notes
            )
            repository.insertLog(log)
        }
    }

    // Helper finders
    fun getCropById(id: String): HydroponicCrop? = CropsData.allCrops.find { it.id == id }
    fun getSystemById(id: String): HydroponicSystem? = SystemsData.getSystemsList().find { it.id == id }
    fun getIssueById(id: String): PlantIssue? = DiagnosticsData.allIssues.find { it.id == id }
}
