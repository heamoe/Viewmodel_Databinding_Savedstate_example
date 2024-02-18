package com.example.datebinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.datebinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    myViewModel myViewModel;
    ActivityMainBinding binding;
    public final static String my_key ="number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        myViewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).get(myViewModel.class);

        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);

    }



}