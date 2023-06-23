package com.example.comida;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import com.example.comida.databinding.ActivityMapBinding;
import com.example.comida.databinding.ActivityMenuBinding;

public class MapActivity extends AppCompatActivity {

    private ActivityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.wvMap.getSettings().setJavaScriptEnabled(true);

        //binding.wvMap.loadUrl("");
        String unencodedHtml =
                "<html><body><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1176.556720485068!2d-70.59966809797697!3d-33.480435982666556!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662d1b753ff4c21%3A0x5aeafef355376006!2sSANTA%20EMPANADA%20CHILE!5e0!3m2!1ses!2scl!4v1687454575662!5m2!1ses!2scl\" width=\"365\" height=\"530\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe></body></html>";
        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(), Base64.NO_PADDING);
        binding.wvMap.loadData(encodedHtml, "text/html", "base64");

        binding.btVolver.setOnClickListener(v -> onBackPressed());
    }

}