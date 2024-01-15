package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/coupon")
@Slf4j
public class BranchCouponController {

	@GetMapping("/sendCoupon")
	public String sendCoupon(Model model){
		
		log.info("쿠폰 지급");
		
		model.addAttribute("title", "쿠폰 지급");
		
	return "/branch/coupon/send_coupon";
	}
	
	@GetMapping("/modifyCoupon")
	public String modifyCoupon(Model model){
		
		log.info("쿠폰 수정");
		
		model.addAttribute("title", "쿠폰 수정");
		
	return "/branch/coupon/modify_coupon";
	}
	
	@GetMapping("/removeCoupon")
	public String removeCoupon(Model model){
		
		log.info("쿠폰 삭제");
		
		model.addAttribute("title", "쿠폰 삭제");
		
	return "/branch/coupon/remove_coupon";
	}
	
	@GetMapping("/getCouponList")
	public String getCouponList(Model model){
		
		log.info("쿠폰 목록 조회");
		
		model.addAttribute("title", "쿠폰 목록 조회");
		
	return "/branch/coupon/get_coupon_list";
	}
	
}
