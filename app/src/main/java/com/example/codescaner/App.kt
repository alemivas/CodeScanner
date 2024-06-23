package com.example.codescaner

import android.app.Application
import com.example.codescaner.data.MainDB

class App: Application() {
    val database by lazy { MainDB.createDataBase(this) }
}