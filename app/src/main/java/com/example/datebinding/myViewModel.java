package com.example.datebinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class myViewModel extends ViewModel {
    private SavedStateHandle handle;
    public myViewModel(SavedStateHandle handle){

    }
public MutableLiveData<Integer> getNumber(){
    if(!handle.contains(MainActivity.my_key)){
        handle.set(MainActivity.my_key,0);
    }
    return handle.getLiveData(MainActivity.my_key);
}

    public void add(){
        getNumber().setValue(getNumber().getValue()+1);
    }
}
