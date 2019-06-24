package org1.me;

import org.apache.log4j.Logger;
import org.me.AppConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping(value="/",path="/")
public class ControllerAnnot {

	
	
	 
	    @RequestMapping(method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
	        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	        return "welcome";
	    }
	 
	    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	    public String sayHelloAgain(ModelMap model) {
	    	Logger myLog =Logger.getLogger(AppConfig.class);
	        myLog.debug("Creating view Resolver in Springbootapplication Config Class");
	    	model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
	        System.out.println("coucou");
	        return "you";
	    }
	 
	}
