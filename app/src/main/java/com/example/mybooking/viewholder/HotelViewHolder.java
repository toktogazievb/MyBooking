package com.example.mybooking.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mybooking.ItemHotel;
import com.example.mybooking.databinding.ItemHotelBinding;

public class HotelViewHolder extends RecyclerView.ViewHolder {

    public ItemHotelBinding viewBinding;

    public HotelViewHolder(ItemHotelBinding viewBinding) {
        super(viewBinding.getRoot());
        this.viewBinding = viewBinding;
    }

    public void onBind(ItemHotel itemHotel){
        viewBinding.tvHotelName.setText(itemHotel.getName());
        viewBinding.tvHotelDesc.setText(itemHotel.getDescription());
        Glide.with(itemView.getContext()).load(itemHotel.getImage()).into(viewBinding.ivHotel);
    }
}
