package com.nibm.assessment_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_lesson2 extends AppCompatActivity {

    EditText editName, editEmail, editMobile;
    Button btnClear, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_lesson2);

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editMobile = findViewById(R.id.editMobile);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnClear.setOnClickListener(view -> {
            editName.setText("");
            editEmail.setText("");
            editMobile.setText("");
        });

        btnSubmit.setOnClickListener(view -> {
            String name = editName.getText().toString().trim();
            String email = editEmail.getText().toString().trim();
            String mobile = editMobile.getText().toString().trim();

            if (name.isEmpty()) {
                editName.setError("Name is required!");
            } else if (email.isEmpty()) {
                editEmail.setError("Email is required!");
            } else if (mobile.isEmpty()) {
                editMobile.setError("Mobile is required!");
            } else if (!email.contains("@") || !email.contains(".")) {
                editEmail.setError("Enter a valid email address!");
            } else {
                Intent intent = new Intent(MainActivity_lesson2.this, MainActivity_lesson2_1.class);
                intent.putExtra("NAME_KEY", name);
                intent.putExtra("EMAIL_KEY", email);
                intent.putExtra("MOBILE_KEY", mobile);
                startActivity(intent);
            }
        });
    }
}