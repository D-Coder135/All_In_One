package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

public class AccelerometerWifi extends AppCompatActivity {
    Button backButton;
    SensorManager sensorManager;
    Sensor sensor;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_wifi);
        backButton = findViewById(R.id.button231);
    }
}