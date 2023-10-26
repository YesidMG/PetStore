package co.edu.uptc.project.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uptc.project.model.Pet;
import co.edu.uptc.project.repository.IPetRepository;


@Service
public class Services {

	@Autowired
	IPetRepository petRepository;
	public Optional<Pet> getPetById (int id){
		return petRepository.findById(id);
	}
	public ArrayList<Pet> getPets (){
		return (ArrayList<Pet>)petRepository.findAll();
	}
}

