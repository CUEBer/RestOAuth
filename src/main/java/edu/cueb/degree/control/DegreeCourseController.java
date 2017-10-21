package edu.cueb.degree.control;

import edu.cueb.degree.model.DegreeCourse;
import edu.cueb.degree.model.DegreeCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("degreeCourse")
public class DegreeCourseController {
    @Autowired
    private DegreeCourseRepository degreeCourseRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    DegreeCourse add(DegreeCourse degreeCourse0){
        return this.degreeCourseRepository.save(degreeCourse0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(DegreeCourse degreeCourse1){
         this.degreeCourseRepository.delete(degreeCourse1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    DegreeCourse update(DegreeCourse degreeCourse2) {
        return this.degreeCourseRepository.save(degreeCourse2);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/query")
    DegreeCourse query(DegreeCourse degreeCourse3) {
        return this.degreeCourseRepository.save(degreeCourse3);
    }
}
