package com.example.EjercicioTaco;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaco() {
        return taco;
    }

    public void setTaco(String taco) {
        this.taco = taco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

}
