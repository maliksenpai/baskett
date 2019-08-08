package com.basket.baskettt2.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.basket.baskettt2.R;

import androidx.fragment.app.Fragment;

public class Topbar extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.topbar,container, false);
        TextView tisim=view.findViewById(R.id.tisim);
        TextView tduurm=view.findViewById(R.id.tdurum);
        return view;
    }
}
