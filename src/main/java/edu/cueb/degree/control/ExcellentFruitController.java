package edu.cueb.degree.control;

import edu.cueb.degree.model.ExcellentFruit;
import edu.cueb.degree.repository.ExcellentFruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("excellentfruit")
public class ExcellentFruitController {
    @Autowired
    private ExcellentFruitRepository excellentFruitRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    ExcellentFruit add(ExcellentFruit excellentFruit0){
        return this.excellentFruitRepository.save(excellentFruit0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(ExcellentFruit excellentFruit1){
        this.excellentFruitRepository.delete(excellentFruit1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    ExcellentFruit update(ExcellentFruit excellentFruit2){
        return this.excellentFruitRepository.save(excellentFruit2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{ExcellentFruitId}")
    ExcellentFruit get(@PathVariable int excellentFruitId){
        return this.excellentFruitRepository.findById(excellentFruitId).get();
    }
}
