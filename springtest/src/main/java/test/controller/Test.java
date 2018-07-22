package test.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;

@Controller
public class Test {
	
	private @RequestWrapper String stringTest() {
		 
		return "string hello111122332";
	}
}
