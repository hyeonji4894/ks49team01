package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminSales;
import ks49team01.admin.service.AdminSalesService;
import ks49team01.admin.service.AdminUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RequestMapping("/admin/branchSales")
@AllArgsConstructor
@Controller
@Slf4j
public class AdminSalesController {

	private AdminSalesService adminSalesService;
	
	@GetMapping("/getBranchSales")
	public String getBranchSalesList(Model model) {
		
		List<AdminSales> branchSalesList = adminSalesService.getBranchSalesList();
		
		model.addAttribute("title", "가맹점 매출 조회");
		model.addAttribute("branchSalesList", branchSalesList);
		
		log.info("branchSalesList: {}", branchSalesList);
		
		return "admin/branchSales/get_branch_sales";
	}
}
