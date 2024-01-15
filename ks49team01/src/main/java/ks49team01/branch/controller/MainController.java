package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("/branchMainController")
@RequestMapping("/branch")
public class MainController {

	@GetMapping(value={"","/"})
	public String mainPage() {
		
		return "branch/main";
	}
}
