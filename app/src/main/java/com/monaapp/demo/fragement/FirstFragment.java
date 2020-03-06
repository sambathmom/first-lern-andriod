package com.monaapp.demo.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.monaapp.demo.R;

public class FirstFragment extends Fragment {
     public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        android.view.View view = inflater.inflate(R.layout.frist_fragment, container, false);
//        textView = view.findViewById(R.id.text);
//        textView.setText("Second");
        return view;
    }
}
