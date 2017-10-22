package edu.cueb.degree.repository;

import edu.cueb.degree.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
	 
}
