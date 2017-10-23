package edu.cueb.degree.control;

import edu.cueb.degree.model.AdmissionConditions;
import edu.cueb.degree.repository.AdmissionConditionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admissionConditions")
public class AdmissionConditionsController {
    @Autowired
    private AdmissionConditionsRepository admissionConditionsRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    AdmissionConditions add(AdmissionConditions admissionConditions){
        return this.admissionConditionsRepository.save(admissionConditions);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(AdmissionConditions admissionConditions){
        this.admissionConditionsRepository.delete(admissionConditions);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    AdmissionConditions update(AdmissionConditions admissionConditions){
        return this.admissionConditionsRepository.save(admissionConditions);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{AdmissionConditionsId}")
    AdmissionConditions query(@PathVariable String admissionConditionsId){
        return this.admissionConditionsRepository.findById(admissionConditionsId).get();
    }
}
