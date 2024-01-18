package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/branch/option")
public class BranchOptionController {
	

	
	// 객실옵션
	
	@GetMapping("/roomOptionList")
	public String roomOptionList(Model model) {
	
		log.info("객실옵션조회");
		
		model.addAttribute("pageTitle", "객실옵션리스트 조회");
		
		return "branch/option/get_room_option";
	}

}
