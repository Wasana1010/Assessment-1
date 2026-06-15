package com.nibm.assessment_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b,
                container,false);

        Button btnBack = view.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,
                            new com.nibm.assessment_1.FragmentA())
                    .commit();
        });

        return view;
    }
}