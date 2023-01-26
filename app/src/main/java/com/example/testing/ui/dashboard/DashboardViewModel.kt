package com.example.testing.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testing.R
import com.example.testing.model.datamodel.FavouriteRecord
import com.example.testing.model.datamodel.Record
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DashboardViewModel : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "This is dashboard Fragment"
//    }
//    val text: LiveData<String> = _text
private var RecordList: MutableLiveData<List<Record>> = MutableLiveData()

    fun getAllRecords(): LiveData<List<Record>>{
        viewModelScope.launch(Dispatchers.IO ){
            val records = arrayListOf<Record>()
            for(i in 0..10){
                records.add(Record(R.drawable.user, "DSU Student-"+i, "Hello this is Des" ))
                RecordList.postValue(records)
            }
        }
        return RecordList;
    }

}