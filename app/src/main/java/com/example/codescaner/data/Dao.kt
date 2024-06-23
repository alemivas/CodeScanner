package com.example.codescaner.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(codeEntity: CodeEntity)

//    @Delete
//    suspend fun deleteItem(codeEntity: CodeEntity)
//
//    @Query("SELECT * FROM code_table")
//    fun getAllItems(): Flow<List<CodeEntity>>
}