package edu.cueb.degree.repository;

import edu.cueb.degree.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository<Discipline, String> {
}