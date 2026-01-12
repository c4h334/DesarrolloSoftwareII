package Arreglos.PracticaGuiada.src;

public class PetManager {
    private int petCount;
    private Pet[] pets;

    public PetManager(int numberOfPets){

    }

    public boolean addPet(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null){
                pets[i] = pet;
                petCount++;
                return true;
            }
        }
        return false;
    }
}
