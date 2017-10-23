package edu.cueb.degree.repository;

import edu.cueb.degree.model.EmploymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentStatusRepository extends JpaRepository<EmploymentStatus,String> {
}
