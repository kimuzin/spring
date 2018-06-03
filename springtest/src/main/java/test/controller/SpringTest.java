package test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import test.entity.SpringVO;

@Controller
public class SpringTest {

	public SpringTest() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value="/stringTest", method=RequestMethod.GET)
	private @ResponseBody String stringTest() {
		 
		return "string hello111122332";
	}
	
	@RequestMapping(value="/responseEntity", method=RequestMethod.GET)
	private ResponseEntity<SpringVO> responseEntity(){
		SpringVO springvo = new SpringVO();
		springvo.setName1("test111");
		springvo.setName2("test2222");
		return new ResponseEntity<SpringVO>(springvo, HttpStatus.OK);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
	}

}
