package com.example.khuludflag.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.khuludflag.FlagApiService
import com.example.khuludflag.FlagsApi
import com.example.khuludflag.network.DataItem
import kotlinx.coroutines.launch
import java.lang.Exception

class FlageViewModel: ViewModel() {

    val flagsInfo= MutableLiveData<List<DataItem?>?>()

    val status = MutableLiveData<String>()

        init {
            getPhotos()
        }


    private fun getPhotos(){

        viewModelScope.launch {
            try {
                flagsInfo.value = FlagsApi.retrofitService.getPhotos().data
            }

            catch (e: Exception) {
                status.value= "baaaacka ${e.message}"
            }

        }


    }

}