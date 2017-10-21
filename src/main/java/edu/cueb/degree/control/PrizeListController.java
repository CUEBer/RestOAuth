package edu.cueb.degree.control;

import edu.cueb.degree.model.PrizeList;
import edu.cueb.degree.model.PrizeListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prizeList")
public class PrizeListController {

    @Autowired
    private PrizeListRepository prizeListRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    PrizeList add(PrizeList prizeList0){
        return this.prizeListRepository.save(prizeList0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(PrizeList prizeList1){
         this.prizeListRepository.delete(prizeList1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    PrizeList update(PrizeList prizeList2){
        return this.prizeListRepository.save(prizeList2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query")
    PrizeList query(PrizeList prizeList3){
         return this.prizeListRepository.save(prizeList3);
    }
}
