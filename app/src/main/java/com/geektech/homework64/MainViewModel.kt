package com.geektech.homework64

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val mList = MutableLiveData<ArrayList<String>>()
    val list = arrayListOf<String>()
    val counter = MutableLiveData<Int>()
    var count: Int = 0

    fun increment(){
        count++
        counter.value = count
        list.add("Increment")
        mList.postValue(list)
    }
    fun decrement(){
        count--
        counter.value = count
        list.add("Decrement")
        mList.postValue(list)
    }
}