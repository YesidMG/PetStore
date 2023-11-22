package co.edu.uptc.project.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uptc.project.model.Pet;
import co.edu.uptc.project.repository.IPetRepository;
import co.edu.uptc.project.serviceInteface.ServiceInterface;


@Service
public class Services implements ServiceInterface {

	@Autowired
	IPetRepository petRepository;
	public Optional<Pet> getPetById (int id){
		return petRepository.findById(id);
	}
	public ArrayList<Pet> getPets (){
		return (ArrayList<Pet>)petRepository.findAll();
	}
	
	public Pet savePet(Pet pet) {
		return petRepository.save(pet);
	}

	public Pet updatePetById (Pet request, int id){
		Pet pet = petRepository.findById(id).get();
		pet.setName(request.getName());
		pet.setAnimal(request.getAnimal());
		petRepository.save(pet);
		return pet;
	}
	
	public Boolean deletePet (int id) {
		try {
			petRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

