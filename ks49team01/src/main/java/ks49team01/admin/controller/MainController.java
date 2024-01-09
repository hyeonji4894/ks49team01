package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminMainController")
@RequestMapping("/admin")
public class MainController {

	@GetMapping(value={"","/"})
	public String mainPage() {
		
		return "admin/main";
	}
}
