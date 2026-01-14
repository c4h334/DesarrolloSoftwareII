package PracticaGuiada2.src;

public class PetManager {

    private int petCount;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        this.petCount = 0;
        pets = new Pet[numberOfPets];
    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                petCount++;
                return true;
            }
        }
        return false;
    }

    public boolean addPet(Pet pet, int index) {

        this.pets[index] = pet;
        petCount++;
        return true;
    }

    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {

                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[pets.length - 1] = null;
                petCount--;
                return true;
            }
        }
        return false;
    }

    public Pet[] getPets() {
        Pet[] pets = new Pet[this.petCount];
        for (int i = 0; i < this.petCount; i++) {
            pets[i] = this.pets[i];
        }
        return pets;
    }

    public boolean updatePets(Pet pet, int index) { // Más como un insert
        if ((index >= 0) && (pet != null)) {
            if (isEmpty(pet, index)) {
                addPet(pet, index);
            } else {
                // petCount = petCount + 1;
                Pet temp = this.pets[index];
                this.pets[index] = pet;
                this.pets[index + 1] = temp;
            }
            

            return true;
        }

        return false;
    }

    public boolean isEmpty(Pet pet, int index) {
        for (Pet pets : this.pets) {
            if (this.pets[index] == null) {
                return true;
            }
        }
        return false;
    }

}
