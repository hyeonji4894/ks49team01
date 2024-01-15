package ks49team01.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CommonContoroller {
	
	@GetMapping(value = {"","/"})
	public String index() {
		
		return "common/index";
	}
	

}
