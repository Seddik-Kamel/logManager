package com.ksdevandroid.log.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "log_table")
data class LogEntity(@PrimaryKey(autoGenerate = true) var id : Int, var name : String) {

}