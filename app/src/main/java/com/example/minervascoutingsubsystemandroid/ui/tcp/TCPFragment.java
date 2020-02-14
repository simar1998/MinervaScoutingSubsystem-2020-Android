package com.example.minervascoutingsubsystemandroid.ui.tcp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.minervascoutingsubsystemandroid.R;

public class TCPFragment extends Fragment {

    private TCPViewModel TCPViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TCPViewModel =
                ViewModelProviders.of(this).get(TCPViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tcp, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        TCPViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}