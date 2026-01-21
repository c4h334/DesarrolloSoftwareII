package com.example.EjercicioFinal;

public class Taco {
    private String id;
    private String taco;
    private String name;
    private double price;
    private Ingredients ingredients;

    public Taco(String id, String taco, String name, double price, Ingredients ingredients) {
        this.id = id;
        this.taco = taco;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Taco [id=" + id + ", taco=" + taco + ", name=" + name + ", price=" + price + ", ingredients="
                + ingredients + "]";
    }

}
