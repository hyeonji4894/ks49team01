package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/mileage")
@Slf4j
public class AdminMileageController {
	
	@GetMapping("/addPaymentCriteriaMileage")
	public String addPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 등록");
		
		model.addAttribute("title", "결제 기준 적립금 등록");
		
	return "admin/pay_mileage/add_payment_criteria_mileage";
	}
	
	@GetMapping("/modifyPaymentCriteriaMileage")
	public String modifyPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 수정");
		
		model.addAttribute("title", "결제 기준 적립금 수정");
		
	return "admin/pay_mileage/modify_payment_criteria_mileage";
	}
	
	@GetMapping("/removePaymentCriteriaMileage")
	public String removePaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 삭제");
		
		model.addAttribute("title", "결제 기준 적립금 삭제");
		
	return "admin/pay_mileage/remove_payment_criteria_mileage";
	}
	
	@GetMapping("/getPaymentCriteriaMileage")
	public String getPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 조회");
		
		model.addAttribute("title", "결제 기준 적립금 조회");
		
	return "admin/pay_mileage/get_payment_criteria_mileage";
	}
	
	@GetMapping("/addReviewMileageCriteria")
	public String addReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 등록");
		
		model.addAttribute("title", "리뷰 적립금기준 등록");
		
	return "admin/review_mileage/add_review_mileage_criteria";
	}
	
	@GetMapping("/modifyReviewMileageCriteria")
	public String modifyReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 수정");
		
		model.addAttribute("title", "리뷰 적립금기준 수정");
		
	return "admin/review_mileage/modify_review_mileage_criteria";
	}
	
	@GetMapping("/removeReviewMileageCriteria")
	public String removeReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 삭제");
		
		model.addAttribute("title", "리뷰 적립금기준 삭제");
		
	return "admin/review_mileage/remove_review_mileage_criteria";
	}
	
	@GetMapping("/getReviewMileageCriteria")
	public String getReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 조회");
		
		model.addAttribute("title", "리뷰 적립금기준 조회");
		
	return "admin/review_mileage/get_review_mileage_criteria";
	}
}