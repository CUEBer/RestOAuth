package edu.cueb.degree.control;

import edu.cueb.degree.model.EmploymentStatus;
import edu.cueb.degree.repository.EmploymentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employmentstatus")
public class EmploymentStatusController {
    @Autowired
    private EmploymentStatusRepository employmentStatusRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    EmploymentStatus add(EmploymentStatus employmentStatus){
        return this.employmentStatusRepository.save(employmentStatus);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(EmploymentStatus employmentStatus){
        this.employmentStatusRepository.delete(employmentStatus);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    EmploymentStatus update(EmploymentStatus employmentStatus){
        return this.employmentStatusRepository.save(employmentStatus);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{EmploymentStatusId}")
    EmploymentStatus add(@PathVariable String employmentStatusId){
        return this.employmentStatusRepository.findById(employmentStatusId).get();
    }
}
