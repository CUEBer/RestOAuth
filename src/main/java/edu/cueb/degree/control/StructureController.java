package edu.cueb.degree.control;

import edu.cueb.degree.model.Structure;
import edu.cueb.degree.repository.StructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("structure")
public class StructureController {
    @Autowired
    private StructureRepository structureRepository;

    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Structure add (Structure structure){return this.structureRepository.save(structure);}

    @RequestMapping(method=RequestMethod.GET,value = "/query/{disciplineId}")
    Structure get(@PathVariable Integer disciplineId){
        Structure rs=null;
        if(disciplineId!=null){
            rs=this.structureRepository.findById(disciplineId).get();
        }
        return rs;
    }
}
