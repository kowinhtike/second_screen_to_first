package com.example.testapplication;

// CustomAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private List<CustomItem> itemList;

    public CustomAdapter(Context context, List<CustomItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, parent, false);
        }

        final CustomItem currentItem = (CustomItem) getItem(position);

        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewDescription = convertView.findViewById(R.id.textViewDescription);
        TextView textViewDate = convertView.findViewById(R.id.textViewDate);

        textViewName.setText(currentItem.getName());
        textViewDescription.setText(currentItem.getDescription());
        textViewDate.setText(currentItem.getDate());

        convertView.setOnClickListener( View -> {
                // Show ID in a Toast message
                Toast.makeText(context, "Clicked item ID: " + position, Toast.LENGTH_SHORT).show();
            }
        );

        return convertView;
    }

}

