package com.example.android1_hw_4.models;

public class Country {
    private String countryName, cityName;
    private int flag;

    public Country(String countryName, String cityName, int flag) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
