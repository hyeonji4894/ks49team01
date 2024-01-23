package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks49team01.admin.dto.AdminCoupon;
import ks49team01.admin.service.AdminCouponService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/coupon")
@AllArgsConstructor
@Slf4j
public class AdminCouponController {
	
	private final AdminCouponService adminCouponService;
	
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
	
	@PostMapping("/searchForCouponName")
	@ResponseBody
	public List<AdminCoupon> searchForCouponList(@RequestParam(value="searchCouponName") String couponName) {
		
		log.info("couponName: {}", couponName);
		
		 List<AdminCoupon> searchCouponNameList = adminCouponService.getSearchCouponName(couponName);
		
		return searchCouponNameList;
	}	
	
	@PostMapping("/searchForCouponPrice")
	@ResponseBody
	public List<AdminCoupon> searchForCouponPrice(@RequestParam(value="searchCouponPrice") int couponPrice) {
		
		log.info("couponPrice: {}", couponPrice);
		
		 List<AdminCoupon> searchCouponPriceList = adminCouponService.getSearchCouponPrice(couponPrice);
		
		return searchCouponPriceList;
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