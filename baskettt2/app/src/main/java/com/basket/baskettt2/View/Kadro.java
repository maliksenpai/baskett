package com.basket.baskettt2.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.basket.baskettt2.Controller.KadroAdaptorTouch;
import com.basket.baskettt2.Controller.OyuncularKadroAdaptor;
import com.basket.baskettt2.Model.OyuncuIstatistikModel;
import com.basket.baskettt2.R;

import java.util.ArrayList;

public class Kadro extends AppCompatActivity {
    private ArrayList<OyuncuIstatistikModel> liste=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_kadro);
        recyclerView=findViewById(R.id.KadroOyuncular);
        liste.add(new OyuncuIstatistikModel("Oyuncu Ismi","Güc","0","0","0","0","0","0","0","0","Para","Rol"));
        liste.add(new OyuncuIstatistikModel("selami","90","100","80","70","43","34","189","34","90","200","pg"));
        liste.add(new OyuncuIstatistikModel("selami","90","100","80","70","43","34","189","34","90","200","sg"));
        liste.add(new OyuncuIstatistikModel("selami","90","100","80","70","43","34","189","34","90","200","sf"));
        liste.add(new OyuncuIstatistikModel("selami","90","100","80","70","43","34","189","34","90","200","pf"));
        liste.add(new OyuncuIstatistikModel("selami","90","100","80","70","43","34","189","34","90","200","c"));
        OyuncularKadroAdaptor adaptor=new OyuncularKadroAdaptor(Kadro.this,liste);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(Kadro.this);
        ItemTouchHelper.Callback callback=new KadroAdaptorTouch(adaptor);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adaptor);
    }
}
