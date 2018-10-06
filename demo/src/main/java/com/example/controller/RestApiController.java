package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@RequestMapping(value="/rest", method=RequestMethod.GET)
	public String rest(){		
		return "rest return";
	}
}
