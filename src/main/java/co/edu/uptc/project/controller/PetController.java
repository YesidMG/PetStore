package co.edu.uptc.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.project.service.Services;
import co.edu.uptc.project.model.Pet;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private Services service;

	@GetMapping
	public ArrayList<Pet> getPets(){
		return this.service.getPets();
	}
}
