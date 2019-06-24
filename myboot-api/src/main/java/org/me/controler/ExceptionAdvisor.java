package org.me.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAdvisor {
	
	
	@ResponseBody
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(RuntimeException.class)
	public MyError HandelMe(HttpServletRequest req,RuntimeException ex){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception",ex);
		mv.setViewName("exception");
		MyError l = new MyError();
		l.errormessage="Error";
		ResponseEntity ent = new ResponseEntity<MyError>(HttpStatus.NOT_FOUND);
		
		return l;
	}

}
