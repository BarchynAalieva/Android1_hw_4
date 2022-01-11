package com.example.android1_hw_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.android1_hw_4.adapter.ContinentAdapter;
import com.example.android1_hw_4.databinding.ActivityMainBinding;
import com.example.android1_hw_4.models.Continents;
import com.example.android1_hw_4.models.Country;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ContinentAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adapter = new ContinentAdapter();

        ArrayList<Continents> continents = new ArrayList<>();
        loadContinents(continents);
        adapter.setList(continents);
        binding.continentsRv.setAdapter(adapter);

        adapter.setItemClickListener(new ContinentAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Continents sendContinent = adapter.getItem(position);
                Intent intent = new Intent(MainActivity.this, CoutriesActivity.class);
                intent.putExtra("key", sendContinent.getContinent());
                startActivity(intent);
            }
        });
    }

    private void loadContinents(ArrayList<Continents> list) {
        list.add(new Continents(R.drawable.europe, "Europe"));
        list.add(new Continents(R.drawable.asia, "Asia"));
    }
}