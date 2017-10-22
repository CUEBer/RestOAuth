package edu.cueb.degree.control;

import edu.cueb.degree.model.CrossingMoney;

import edu.cueb.degree.repository.CrossingMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crossingMoney")
public class CrossingMoneyController {
    @Autowired
    private CrossingMoneyRepository crossingMoneyRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    CrossingMoney add(CrossingMoney crossingMoney0){
        return this.crossingMoneyRepository.save(crossingMoney0);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(CrossingMoney crossingMoney1){
        this.crossingMoneyRepository.delete(crossingMoney1);
    }
    @RequestMapping(method = RequestMethod.POST,value = "update")
    CrossingMoney update(CrossingMoney crossingMoney2){
        return this.crossingMoneyRepository.save(crossingMoney2);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query")
    CrossingMoney query(CrossingMoney crossingMoney3){
        return this.crossingMoneyRepository.save(crossingMoney3);
    }
}