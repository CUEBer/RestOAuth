package edu.cueb.degree.control;

import edu.cueb.degree.model.DegreeCourse;
import edu.cueb.degree.repository.DegreeCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("degreecourse")
public class DegreeCourseController {
    @Autowired
    private DegreeCourseRepository degreeCourseRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    DegreeCourse add(DegreeCourse degreeCourse){
        return this.degreeCourseRepository.save(degreeCourse);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(DegreeCourse degreeCourse){
         this.degreeCourseRepository.delete(degreeCourse);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    DegreeCourse update(DegreeCourse degreeCourse) {
        return this.degreeCourseRepository.save(degreeCourse);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{DegreeCourseId}")
    DegreeCourse query(@PathVariable String degreeCourseId) {
        return this.degreeCourseRepository.findById(degreeCourseId).get();
    }
}
