package com.example.codescaner.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [CodeEntity::class],
    version = 1
)
abstract class MainDB : RoomDatabase() {

    abstract val dao: Dao

//    companion object{
//        fun createDataBase(context: Context): MainDB {
//            return Room.databaseBuilder(
//                context,
//                MainDB::class.java,
//                "codescanner.db"
//            ).build()
//        }
//    }

}