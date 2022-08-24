package com.ksdevandroid.log.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ksdevandroid.log.dao.LogDao
import com.ksdevandroid.log.entities.LogEntity

@Database(entities = [LogEntity::class], version = 1, exportSchema = false)
abstract class LogRoomDatabase : RoomDatabase() {

    abstract fun logDao(): LogDao

    companion object {
        @Volatile
        private var INSTANCE: LogRoomDatabase? = null

        fun getDatabase(context: Context): LogRoomDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LogRoomDatabase::class.java,
                    "log_database"
                ).build()
                INSTANCE = instance

                instance
            }
        }
    }
}