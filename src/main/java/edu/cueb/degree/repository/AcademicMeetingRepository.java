package edu.cueb.degree.repository;

import edu.cueb.degree.model.AcademicMeeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicMeetingRepository extends JpaRepository<AcademicMeeting,String> {
}
