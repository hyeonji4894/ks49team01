package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/bracnhRoyalty")
@Slf4j
public class BranchRoyaltyController {

	
	@GetMapping("/getRoyalty")
	public String getBranchRoyalty(Model model) {
		
		model.addAttribute("title", "로열티목록조회");
		
		log.info("로열티목록조회");
		
		return "branch/bracnhRoyalty/get_royalty";
	}
}

