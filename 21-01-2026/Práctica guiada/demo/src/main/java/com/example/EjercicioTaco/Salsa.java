package com.example.EjercicioTaco;

public class Salsa {
    private String name;
    private String spiciness;

    public Salsa(String name, String spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpiciness() {
        return spiciness;
    }

    public void setSpiciness(String spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Salsa [name=" + name + ", spiciness=" + spiciness + "]";
    }

    

}
