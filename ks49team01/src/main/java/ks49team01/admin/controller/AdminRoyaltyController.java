package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/bracnhRoyalty")
@Slf4j
public class AdminRoyaltyController {

	
	@GetMapping("/getRoyalty")
	public String getBranchRoyalty(Model model) {
		
		model.addAttribute("title", "로열티목록조회");
		
		log.info("로열티목록조회");
		
		return "admin/bracnhRoyalty/get_royalty";
	}
}

