package org.me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeControler {

	@Autowired
	//ConferenceService conferenceSerive;
	@GetMapping(value="/home/{id}"/*,produces={MediaType.APPLICATION_JSON_VALUE}*/)
	@ResponseStatus(code=HttpStatus.OK)
	//@ResponseBody
	
	 String index(@PathVariable("id") String id){
		
		System.out.println("My Request Id is "+id);
		//conferenceSerive.getCommiteOfConference(Long.valueOf(id));
		//return "You are Welcome"
		//conferenceSerive.getCommiteByName("");
		return "welcome";
	}
}
