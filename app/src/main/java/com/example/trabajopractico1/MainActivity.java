package com.example.trabajopractico1;

import static android.content.Intent.ACTION_AIRPLANE_MODE_CHANGED;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ModoAvion br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        br = new ModoAvion();
        IntentFilter filter = new IntentFilter(ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(br, filter);
    }

    /*
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(br, new IntentFilter(ACTION_AIRPLANE_MODE_CHANGED));
    }
    */


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(br);
    }
}