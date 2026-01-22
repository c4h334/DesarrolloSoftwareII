package com.example.EjercicioPerson;

public class Person {
    private String name;
    private int id;
    private boolean isStudent;

    public Person(String name, int id, boolean isStudent) {
        this.name = name;
        this.id = id;
        this.isStudent = isStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", isStudent=" + isStudent + "]";
    }

}