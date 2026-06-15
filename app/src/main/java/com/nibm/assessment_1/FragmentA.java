package com.nibm.assessment_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a,
                container, false);

        Button btnNext = view.findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,
                            new FragmentB())
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}