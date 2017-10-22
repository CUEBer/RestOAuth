package edu.cueb.degree.control;

import edu.cueb.degree.model.Amount;
import edu.cueb.degree.model.Structure;
import edu.cueb.degree.repository.StructureRepository;
import edu.cueb.degree.repository.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
@RequestMapping
public class AmountController {
    @Autowired
    private AmountRepository amountRepository;

    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Amount add (Amount amount){return this.amountRepository.save(amount);}

    @RequestMapping(method=RequestMethod.GET,value = "/query/{amountId}")
    Amount get(@PathVariable Integer amountId){
        return this.amountRepository.findById(amountId).get();

    }
}
