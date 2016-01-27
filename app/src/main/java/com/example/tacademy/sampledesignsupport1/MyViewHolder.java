package com.example.tacademy.sampledesignsupport1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-27.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView messageView;
    public MyViewHolder(View itemView) {
        super(itemView);
        messageView = (TextView)itemView;
    }
    public void setText(String text) {
        messageView.setText(text);
    }
}
