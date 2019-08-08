package com.basket.baskettt2.Controller;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.basket.baskettt2.Model.OyuncuIstatistikModel;
import com.basket.baskettt2.Model.PuanDurumuModel;
import com.basket.baskettt2.R;
import com.basket.baskettt2.View.KadroDialog;
import com.basket.baskettt2.View.Topbar;

import java.util.ArrayList;
import java.util.Collections;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class OyuncularKadroAdaptor extends RecyclerView.Adapter<OyuncularKadroAdaptor.ViewHolder> implements KadroAdaptorTouch.ItemTouchHelperContract {
    private ArrayList<OyuncuIstatistikModel> models;
    private Context context;

    public OyuncularKadroAdaptor(Context context,ArrayList<OyuncuIstatistikModel> models) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item_1,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        Log.d("sonuc", String.valueOf(i));
        int toplam;
        if(i==0){
            viewHolder.Toplam.setText(models.get(i).getToplam());
        }else{
            toplam=Integer.valueOf(models.get(i).getToplam());
            viewHolder.Toplam.setText(String.valueOf(toplam*2));
            Log.d("gelenler", String.valueOf(toplam));
        }
        viewHolder.Isim.setText(models.get(i).getOyuncuIsmi());
     //    viewHolder.Toplam.setText(models.get(i).getToplam());
        viewHolder.Para.setText(models.get(i).getPara());
        viewHolder.Rol.setText(models.get(i).getRol());
        viewHolder.Isim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity activity= (FragmentActivity) context;
                FragmentManager fm=activity.getSupportFragmentManager();
                KadroDialog kadroDialog=new KadroDialog();
                Bundle bundle=models.get(i).getIstatistik();
                Log.d("gelenler",bundle.getString("isim"));
                kadroDialog.setArguments(bundle);
                kadroDialog.show(fm,"asd");
            }
        });
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

    public void onRowMoved(int fromPosition, int toPosition) {
        if (fromPosition < toPosition) {
            for (int i = fromPosition; i < toPosition; i++) {
                Collections.swap(models, i, i + 1);
            }
        } else {
            for (int i = fromPosition; i > toPosition; i--) {
                Collections.swap(models, i, i - 1);
            }
        }
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override
    public void onRowSelected(ViewHolder myViewHolder) {
        myViewHolder.itemView.setBackgroundColor(Color.GRAY);

    }

    @Override
    public void onRowClear(ViewHolder myViewHolder) {
        myViewHolder.itemView.setBackgroundColor(Color.WHITE);

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Isim,Rol,Para,Toplam;
        public LinearLayout layout;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.Puan);
            Isim = itemView.findViewById(R.id.Isım);
            Rol = itemView.findViewById(R.id.Rol);
            Para = itemView.findViewById(R.id.Para);
            Toplam=itemView.findViewById(R.id.Toplam);
        }
    }
}