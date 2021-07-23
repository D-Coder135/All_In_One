package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView3);
        button = findViewById(R.id.button2);

        YoYo.with(Techniques.SlideInDown).duration(2000).repeat(0).playOn(imageView);
        YoYo.with(Techniques.SlideInLeft).duration(1000).repeat(0).playOn(textView);
        YoYo.with(Techniques.BounceIn).duration(3000).repeat(0).playOn(button);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginMenu.class);
            startActivity(intent);
            finish();
        });
    }
}