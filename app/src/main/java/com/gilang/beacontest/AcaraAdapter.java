package com.gilang.beacontest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by macair on 3/7/16.
 */
public class AcaraAdapter extends RecyclerView.Adapter<AcaraHolder> {

    private Activity activity;
    private List<Acara> acaraList;

    public AcaraAdapter(Activity activity){
        this.activity = activity;
        acaraList = new ArrayList<>();
    }

    public void add(Acara acara){
        acaraList.add(acara);
        notifyDataSetChanged();
    }

    public void clear(){
        acaraList.clear();
    }

    @Override
    public AcaraHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new AcaraHolder(v);
    }

    @Override
    public void onBindViewHolder(AcaraHolder holder, int position) {
        final Acara acara = acaraList.get(position);
        holder.img.setImageResource(R.drawable.steak);
        holder.title.setText(acara.nama);
        holder.content.setText(acara.panitia);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity, DetailAcaraActivity.class);
                DetailAcaraActivity.acara = acara;
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return acaraList.size();
    }
}
