package PracticaGuiada2.src;

public class Person {

    private String name;
    private int age;
    private Pet[] pets;
    private PetManager petManager;

    public Person(String name, int age, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
        //this.petManager = new PetManager(this.numbersOfPets);
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

    public boolean addPet(Pet pet) {
        return petManager.addPet(pet);
    }

    public PetManager getPetManager() {
        return this.petManager;
    }

    public boolean removePet(Pet pet) {
        return petManager.removePet(pet);
    }

    public Pet[] getPets() {
        return petManager.getPets();
    }

    public boolean updatePet(Pet pet, int index) {
        return petManager.updatePets(pet, index);
    }

}
