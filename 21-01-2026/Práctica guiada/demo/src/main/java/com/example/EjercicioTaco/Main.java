package com.example.EjercicioTaco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Taco> tacos = new ArrayList<>();

        Protein protein1 = new Protein("Chicken", "Grilled");
        Salsa salsa1 = new Salsa("Tomato Salsa", "Medium");

        List<Topping> toppings1 = new ArrayList<>();
        toppings1.add(new Topping("Lettuce", "1 cup", Arrays.asList("Iceberg Lettuce")));
        toppings1.add(new Topping("Cheese", "1/2 cup", Arrays.asList("Cheddar Cheese", "Monterey Jack Cheese")));
        toppings1.add(new Topping("Guacamole", "2 tablespoons",
                Arrays.asList("Avocado", "Lime Juice", "Salt", "Onion", "Cilantro")));
        toppings1.add(new Topping("Sour Cream", "2 tablespoons", Arrays.asList("Sour Cream")));

        Ingredients ingredients1 = new Ingredients(protein1, salsa1, toppings1);
        tacos.add(new Taco("0001", "taco", "Chicken Taco", 2.99, ingredients1));

        Protein protein2 = new Protein("Beef", "Seasoned and Grilled");
        Salsa salsa2 = new Salsa("Salsa Verde", "Hot");

        List<Topping> toppings2 = new ArrayList<>();
        toppings2.add(new Topping("Onions", "1/4 cup", Arrays.asList("White Onion", "Red Onion")));
        toppings2.add(new Topping("Cilantro", "2 tablespoons", Arrays.asList("Fresh Cilantro")));
        toppings2.add(new Topping("Queso Fresco", "1/4 cup", Arrays.asList("Queso Fresco")));

        Ingredients ingredients2 = new Ingredients(protein1, salsa2, toppings2);
        tacos.add(new Taco("0002", "taco", "Beef Taco", 3.49, ingredients2));

        Protein protein3 = new Protein("Fish", "Battered and Fried");
        Salsa salsa3 = new Salsa("Chipotle Mayo", "Mild");

        List<Topping> toppings3 = new ArrayList<>();
        toppings3.add(new Topping("Cabbage Slaw", "1 cup",
                Arrays.asList("Shredded Cabbage", "Carrot", "Mayonnaise", "Lime Juice", "Salt")));
        toppings3.add(new Topping("Pico de Gallo", "1/2 cup",
                Arrays.asList("Tomato", "Onion", "Cilantro", "Lime Juice", "Salt")));
        toppings3.add(new Topping("Lime Crema", "2 tablespoons", Arrays.asList("Sour Cream", "Lime Juice", "Salt")));

        Ingredients ingredients3 = new Ingredients(protein3, salsa3, toppings3);
        tacos.add(new Taco("0003", "taco", "Fish Taco", 4.99, ingredients3));

        for (Taco taco : tacos) {
            System.out.println(taco);
        }

    }
}
