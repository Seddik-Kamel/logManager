package com.ksdevandroid.log.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ksdevandroid.log.entities.LogEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LogDao {

    @Query("SELECT * FROM log_table ORDER BY name ASC")
    fun getAlphabetizedLog(): Flow<List<LogEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(logEntity: LogEntity)
}