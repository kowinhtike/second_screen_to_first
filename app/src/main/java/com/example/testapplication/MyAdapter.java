package com.example.testapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class
MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<MyItem> itemList;

    public MyAdapter(List<MyItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyItem item = itemList.get(position);
        holder.itemNameTextView.setText(item.getItemName());
        holder.priceNameTextView.setText(item.getPriceName());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemNameTextView;
        public TextView priceNameTextView;

        public ViewHolder(View view) {
            super(view);
            itemNameTextView = view.findViewById(R.id.itemNameTextView);
            priceNameTextView = view.findViewById(R.id.priceNameTextView);
        }
    }
}
