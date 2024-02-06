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
		model.addAttribute("page","결제 금액");
		model.addAttribute("getTotalPriceList", getTotalPriceList);
		
		return "admin/final_total_price/final_total_price_get";
	}

	@GetMapping("/calcFinalTotalPriceRoyality")
	public String calcFinalTotalPriceRoyality(Model model) {
		
		List<AdminTotalPrice> getTotalPriceList = adminTotalPriceService.AdminTotalPriceList();
		
		log.info("getTotalPriceList : {}", getTotalPriceList);
		model.addAttribute("page","결제 별 로열티 납부");
		model.addAttribute("getTotalPriceList", getTotalPriceList);
		
		return "admin/final_total_price/final_total_price_royality_calc";
	}
	
	
	// 예약일자될 때 결제 완료 처리 
	@GetMapping("/calcFinalTotalPriceDueTo")
	public String calcFinalTotalPriceDueTo(Model model) {
		
		log.info("finalTotalPriceDueTo");
		model.addAttribute("page","결제 금액 예정");
		
		return "admin/final_total_price/final_total_price_due_to_calc";
	}
}
