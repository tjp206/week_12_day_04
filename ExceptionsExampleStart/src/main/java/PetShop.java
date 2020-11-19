import behaviours.Pet;

import java.util.ArrayList;

public class PetShop{

    private ArrayList<Pet> stock;

    public PetShop(){
        stock = new ArrayList<Pet>();
    }

    public Pet findPetByName(String searchName) throws NullStringException {

        if(searchName == null) {
            throw new NullStringException("Cannot search for pet with null instead of a name string");
        }

        String searchLower = searchName.toLowerCase();
        for (Pet pet : stock) {
            String petName = pet.getName().toLowerCase();
            if (petName.equals(searchLower)){
                return pet;
            }
        }
        return null;
    }

    public void addPet(Pet pet){
        stock.add(pet);
    }

}