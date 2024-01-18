package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/finalTotalPrice")
@Slf4j

public class TotalPriceController {

	@GetMapping("/getFinalTotalPrice")
	public String getFinalTotalPrice(Model model) {
		
		log.info("getFinalTotalPrice");
		model.addAttribute("page","최종 금액 결제");
		
		return "admin/final_total_price/final_total_price_get";
	}

	@GetMapping("/calcFinalTotalPriceRoyality")
	public String calcFinalTotalPriceRoyality(Model model) {
		
		log.info("calcFinalTotalPriceRoyality");
		model.addAttribute("page","건별 본사 납부 로열티");
		
		return "admin/final_total_price/final_total_price_royality_calc";
	}
	
	@GetMapping("/calcFinalTotalPriceDueTo")
	public String calcFinalTotalPriceDueTo(Model model) {
		
		log.info("finalTotalPriceDueTo");
		model.addAttribute("page","최종 금액 결제 예정");
		
		return "admin/final_total_price/final_total_price_due_to_calc";
	}
}
