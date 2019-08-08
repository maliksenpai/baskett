package com.basket.baskettt2.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.basket.baskettt2.Controller.adaptor;
import com.basket.baskettt2.Model.PuanDurumuModel;
import com.basket.baskettt2.R;

import java.util.ArrayList;

public class PuanDurumu extends AppCompatActivity {
    private ArrayList<PuanDurumuModel> liste=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_puan_durumu);
        recyclerView=findViewById(R.id.Liste);
        liste.add(new PuanDurumuModel("Takim","S","G","M","A","Y","Av"));
        liste.add(new PuanDurumuModel("Takim İsmi","10","5","3","120","43","20"));
        liste.add(new PuanDurumuModel("Takim İsmi","10","5","3","120","43","30"));
        liste.add(new PuanDurumuModel("Takim İsmi","10","5","3","120","43","20"));
        adaptor adaptor=new adaptor(PuanDurumu.this,liste);
        recyclerView.setAdapter(adaptor);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(PuanDurumu.this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
