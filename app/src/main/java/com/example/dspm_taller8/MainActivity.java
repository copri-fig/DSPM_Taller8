package com.example.dspm_taller8;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView img = findViewById(R.id.img);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink);
                img.startAnimation(animation);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.clock);
                img.startAnimation(animation);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade);
                img.startAnimation(animation);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                img.startAnimation(animation);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide);
                img.startAnimation(animation);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                img.startAnimation(animation);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });
    }
}