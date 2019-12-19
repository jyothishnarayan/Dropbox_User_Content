package com.jyo.dropboxusercontent.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jyo.dropboxusercontent.R;

import java.util.List;

public class DropboxContentAdapter extends RecyclerView.Adapter<DropboxContentAdapter.RecyclerViewHolder> {


    private List<CardItem> cardItemList;
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item,parent,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        CardItem singleItem =cardItemList.get(position);
        holder.title.setText(singleItem.getTextTitle());
        holder.imageView.setImageResource(singleItem.getImage());
        holder.description.setText(singleItem.getTextDescription());
    }

    @Override
    public int getItemCount() {
        return cardItemList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView title;
        public TextView description;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_icon);
            title = itemView.findViewById(R.id.titleView);
            description = itemView.findViewById(R.id.description);
        }
    }
}
