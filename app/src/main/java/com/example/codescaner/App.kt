package com.example.codescaner

import android.app.Application
import com.example.codescaner.data.MainDB
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App: Application() {
//    val database by lazy { MainDB.createDataBase(this) }
}