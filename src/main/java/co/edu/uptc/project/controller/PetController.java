package co.edu.uptc.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uptc.project.service.Services;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private Services service;

	
}
