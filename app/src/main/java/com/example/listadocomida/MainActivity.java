package com.example.listadocomida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listadocomida.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ActivityMainBinding.inflate(getLayoutInflater());
    }
}