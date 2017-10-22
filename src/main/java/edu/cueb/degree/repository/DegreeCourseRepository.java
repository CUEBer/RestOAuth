package edu.cueb.degree.repository;

import edu.cueb.degree.model.DegreeCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeCourseRepository extends JpaRepository<DegreeCourse,String> {
}
