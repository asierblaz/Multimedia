package com.example.spinneraddproyect;

public class Pertsona {

    private String izena;
    private int adina;

    public Pertsona(String izena, int adina) {
        this.izena = izena;
        this.adina = adina;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    @Override
    public String toString() {
        return izena;
    }
}
