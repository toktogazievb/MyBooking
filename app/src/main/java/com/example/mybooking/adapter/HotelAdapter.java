package com.example.mybooking.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mybooking.ItemHotel;
import com.example.mybooking.databinding.ItemHotelBinding;
import com.example.mybooking.viewholder.HotelViewHolder;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelViewHolder> {

    private ArrayList<ItemHotel> itemHotels;

    public HotelAdapter(ArrayList<ItemHotel> itemHotels) {
        this.itemHotels = itemHotels;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HotelViewHolder(ItemHotelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        holder.onBind(itemHotels.get(position));
    }

    @Override
    public int getItemCount() {
        return itemHotels.size();
    }
}
