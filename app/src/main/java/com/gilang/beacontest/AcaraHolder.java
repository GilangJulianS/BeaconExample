package com.gilang.beacontest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by macair on 3/7/16.
 */
public class AcaraHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView title, content;
    Button btn;

    public AcaraHolder(View v) {
        super(v);
        img = (ImageView) v.findViewById(R.id.img);
        title = (TextView) v.findViewById(R.id.txt_title);
        content = (TextView) v.findViewById(R.id.txt_content);
        btn = (Button) v.findViewById(R.id.btn_more);
    }
}
