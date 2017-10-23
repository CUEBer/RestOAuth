package edu.cueb.degree.control;

import edu.cueb.degree.model.TutorGuidance;
import edu.cueb.degree.repository.TutorGuidanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tutorguidance")
public class TutorGuidanceController {
    @Autowired
    private TutorGuidanceRepository tutorGuidanceRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    TutorGuidance add(TutorGuidance tutorGuidance){
        return this.tutorGuidanceRepository.save(tutorGuidance);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(TutorGuidance tutorGuidance){
        this.tutorGuidanceRepository.delete(tutorGuidance);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    TutorGuidance update(TutorGuidance tutorGuidance){
        return this.tutorGuidanceRepository.save(tutorGuidance);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{tutoGuidanceId}")
    TutorGuidance get(@PathVariable int tutorGuidanceId){
        return this.tutorGuidanceRepository.findById(tutorGuidanceId).get();
    }
}
