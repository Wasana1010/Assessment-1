package com.nibm.assessment_1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_lesson3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lesson3);

        if(savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,new FragmentA())
                    .commit();
        }
    }
}