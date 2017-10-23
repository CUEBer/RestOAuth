package edu.cueb.degree.control;

import edu.cueb.degree.model.AcademicPractice;
import edu.cueb.degree.repository.AcademicPracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("academicpractice")
public class AcademicPracticeController {
    @Autowired
    private AcademicPracticeRepository academicPracticeRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    AcademicPractice add(AcademicPractice academicPractice){
        return this.academicPracticeRepository.save(academicPractice);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(AcademicPractice academicPractice){
        this.academicPracticeRepository.delete(academicPractice);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    AcademicPractice update(AcademicPractice academicPractice){
        return this.academicPracticeRepository.save(academicPractice);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{AcademicPracticeId}")
    AcademicPractice query(@PathVariable String academicPracticeId){
        return this.academicPracticeRepository.findById(academicPracticeId).get();
    }
}
