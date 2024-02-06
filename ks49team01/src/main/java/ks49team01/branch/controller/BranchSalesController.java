package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
@RequestMapping("/branch/branchSales")
@Controller
@Slf4j
public class BranchSalesController {

	
	
	@GetMapping("/getBranchSales")
	public String getBranchSales(Model model) {
		
		model.addAttribute("title", "가맹점 매출 조회");
		
		log.info("가맹점 매출 조회");
		
		return "branch/branchSales/get_branch_sales";
	}
}
