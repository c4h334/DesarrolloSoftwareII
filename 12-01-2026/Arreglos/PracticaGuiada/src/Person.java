package Arreglos.PracticaGuiada.src;

public class Person {
    private String name;
    private int age;
    // private Pet[] pets;
    private PetManager petManager;

    public Person(String name, int age, int numbersOfPets, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
        // pets = new Pet[numbersOfPets];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }
}