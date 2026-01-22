package com.example.EjercicioTaco;

import java.util.List;

public class Ingredients {
    private Protein protein;
    private Salsa salsa;
    private List<Topping> toppings;

    public Ingredients(Protein protein, Salsa salsa, List<Topping> topping) {
        this.protein = protein;
        this.salsa = salsa;
        this.toppings = topping;
    }

    @Override
    public String toString() {
        return "Ingredients [\nProtein=" + protein.toString() + "\n" +
                "Salsa=" + salsa.toString() + "\nTopping=" + printIngredients(toppings) + "]";
    }

    String printIngredients(List<Topping> toppings) {
        String ingredients = "";
        for (int i = 0; i < toppings.size(); i++) {
            ingredients += toppings.get(i).getName() + " \n";
        }
        return ingredients;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

}
