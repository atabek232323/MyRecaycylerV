package com.example.myrecaycylerv;

public class State {
    private String name;
    private String capital;

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getFlagResurs() {
        return flagResurs;
    }

    public State(String name, String capital, int flagResurs) {
        this.name = name;
        this.capital = capital;
        this.flagResurs = flagResurs;
    }

    private int flagResurs;
}
