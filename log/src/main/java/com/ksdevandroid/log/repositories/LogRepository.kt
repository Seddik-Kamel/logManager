package com.ksdevandroid.log.repositories

import androidx.annotation.WorkerThread
import com.ksdevandroid.log.dao.LogDao
import com.ksdevandroid.log.entities.LogEntity
import kotlinx.coroutines.flow.Flow

class LogRepository(private val logDao: LogDao) {

    val allLogs: Flow<List<LogEntity>> = logDao.getAlphabetizedLog();

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertLog(logEntity: LogEntity){
        logDao.insert(logEntity)
    }
}