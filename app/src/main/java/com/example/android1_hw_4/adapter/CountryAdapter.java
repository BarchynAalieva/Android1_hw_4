package com.example.android1_hw_4.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1_hw_4.databinding.ItemContinentBinding;
import com.example.android1_hw_4.databinding.ItemCountryBinding;
import com.example.android1_hw_4.models.Continents;
import com.example.android1_hw_4.models.Country;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ContinentViewHolder> {

    private ItemCountryBinding binding;
    private ArrayList<Country> list = new ArrayList<>();

    public void setList(ArrayList<Country> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ContinentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {

        public ContinentViewHolder(ItemCountryBinding binding) {
            super(binding.getRoot());
        }

        public void onBind(Country country) {
            binding.countryFlagIv.setImageResource(country.getFlag());
            binding.tvCountryName.setText(country.getCountryName());
            binding.tvCityName.setText(country.getCityName());

        }
    }
}
