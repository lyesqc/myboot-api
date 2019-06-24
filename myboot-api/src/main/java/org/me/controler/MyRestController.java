package org.me.controler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dta.PersonType;
import org.me.models.Commite;
import org.me.models.MembreComite;
import org.me.services.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {

	@Autowired
	ConferenceService conferenceSerive;
	
	@RequestMapping(value="/info/{id}",produces="application/json")
	List<MembreComite>  getInfoById(@PathVariable("id") int id){
		System.out.println("Coucou");
		Commite cm = conferenceSerive.getCommiteById(Long.valueOf(id));
//		cm.getComite_mbr().stream().forEach((MembreComite e) ->System.out.println(e.));
		
		
		
		return cm.getComite_mbr();
	}
	
	@ResponseBody
	@RequestMapping(value="/persontype")
	List<PersonType> getPersonType(){
		System.out.println("Call me");
		return new ArrayList(Arrays.asList(new PersonType("Employee"), new PersonType("Etudiant"),new PersonType("sous-traitant")));
	}
}
