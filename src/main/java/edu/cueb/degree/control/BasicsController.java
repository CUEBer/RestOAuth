package edu.cueb.degree.control;

import edu.cueb.degree.model.Basics;


import edu.cueb.degree.model.BasicsRepository;
import edu.cueb.degree.model.Crossing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("basics")

public class BasicsController {
    @Autowired
    private BasicsRepository basicsRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    Basics add(Basics basics0) {
        return this.basicsRepository.save(basics0);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/delete")
    void delete(Basics basics1) {
         this.basicsRepository.delete(basics1);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/update")
    Basics updte(Basics basics2) {
        return this.basicsRepository.save(basics2);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/query")
    void query(Basics basics3) {
            this.basicsRepository.save(basics3);
    }
}
