package edu.cueb.degree.control;

import edu.cueb.degree.model.JoinMeeting;
import edu.cueb.degree.repository.JoinMeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("joinMeeting")
public class JoinMeetingController {
    @Autowired
    private JoinMeetingRepository joinMeetingRepository;
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    JoinMeeting add(JoinMeeting joinMeeting){
        return this.joinMeetingRepository.save(joinMeeting);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    void delete(JoinMeeting joinMeeting){
        this.joinMeetingRepository.delete(joinMeeting);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/update")
    JoinMeeting update(JoinMeeting joinMeeting){
        return this.joinMeetingRepository.save(joinMeeting);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/query/{JoinMeetingId}")
    JoinMeeting query(@PathVariable String joinMeetingId){
        return this.joinMeetingRepository.findById(joinMeetingId).get();
    }
}
