package com.example.codescaner.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "code_table")
data class CodeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val code: String
)