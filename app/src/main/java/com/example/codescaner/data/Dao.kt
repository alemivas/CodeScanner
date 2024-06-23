package com.example.codescaner.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.codescaner.data.NameEntity

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(nameEntity: NameEntity)

//    @Delete
//    suspend fun deleteItem(nameEntity: NameEntity)
//
//    @Query("SELECT * FROM name_table")
//    fun getAllItems(): Flow<List<NameEntity>>
}