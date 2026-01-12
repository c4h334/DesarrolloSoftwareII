package Arreglos.PracticaGuiada.src;

public class Main {
    public static void main(String[] args) {
        /*
         * int[] numbers = { 10, 20, 30, 40, 50 };
         * 
         * String[] fruits = new String[3];
         * 
         * System.out.println(numbers[2]);
         * System.out.println(fruits[2]);
         * 
         * String[] names = { "Andres", "Maria", "Jose", "Isabel", "Juan" };
         * 
         * // FOR TRADICIONAL
         * for (int i = 0; i < names.length; i++) {
         * System.out.println("nombre=" + names[i]);
         * }
         * 
         * 
         * 
         * // FOR MEJORADO
         * for (String name : names) {
         * System.out.println("Hello, my name is " + name);
         * }
         */

        Person person = new Person("Anderson", 19, 3);

        for (Pet pet : person.getPets()) {
            System.out.println(pet.getPetName());
        }
    }
}