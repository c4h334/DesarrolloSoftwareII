package com.example.EjercicioFinal;

public class Protein {
    private String name;
    private String preparation;

    public Protein(String name, String preparation) {
        this.name = name;
        this.preparation = preparation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Protein [name=" + name + ", preparation=" + preparation + "]";
    }

    

}
