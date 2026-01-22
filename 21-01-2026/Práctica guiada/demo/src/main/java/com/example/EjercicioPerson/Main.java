package com.example.EjercicioPerson;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("James", 19, true);
        // String json = gson.toJson(person);
        // System.out.println(json);

        /*
         * try (FileWriter writer = new FileWriter("person.json")) {
         * gson.toJson(person, writer);
         * } catch (Exception e) {
         * System.out.println("Error al escribir el archivo");
         * }
         */

        try (FileReader reader = new FileReader("person.json")) {
            Type type = new TypeToken<ArrayList<Person>>() {
            }.getType();
            List<Person> people = gson.fromJson(reader, type);
            for (Person p : people) {
                System.out.println(p.getName());
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }

    }
}