package edu.cueb.degree.control;

import edu.cueb.degree.model.AcademicMeeting;
import edu.cueb.degree.model.AcademicPractice;
import edu.cueb.degree.repository.AcademicMeetingRepository;
import edu.cueb.degree.repository.AcademicPracticeRepository;
import edu.cueb.degree.repository.AcademicMeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("academicmeeting")
public class AcademicMeetingController {
    @Autowired
    private AcademicMeetingRepository academicMeetingRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    AcademicMeeting add(AcademicMeeting academicMeeting){
        return this.academicMeetingRepository.save(academicMeeting);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(AcademicMeeting academicMeeting){
        this.academicMeetingRepository.delete(academicMeeting);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    AcademicMeeting update(AcademicMeeting academicMeeting){
        return this.academicMeetingRepository.save(academicMeeting);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/add/{AcademicMeetingId}")
    AcademicMeeting add(@PathVariable String academicMeetingId){
        return this.academicMeetingRepository.findById(academicMeetingId).get();
    }
}
