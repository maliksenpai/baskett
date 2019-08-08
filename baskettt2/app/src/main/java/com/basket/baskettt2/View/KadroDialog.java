package com.basket.baskettt2.View;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.basket.baskettt2.R;

public class KadroDialog extends DialogFragment {
    private TextView isim,güc,yakinatis,uzakatis,riband,atletik,defans,uzunluk,yas,kilo,para,rol;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.kadropopup,null);
        Log.d("gelenlerr",getArguments().getString("isim"));
        isim=view.findViewById(R.id.Isim);
        isim.setText("İsim \t"+getArguments().getString("isim"));
        güc=view.findViewById(R.id.Gucu);
        güc.setText("Gücü: \t"+getArguments().getString("toplam"));
        yakinatis=view.findViewById(R.id.YakinAtis);
        yakinatis.setText("Yakin Atis: \t"+getArguments().getString("yakinatis"));
        uzakatis=view.findViewById(R.id.UzakAtis);
        uzakatis.setText("Uzak Atis:\t"+getArguments().getString("uzakatis"));
        riband=view.findViewById(R.id.Riband);
        riband.setText("Riband:\t"+getArguments().getString("riband"));
        atletik=view.findViewById(R.id.Atletik);
        atletik.setText("Atletik:\t"+getArguments().getString("atletik"));
        defans=view.findViewById(R.id.Defans);
        defans.setText("Defans:\t"+getArguments().getString("defans"));
        uzunluk=view.findViewById(R.id.Uzunluk);
        uzunluk.setText("Uzunluk:\t"+getArguments().getString("uzunluk"));
        yas=view.findViewById(R.id.Yas);
        yas.setText("Yas:\t"+getArguments().getString("yas"));
        kilo=view.findViewById(R.id.Kilo);
        kilo.setText("Kilo:\t"+getArguments().getString("kilo"));
        para=view.findViewById(R.id.Para);
        para.setText("Para:\t"+getArguments().getString("para"));
        rol=view.findViewById(R.id.Rol);
        rol.setText("Rol:\t"+getArguments().getString("rol"));
        return view;
    }
    static KadroDialog getInstance(){
        KadroDialog kadroDialog=new KadroDialog();
        return kadroDialog;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
