package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/coupon")
@Slf4j
public class AdminCouponController {
	
	@GetMapping("/addCouponKind")
	public String addCouponKind(Model model){
		
		log.info("쿠폰 종류 등록");
		
		model.addAttribute("title", "쿠폰 종류 등록");
		
	return "admin/coupon/add_coupon_kind";
	}
	
	@GetMapping("/modifyCouponKind")
	public String modifyCouponKind(Model model){
		
		log.info("쿠폰 종류 수정");
		
		model.addAttribute("title", "쿠폰 종류 수정");
		
	return "admin/coupon/modify_coupon_kind";
	}
	
	@GetMapping("/removeCouponKind")
	public String removeCouponKind(Model model){
		
		log.info("쿠폰 종류 삭제");
		
		model.addAttribute("title", "쿠폰 종류 삭제");
		
	return "admin/coupon/remove_coupon_kind";
	}
	
	@GetMapping("/getCouponKind")
	public String getCouponKind(Model model){
		
		log.info("쿠폰 종류 조회");
		
		model.addAttribute("title", "쿠폰 종류 조회");
		
	return "admin/coupon/get_coupon_kind";
	}
}