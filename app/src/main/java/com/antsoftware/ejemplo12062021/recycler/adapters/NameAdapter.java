package com.antsoftware.ejemplo12062021.recycler.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.antsoftware.ejemplo12062021.R;
import com.antsoftware.ejemplo12062021.recycler.models.NameModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.ViewHolder> {
    private ArrayList<NameModel> names;

    public NameAdapter() {
    }

    public NameAdapter(ArrayList<NameModel> names) {
        this.names = names;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NameAdapter.ViewHolder holder, int position) {
        String name = names.get(position).getName();
        int age = names.get(position).getAge();

        holder.name.setText(name);
        holder.age.setText(String.valueOf(age));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView age;

        public ViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.tvName);
            age = (TextView) v.findViewById(R.id.tvAge);
        }
    }
}
