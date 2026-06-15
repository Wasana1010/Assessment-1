package com.nibm.assessment_1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_lesson2_1 extends AppCompatActivity {

    TextView displayName, displayEmail, displayMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_lesson21);

        displayName = findViewById(R.id.displayName);
        displayEmail = findViewById(R.id.displayEmail);
        displayMobile = findViewById(R.id.displayMobile);

        String name = getIntent().getStringExtra("NAME_KEY");
        String email = getIntent().getStringExtra("EMAIL_KEY");
        String mobile = getIntent().getStringExtra("MOBILE_KEY");

        displayName.setText("Name: " + name);
        displayEmail.setText("Email: " + email);
        displayMobile.setText("Mobile: " + mobile);
    }
}