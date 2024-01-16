package ks49team01.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BranchSalesController {

	
	private static final Logger log = LoggerFactory.getLogger(BranchSalesController.class);
	
	@GetMapping("/get_branch_sales")
	public String getBranchSales(Model model) {
		
		model.addAttribute("title", "가맹점 매출 조회");
		
		log.info("가맹점 매출 조회");
		
		return "admin/branchSales/get_branch_sales";
	}
}
