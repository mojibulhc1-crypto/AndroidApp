package com.example.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [CropBatch::class, WaterLog::class],
    version = 1,
    exportSchema = false
)
abstract class HydroponicDatabase : RoomDatabase() {
    abstract fun cropBatchDao(): CropBatchDao
    abstract fun waterLogDao(): WaterLogDao

    companion object {
        @Volatile
        private var INSTANCE: HydroponicDatabase? = null

        fun getDatabase(context: Context): HydroponicDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    HydroponicDatabase::class.java,
                    "hydroponic_grow_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
