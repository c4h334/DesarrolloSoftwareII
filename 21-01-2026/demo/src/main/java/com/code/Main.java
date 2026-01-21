package com.code;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gson gson = new Gson();
        Person person = new Person("Anderson", 19, true);
        String info = gson.toJson(person);
        System.out.println(info);
    }
}