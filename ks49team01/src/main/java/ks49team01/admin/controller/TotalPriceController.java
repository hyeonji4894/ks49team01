package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminTotalPrice;
import ks49team01.admin.service.AdminTotalPriceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/finalTotalPrice")
@Slf4j
@AllArgsConstructor
public class TotalPriceController {
	
	private final AdminTotalPriceService adminTotalPriceService;
	
	@GetMapping("/getFinalTotalPrice")
	public String getFinalTotalPrice(Model model) {
		
		List<AdminTotalPrice> getTotalPriceList = adminTotalPriceService.AdminTotalPriceList();
		
		log.info("getTotalPriceList : {}", getTotalPriceList);
		model.addAttribute("page","최종 금액 결제");
		model.addAttribute("getTotalPriceList", getTotalPriceList);
		
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
