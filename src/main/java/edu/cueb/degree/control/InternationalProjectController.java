package edu.cueb.degree.control;

import edu.cueb.degree.model.InternationalProject;
import edu.cueb.degree.repository.InternationalProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("internationalProject")
public class InternationalProjectController {
    @Autowired
    private InternationalProjectRepository internationalProjectRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    InternationalProject add(InternationalProject internationalProject){
        return this.internationalProjectRepository.save(internationalProject);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(InternationalProject internationalProject){
        this.internationalProjectRepository.delete(internationalProject);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    InternationalProject update(InternationalProject internationalProject){
        return this.internationalProjectRepository.save(internationalProject);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{InternationalProjectId}")
    InternationalProject query(@PathVariable String internationalProjectId){
        return this.internationalProjectRepository.findById(internationalProjectId).get();
    }
}
