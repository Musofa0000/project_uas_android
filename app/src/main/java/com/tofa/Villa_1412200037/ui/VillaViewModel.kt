package com.tofa.Villa_1412200037.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.tofa.Villa_1412200037.model.Villa
import com.tofa.Villa_1412200037.repository.VillaRepository
import kotlinx.coroutines.launch

class VillaViewModel(private val repository: VillaRepository): ViewModel() {
    val AllVillas : LiveData<List<Villa>> = repository.allVillas.asLiveData()
    fun insert(villa: Villa)=viewModelScope.launch {
    repository.insertvilla(villa)
    }
    fun delete(villa: Villa)=viewModelScope.launch {
    repository.deletevilla(villa)
    }
    fun update(villa: Villa)=viewModelScope.launch {
    repository.updatevilla(villa)
    }
}

class VillaViewModelFactory(private val repository: VillaRepository):ViewModelProvider.Factory{
    override fun <V : ViewModel> create(modelClass: Class<V>): V {
        if(modelClass.isAssignableFrom((VillaViewModel::class.java))){
       return VillaViewModel(repository) as V
      }
        throw IllegalArgumentException("unknown ViewModel class")
    }
}