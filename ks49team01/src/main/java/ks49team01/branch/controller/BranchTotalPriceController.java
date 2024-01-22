package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchTotalPrice;
import ks49team01.branch.service.BranchTotalPriceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/finalTotalPrice")
@Slf4j
@AllArgsConstructor
public class BranchTotalPriceController {

	private final BranchTotalPriceService branchTotalPriceService;
	
	@GetMapping("/getFinalTotalPrice")
	public String getFinalTotalPrice(Model model) {
		
		List<BranchTotalPrice> getBranchTotalPrice = branchTotalPriceService.BranchTotalPriceList();
		log.info("getBranchTotalPrice : {}", getBranchTotalPrice);
		model.addAttribute("page","최종 금액 결제");
		model.addAttribute("getBranchTotalPrice", getBranchTotalPrice);
		
		return "branch/final_total_price/final_total_price_get";
	}
	
	@GetMapping("/calcFinalTotalPriceDueTo")
	public String calcFinalTotalPriceDueTo(Model model) {
		
		log.info("finalTotalPriceDueTo");
		model.addAttribute("page","최종 금액 결제 예정");
		
		return "branch/final_total_price/final_total_price_due_to_calc";
	}
}
