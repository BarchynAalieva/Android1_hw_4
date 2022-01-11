package com.example.android1_hw_4.models;

import java.io.Serializable;

public class Continents implements Serializable {

    private int flags;
    private String continent;

    public Continents(int flags, String continent) {
        this.flags = flags;
        this.continent = continent;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
