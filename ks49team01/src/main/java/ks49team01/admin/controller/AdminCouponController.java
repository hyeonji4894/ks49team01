package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminCoupon;
import ks49team01.admin.service.AdminCouponService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/coupon")
@AllArgsConstructor
@Slf4j
public class AdminCouponController {
	
	private AdminCouponService adminCouponService;
	
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
		
		List<AdminCoupon> adminCouponKind = adminCouponService.getCouponKind();
		
		log.info("adminCouponKind: {}",adminCouponKind);
		
		model.addAttribute("title", "쿠폰 종류 조회");
		model.addAttribute("adminCouponKind", adminCouponKind );
		
	return "admin/coupon/get_coupon_kind";
	}
}