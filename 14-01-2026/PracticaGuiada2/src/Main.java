package PracticaGuiada2.src;

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

        Person person = new Person("Anderson", 19, new PetManager(3));

        /*for (Pet pet : person.getPets()) {
            System.out.println(pet.getPetName());
        }*/

 /*if (person.addPet(new Pet("Goldie", "Fish"))) {
            IOManager.printMessage("Pet added successfully");
        } else {
            IOManager.printMessage("Failed to add pet");
        }*/
        Pet pet1 = new Pet("Sasha", "Dog");
        Pet pet2 = new Pet("Bonnie", "Dog");
        Pet pet3 = new Pet("Manchas", "Cat");
        Pet pet4 = new Pet("Loly", "Dog");

        IOManager.printMessage((person.addPet(pet1)) ? "Pet added successfully" : "Failed to add pet");
        IOManager.printMessage((person.addPet(pet2)) ? "Pet added successfully" : "Failed to add pet");
        IOManager.printMessage((person.addPet(pet3)) ? "Pet added successfully" : "Failed to add pet");

        showPets(person);

        //IOManager.printMessage((person.removePet(pet2)) ? "Pet removed successfully" : "Failed to remove pet");
        //showPets(person);
        /* 
        if (person.getPets().length == 0) {
            IOManager.printMessage("No pets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }*/
        IOManager.printMessage((person.updatePet(pet4, 1)) ? "Pet updated successfully" : "Failed to update pet");

        if (person.getPets().length == 0) {
            IOManager.printMessage("No pets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        //showPets(person);

    }

    static void showPets(Person person) {
        IOManager.printMessage("\nPets\n");
        for (Pet pet : person.getPetManager().getPets()) {
            IOManager.printMessage(pet.getPetName());
        }
    }
}
