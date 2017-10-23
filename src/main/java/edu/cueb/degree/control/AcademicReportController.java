package edu.cueb.degree.control;

import edu.cueb.degree.model.AcademicReport;
import edu.cueb.degree.repository.AcademicReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("academicreport")
public class AcademicReportController {
    @Autowired
    private AcademicReportRepository academicReportRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    AcademicReport add(AcademicReport academicReport){
        return this.academicReportRepository.save(academicReport);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(AcademicReport academicReport){
        this.academicReportRepository.save(academicReport);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    AcademicReport update(AcademicReport academicReport) {
        return this.academicReportRepository.save(academicReport);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{AcademicaReportId}")
    AcademicReport query(@PathVariable String academicReportId){
        return this.academicReportRepository.findById(academicReportId).get();
    }
}
