package com.basket.baskettt2.Controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.basket.baskettt2.Model.PuanDurumuModel;
import com.basket.baskettt2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adaptor extends RecyclerView.Adapter<adaptor.ViewHolder> {
    private ArrayList<PuanDurumuModel> models;
    private Context context;

    public adaptor(Context context,ArrayList<PuanDurumuModel> models) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d("sonuc", String.valueOf(i));
        viewHolder.Takimİsmi.setText(models.get(i).getTakimIsmi());
        viewHolder.OynananMac.setText(models.get(i).getMacSayisi());
        viewHolder.GalipSayisi.setText(models.get(i).getGalipSayisi());
        viewHolder.MaglubiyetSayisi.setText(models.get(i).getMaglubiyetSayisi());
        viewHolder.AtilanSayi.setText(models.get(i).getAtilanSayi());
        viewHolder.YenilenSayi.setText(models.get(i).getYenilenSayi());
        viewHolder.Avarage.setText(models.get(i).getAvarage());
        viewHolder.Siralama.setText(String.valueOf(i));
    }
    public void temizle(){
        int size=models.size();
        if(size>0){
            for(int i=0;i<size;i++){
                models.remove(0);
            }
        }
        notifyItemRangeRemoved(0, size);
    }
    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Takimİsmi,GalipSayisi,MaglubiyetSayisi,AtilanSayi,YenilenSayi,Avarage,OynananMac,Siralama;
        public ImageView Amblem;
        public LinearLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout=itemView.findViewById(R.id.Puan);
            Takimİsmi=itemView.findViewById(R.id.Takımİsmi);
            OynananMac=itemView.findViewById(R.id.OynananMac);
            GalipSayisi=itemView.findViewById(R.id.GalipSayisi);
            MaglubiyetSayisi=itemView.findViewById(R.id.MaglubiyerSayisi);
            AtilanSayi=itemView.findViewById(R.id.AtilanSayi);
            YenilenSayi=itemView.findViewById(R.id.YenilenSayi);
            Avarage=itemView.findViewById(R.id.Avarage);
            Amblem=itemView.findViewById(R.id.Amblem);
            Siralama=itemView.findViewById(R.id.Sıralama);
        }
    }
}