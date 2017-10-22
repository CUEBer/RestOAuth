package edu.cueb.degree.control;

import edu.cueb.degree.model.TextConstruction;
import edu.cueb.degree.repository.TextConstructionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("textConstruction")
public class TextConstructionController {
    @Autowired
    private TextConstructionRepository textConstructionRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    TextConstruction add(TextConstruction textConstruction){
        return this.textConstructionRepository.save(textConstruction);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(TextConstruction textConstruction){
        this.textConstructionRepository.save(textConstruction);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    TextConstruction update(TextConstruction textConstruction){
        return this.textConstructionRepository.save(textConstruction);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{textContructionId}")
    TextConstruction query(@PathVariable String textConstructionId){
        return this.textConstructionRepository.findById(textConstructionId).get();
    }
}
