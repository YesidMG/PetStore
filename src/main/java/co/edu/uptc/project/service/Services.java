package co.edu.uptc.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uptc.project.repository.IPetRepository;

@Service
public class Services {

	@Autowired
	IPetRepository petRepository;
}

