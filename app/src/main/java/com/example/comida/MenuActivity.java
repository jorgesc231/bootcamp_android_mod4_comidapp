package com.example.comida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.comida.databinding.ActivityMainBinding;
import com.example.comida.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.Toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.btOrdenar.setOnClickListener(v -> irAlMapa());
        binding.btOrdenar2.setOnClickListener(v -> irAlMapa());
        binding.btOrdenar3.setOnClickListener(v -> irAlMapa());

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void irAlMapa() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}