package com.nibm.assessment_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button buttonles1,buttonles2,buttonles3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        buttonles1=findViewById(R.id.buttonles1);
        buttonles2=findViewById(R.id.buttonles2);
        buttonles3=findViewById(R.id.buttonles3);

        buttonles1.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this,MainActivity_lesson1.class)));

        buttonles2.setOnClickListener(view ->
               startActivity(new Intent(MainActivity.this,MainActivity_lesson2.class)) );

        buttonles3.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this,MainActivity_lesson3.class)));
    }
}