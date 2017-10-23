package edu.cueb.degree.control;

import edu.cueb.degree.model.*;
import edu.cueb.degree.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("school")
public class SchoolController {
	@Autowired
	private SchoolRepository schoolRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	School add(School school) {
		return this.schoolRepository.saveAndFlush(school);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/query/{schoolId}")
	School get(@PathVariable Integer schoolId) {
		School rs=null;
		if(schoolId!=null){
			rs= this.schoolRepository.findById(schoolId).get();
		}
		return rs;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/update")
	School update(School school) {
		School rs= this.schoolRepository.saveAndFlush(school);
		return rs;
	}
}