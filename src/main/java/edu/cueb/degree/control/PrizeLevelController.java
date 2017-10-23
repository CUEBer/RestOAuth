package edu.cueb.degree.control;

import edu.cueb.degree.model.PrizeLevel;
import edu.cueb.degree.repository.PrizeLevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nationalprizeLevel")
public class PrizeLevelController {
   @Autowired
   private PrizeLevelRepository prizeLevelRepository;
   @RequestMapping(method = RequestMethod.POST,value = "/add")
   PrizeLevel add(PrizeLevel prizeLevel0){
       return this.prizeLevelRepository.save(prizeLevel0);
   }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(PrizeLevel prizeLevel){
         this.prizeLevelRepository.delete(prizeLevel);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    PrizeLevel update(PrizeLevel prizeLevel2){
        return this.prizeLevelRepository.save(prizeLevel2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{PrizeLevelId}")
    PrizeLevel query(@PathVariable String prizeLevelId){
        return this.prizeLevelRepository.findById(prizeLevelId).get();
    }
}
