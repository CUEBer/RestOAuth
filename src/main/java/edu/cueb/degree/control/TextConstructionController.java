package edu.cueb.degree.control;

import edu.cueb.degree.model.TextConstruction;
import edu.cueb.degree.model.TextConstructionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("textConstruction")
public class TextConstructionController {
    @Autowired
    private TextConstructionRepository textConstructionRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    TextConstruction add(TextConstruction textConstruction0){
        return this.textConstructionRepository.save(textConstruction0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(TextConstruction textConstruction1){
        this.textConstructionRepository.save(textConstruction1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    TextConstruction update(TextConstruction textConstruction2){
        return this.textConstructionRepository.save(textConstruction2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query")
    TextConstruction query(TextConstruction textConstruction3){
        return this.textConstructionRepository.save(textConstruction3);
    }
}
