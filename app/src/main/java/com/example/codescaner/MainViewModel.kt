package com.example.codescaner

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.codescaner.data.MainDB
import com.example.codescaner.data.CodeEntity
import kotlinx.coroutines.launch

class MainViewModel(val database: MainDB): ViewModel() {

//    val itemsList = database.dao.getAllItems()
//    val newText = mutableStateOf("")
//    var codeEntity: CodeEntity? = null

//    fun insertItem() = viewModelScope.launch {
//        val nameItem = codeEntity?.copy(name = newText.value)
//            ?: CodeEntity(name = newText.value)
//        database.dao.insertItem(nameItem)
//        codeEntity = null
//        newText.value = ""
//    }
//    fun insertItem() = viewModelScope.launch {
//        val nameItem = CodeEntity(name = "ghgfhfgh")
//        database.dao.insertItem(nameItem)
//        codeEntity = null
//        newText.value = ""
//    }

//    fun deleteItem(item: CodeEntity) = viewModelScope.launch {
//        database.dao.deleteItem(item)
//    }

//    companion object{
//        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory{
//            @Suppress("UNCHECKED_CAST")
//            override fun <T : ViewModel> create(
//                modelClass: Class<T>,
//                extras: CreationExtras): T {
//                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
//                return MainViewModel(database) as T
//            }
//        }
//    }
}