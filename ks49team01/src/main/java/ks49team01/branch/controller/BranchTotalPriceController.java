package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/finalTotalPrice")
@Slf4j
public class BranchTotalPriceController {

	@GetMapping("/getFinalTotalPrice")
	public String getFinalTotalPrice(Model model) {
		
		log.info("getFinalTotalPrice");
		model.addAttribute("page","최종 금액 결제");
		
		return "branch/final_total_price/final_total_price_get";
	}
	
	@GetMapping("/calcFinalTotalPriceDueTo")
	public String calcFinalTotalPriceDueTo(Model model) {
		
		log.info("finalTotalPriceDueTo");
		model.addAttribute("page","최종 금액 결제 예정");
		
		return "branch/final_total_price/final_total_price_due_to_calc";
	}
}