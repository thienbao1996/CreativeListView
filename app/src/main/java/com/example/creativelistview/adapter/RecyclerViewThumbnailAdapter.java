package com.example.creativelistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.creativelistview.R;

import java.util.List;

public class RecyclerViewThumbnailAdapter extends RecyclerView.Adapter<RecyclerViewThumbnailAdapter.MyViewHolder> {
    private List<String> thumbnails;
    private Context context;

    public RecyclerViewThumbnailAdapter(List<String> thumbnails, Context context) {
        this.thumbnails = thumbnails;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerViewThumbnailAdapter.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.image_rounded_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (thumbnails != null && thumbnails.size() > 0) {
            String uri = thumbnails.get(position);
            Glide.with(context).load(uri).centerCrop().into(holder.thumbnail);
        }
    }

    @Override
    public int getItemCount() {
        return (thumbnails != null && thumbnails.size() > 0) ? thumbnails.size() : 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView thumbnail;
        public MyViewHolder(View v) {
            super(v);
            thumbnail = (ImageView)v.findViewById(R.id.thumbnailImage);
        }
    }

}
