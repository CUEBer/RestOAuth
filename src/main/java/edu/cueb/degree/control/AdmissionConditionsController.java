package edu.cueb.degree.control;

import edu.cueb.degree.model.AdmissionConditions;
import edu.cueb.degree.model.AdmissionConditionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admissionConditions")
public class AdmissionConditionsController {
    @Autowired
    private AdmissionConditionsRepository admissionConditionsRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    AdmissionConditions add(AdmissionConditions admissionConditions0){
        return this.admissionConditionsRepository.save(admissionConditions0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(AdmissionConditions admissionConditions1){
        this.admissionConditionsRepository.delete(admissionConditions1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    AdmissionConditions update(AdmissionConditions admissionConditions2){
        return this.admissionConditionsRepository.save(admissionConditions2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query")
    AdmissionConditions query(AdmissionConditions admissionConditions3){
        return this.admissionConditionsRepository.save(admissionConditions3);
    }
}
