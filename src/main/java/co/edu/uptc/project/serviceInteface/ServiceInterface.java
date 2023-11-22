package co.edu.uptc.project.serviceInteface;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import co.edu.uptc.project.model.Pet;


public interface ServiceInterface {

	public ArrayList<Pet> getPets();
	
	public Pet savePet(Pet pet);
	
	public Pet updatePetById (Pet request, int id);
	
	public Boolean deletePet (int id);
}
