package com.ksdevandroid.log

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.ksdevandroid.log.entities.LogEntity
import com.ksdevandroid.log.repositories.LogRepository

class LogViewModel(logRepository: LogRepository) {

    val allLog: LiveData<List<LogEntity>> = logRepository.allLogs.asLiveData()


}