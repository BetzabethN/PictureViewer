package com.example.pictureviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pictureviewer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.catBtn.setOnClickListener(v -> binding.animalView.setImageResource(R.drawable.cat));
        binding.dogBtn.setOnClickListener(v -> binding.animalView.setImageResource(R.drawable.dog));
        binding.hamsterBtn.setOnClickListener(v -> binding.animalView.setImageResource(R.drawable.hamster));
    }
}