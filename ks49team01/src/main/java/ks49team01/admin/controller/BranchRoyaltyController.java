package ks49team01.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BranchRoyaltyController {

	private static final Logger log = LoggerFactory.getLogger(BranchRoyaltyController.class);
	
	@GetMapping("/get_royalty")
	public String getBranchRoyalty(Model model) {
		
		model.addAttribute("title", "로열티목록조회");
		
		log.info("로열티목록조회");
		
		return "admin/bracnhRoyalty/get_royalty";
	}
}

