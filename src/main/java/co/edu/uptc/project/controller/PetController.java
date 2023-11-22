package co.edu.uptc.project.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.edu.uptc.project.service.Services;
import co.edu.uptc.project.model.Pet;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private Services service;

	@GetMapping(path = "/{id}")
	public Optional<Pet> getPetById (@PathVariable int id){
		return this.service.getPetById(id);
	}

	@GetMapping
	public ArrayList<Pet> getPets(){
		return this.service.getPets();
	}
	
	@PostMapping
	public Pet savePet (@RequestBody Pet pet ) {
		return this.service.savePet(pet);
	}

	@PutMapping(path = "/{id}")
	public Pet updatePetById (@RequestBody Pet reques, @PathVariable("id")int id) {
		return this.service.updatePetById(reques, id);
	}
	@DeleteMapping(path = "/{id}")
	public String deleteById(@PathVariable ("id") int id) {
		boolean process = this.service.deletePet(id);
		
		if(process) {
			return "The pet has been successfully removed";
		}else {
			return "A problem has occurred, the selected pet could not be deleted";
		}
	}

}
