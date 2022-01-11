package com.example.android1_hw_4.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1_hw_4.databinding.ItemContinentBinding;
import com.example.android1_hw_4.models.Continents;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ItemContinentBinding binding;
    private ArrayList<Continents> list = new ArrayList<>();
    private OnItemClickListener itemClickListener;

    public void setItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setList(ArrayList<Continents> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
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

    public Continents getItem(int position) {
        return list.get(position);
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {

        public ContinentViewHolder(ItemContinentBinding binding) {
            super(binding.getRoot());
        }

        public void onBind(Continents continents) {
            binding.contFlagIv.setImageResource(continents.getFlags());
            binding.tvContinent.setText(continents.getContinent());

            binding.getRoot().setOnClickListener(view -> {
                itemClickListener.onItemClick(getAdapterPosition());
            });
        }
    }
   public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
