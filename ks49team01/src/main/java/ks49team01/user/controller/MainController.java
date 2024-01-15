package ks49team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userMainController")
@RequestMapping("/user")
public class MainController {

	@GetMapping(value={"","/"})
	public String mainPage() {
		
		return "user/main";
	}
}
