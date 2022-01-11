package com.example.android1_hw_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1_hw_4.adapter.CountryAdapter;
import com.example.android1_hw_4.databinding.ActivityCoutriesBinding;
import com.example.android1_hw_4.models.Continents;
import com.example.android1_hw_4.models.Country;

import java.util.ArrayList;
import java.util.List;

public class CoutriesActivity extends AppCompatActivity {

    private ActivityCoutriesBinding binding;
    private CountryAdapter adapter;
    private List<Country> countries = new ArrayList<>();
    private String continents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoutriesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adapter = new CountryAdapter();

        if (getIntent().getSerializableExtra("key") != null) {
            continents =  getIntent().getStringExtra("key");
            switch (continents) {
                case "Europe":
                    countries.add(new Country("England", "London", R.drawable.eng));
                    countries.add(new Country("England", "London", R.drawable.eng));
                    break;
                case "Asia":
                    countries.add(new Country("Kyrgyzstan", "Bishkek", R.drawable.kg));
                    countries.add(new Country("Kazahstan", "Nursultan", R.drawable.ic_kz));
                    break;
            }
            adapter.setList((ArrayList<Country>) countries);
            binding.countriesRv.setAdapter(adapter);
        }

    }
}