package edu.cueb.degree.control;

import edu.cueb.degree.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("school")
public class SchoolController {
	@Autowired
	private SchoolRepository schoolRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	School add(School school) {
		return this.schoolRepository.save(school);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/query")
	School get(School school) {
		School rs= this.schoolRepository.findById(1).get();
		return rs;
	}
}