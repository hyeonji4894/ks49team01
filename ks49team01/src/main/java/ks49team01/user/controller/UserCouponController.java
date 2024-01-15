package ks49team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user/coupon")
@Slf4j
public class UserCouponController {

	@GetMapping("/getCouponList")
	public String getCouponList(Model model){
		
		log.info("쿠폰 목록 조회");
		
		model.addAttribute("title", "쿠폰 목록 조회");
		
	return "/user/coupon/get_coupon_list";
	}
}
