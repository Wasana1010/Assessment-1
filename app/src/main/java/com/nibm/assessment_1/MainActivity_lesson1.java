package com.nibm.assessment_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_lesson1 extends AppCompatActivity {

    Button btnShowToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_lesson1);

        btnShowToast = findViewById(R.id.btnShowToast);

        btnShowToast.setOnClickListener(view ->
                Toast.makeText(MainActivity_lesson1.this,
                        "Hello Welcome!!!",
                        Toast.LENGTH_SHORT).show()
        );
    }

    }
