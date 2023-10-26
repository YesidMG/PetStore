package co.edu.uptc.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uptc.project.model.Pet;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Integer> {

}
