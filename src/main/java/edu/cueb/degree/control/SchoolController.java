package edu.cueb.degree.control;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.cueb.degree.model.*;
import edu.cueb.degree.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("school")
public class SchoolController {
	@Autowired
	private SchoolRepository schoolRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/query/{schoolId}")
	School get(@PathVariable Integer schoolId) {
		School rs=null;
		if(schoolId!=null){
			rs= this.schoolRepository.findById(schoolId).get();
		}
		return rs;
	}
	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public ResponseEntity<String> save(@RequestBody School body){
		this.schoolRepository.save(body);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
}