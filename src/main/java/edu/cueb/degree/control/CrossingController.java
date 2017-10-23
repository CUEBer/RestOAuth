package edu.cueb.degree.control;


import edu.cueb.degree.model.Crossing;

import edu.cueb.degree.repository.CrossingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crossing")
public class CrossingController {
    @Autowired
    private CrossingRepository crossingRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    Crossing add(Crossing crossing0) {
        return this.crossingRepository.save(crossing0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(Crossing crossing1){
        this.crossingRepository.delete(crossing1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "update")
    Crossing update(Crossing crossing2){
        return this.crossingRepository.save(crossing2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{CrossingId}")
    Crossing query(@PathVariable String crossingId){
      return this.crossingRepository.findById(crossingId).get();
    }
}
