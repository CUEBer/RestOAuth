package edu.cueb.degree.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import edu.cueb.degree.model.Account;
import edu.cueb.degree.model.AccountRepository;
import edu.cueb.degree.model.Discipline;
import edu.cueb.degree.model.DisciplineRepository;

@RestController
public class AppController {
	@Autowired
	private AccountRepository accountRepsoitory;
	@Autowired
	private DisciplineRepository disciplineRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/account/{accountId}")
	Account readAccount(@PathVariable String accountId) {
		if(StringUtils.isEmpty(accountId)||"undefined".equals(accountId)){
			return null;
		}
		return this.accountRepsoitory.findById(accountId).get();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/discipline/{disciplineId}")
	Discipline readDiscipline(@PathVariable String disciplineId) {
		return this.disciplineRepository.findById(disciplineId).get();
	}

	@RequestMapping(value = { "/discipline/basics" }, method = RequestMethod.POST)
	public ResponseEntity<String> updateBasics(@RequestBody Discipline body) throws JsonProcessingException {
		System.out.println("Request received " + body.getKeyDate());
		Discipline discipline = this.disciplineRepository.findById(body.getId()).get();
		discipline.setDoctor(body.isDoctor());
		discipline.setMaster(body.isMaster());
		discipline.setKeyDiscipline(body.isKeyDiscipline());
		discipline.setKeyDate(body.getKeyDate());
		disciplineRepository.save(discipline);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
}