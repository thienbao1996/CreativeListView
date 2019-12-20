package com.example.creativelistview.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.creativelistview.R;
import com.example.creativelistview.data.SimpleData;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    private List<SimpleData> data;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView partyName, dishNumber, itemNumber;
        public RecyclerView thumbnails;
        public MyViewHolder(View v) {
            super(v);
            partyName = (TextView)v.findViewById(R.id.partyName);
            dishNumber = (TextView)v.findViewById(R.id.dishNumber);
            itemNumber = (TextView)v.findViewById(R.id.itemNumber);
            thumbnails = (RecyclerView)v.findViewById(R.id.thumbnailRecyclerView);
        }
    }

    public RecycleViewAdapter(List<SimpleData> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout, parent, false));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.MyViewHolder holder, int position) {
        if (data != null && data.size() > 0) {
            holder.partyName.setText(data.get(position).getPartyName());
            holder.dishNumber.setText(data.get(position).getDishNumebr());
            holder.itemNumber.setText(data.get(position).getItemNumber());

            List<String> thumbnails = data.get(position).getThumbnails();
            if (thumbnails != null && thumbnails.size() > 0) {
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayout.HORIZONTAL, false);
                holder.thumbnails.setLayoutManager(layoutManager);

                RecyclerViewThumbnailAdapter adapter = new RecyclerViewThumbnailAdapter(thumbnails, context);
                holder.thumbnails.setAdapter(adapter);
            }
        }
    }

    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0;
    }
}
