package edu.cueb.degree.control;

import edu.cueb.degree.model.Structure;
import edu.cueb.degree.model.TeamStructure;
import edu.cueb.degree.repository.TeamStructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teamStructure")
public class TeamStructureController {
    @Autowired
    private TeamStructureRepository teamStructureRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    TeamStructure add(TeamStructure teamStructure) {
        return this.teamStructureRepository.save(teamStructure);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/query/{teamStructureId}")
    TeamStructure get(@PathVariable Integer teamStructureId) {
        TeamStructure rs = this.teamStructureRepository.findById(teamStructureId).get();
        return rs;
    }
}