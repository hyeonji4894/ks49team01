package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchCoupon;
import ks49team01.branch.service.BranchCouponService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/coupon")
@Slf4j
@AllArgsConstructor
public class BranchCouponController {

	private BranchCouponService branchCouponService;
	
	@GetMapping("/sendCoupon")
	public String sendCoupon(Model model){
		
		List<BranchCoupon> branchSendCouponList = branchCouponService.getSendCouponList();
		
		log.info("branchSendCouponList: {}", branchSendCouponList);
		
		model.addAttribute("title", "쿠폰 지급");
		model.addAttribute("branchSendCouponList", branchSendCouponList);
		
	return "branch/coupon/send_coupon";
	}
	
	@GetMapping("/modifyCoupon")
	public String modifyCoupon(Model model){
		
		log.info("쿠폰 수정");
		
		model.addAttribute("title", "쿠폰 수정");
		
	return "branch/coupon/modify_coupon";
	}
	
	@GetMapping("/removeCoupon")
	public String removeCoupon(Model model){
		
		log.info("쿠폰 삭제");
		
		model.addAttribute("title", "쿠폰 삭제");
		
	return "branch/coupon/remove_coupon";
	}
	
	@GetMapping("/getCouponList")
	public String getCouponList(Model model){
		
		List<BranchCoupon> branchCouponList = branchCouponService.getCouponList();
		
		log.info("branchCouponList: {}", branchCouponList);
		
		model.addAttribute("title", "쿠폰 목록 조회");
		model.addAttribute("branchCouponList", branchCouponList);
		
	return "branch/coupon/get_coupon_list";
	}
	
}
