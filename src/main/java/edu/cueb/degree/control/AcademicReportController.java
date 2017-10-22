package edu.cueb.degree.control;

import edu.cueb.degree.model.AcademicReport;
import edu.cueb.degree.repository.AcademicReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("academicReport")
public class AcademicReportController {
    @Autowired
    private AcademicReportRepository academicReportRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    AcademicReport add(AcademicReport academicReport0){
        return this.academicReportRepository.save(academicReport0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(AcademicReport academicReport1){
        this.academicReportRepository.save(academicReport1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    AcademicReport update(AcademicReport academicReport2) {
        return this.academicReportRepository.save(academicReport2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query")
    AcademicReport query(AcademicReport academicReport3){
        return this.academicReportRepository.save(academicReport3);
    }
}
