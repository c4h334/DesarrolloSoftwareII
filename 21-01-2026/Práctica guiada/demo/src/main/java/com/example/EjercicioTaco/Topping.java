package com.example.EjercicioTaco;

import java.util.List;

public class Topping {
    private String name;
    private String quantity;
    private List<String> ingredients;

    public Topping(String name, String quantity, List<String> ingredients) {
        this.name = name;
        this.quantity = quantity;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    String printIngredients(List<String> ingredients) {
        String ingredientsString = "";
        for (int i = 0; i < ingredients.size(); i++) {
            ingredientsString += ingredients.get(i) + " \n";
        }
        return ingredientsString;
    }

    @Override
    public String toString() {
        return "Topping [name=" + name + ", quantity=" + quantity + ", ingredients=" + printIngredients(ingredients)
                + "]";
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

}
