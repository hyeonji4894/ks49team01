package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminRoyalty;
import ks49team01.admin.service.AdminRoyaltyService;
import ks49team01.admin.service.AdminUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/bracnhRoyalty")
@AllArgsConstructor
@Slf4j
public class AdminRoyaltyController {

	private final AdminRoyaltyService adminRoyaltyService;

	
	@GetMapping("/getRoyalty")
	public String getBranchRoyalty(Model model) {
		
		model.addAttribute("title", "로열티목록조회");
		
		List<AdminRoyalty> royaltyList = adminRoyaltyService.getRoyaltyList();
		log.info("로열티목록조회");
		model.addAttribute("title", "로열티");
		model.addAttribute("royaltyList", royaltyList);
		
		return "admin/bracnhRoyalty/get_royalty";
	}
}

