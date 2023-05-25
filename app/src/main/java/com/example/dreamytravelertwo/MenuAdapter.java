package com.example.dreamytravelertwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<MenuCity> cities;

    public MenuAdapter(Context context, List<MenuCity> cities) {
        this.inflater = LayoutInflater.from(context);
        this.cities = cities;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView pictureView;
        final TextView nameView, locationView, climateConditionsView, attractionsView;

        ViewHolder(View view) {
            super(view);
            pictureView = view.findViewById(R.id.photo);
            nameView = view.findViewById(R.id.name);
            locationView = view.findViewById(R.id.location);
            climateConditionsView = view.findViewById(R.id.climateConditions);
            attractionsView = view.findViewById(R.id.attractions);
        }
    }

    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item_menu, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuAdapter.ViewHolder holder, int position) {
        MenuCity city = cities.get(position);
        holder.pictureView.setImageResource(city.getPhoto());
        holder.nameView.setText(city.getName());
        holder.locationView.setText(city.getLocation());
        holder.climateConditionsView.setText(city.getClimateConditions());
        holder.attractionsView.setText(city.getAttractions());
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }
}