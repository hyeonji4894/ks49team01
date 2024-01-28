package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
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
	
	// 쿠폰종류 등록화면
	@GetMapping("/addCouponKind")
	public String addCouponKind(Model model){
		
		log.info("쿠폰종류 등록");
		
		model.addAttribute("title", "쿠폰종류 등록");
		
		return "/admin/coupon/add_coupon_kind";
	}
	
	// 쿠폰종류 등록
	@PostMapping("/addCouponKind")
	public String addCouponKind(AdminCoupon adminCoupon, HttpSession session){
		
		log.info("쿠폰 종류 등록 adminCoupon: {}", adminCoupon);
		
		adminCoupon.setMemberId("id001");
		
		adminCouponService.addCouponKind(adminCoupon);
		
		return "redirect:/admin/coupon/getCouponKind";
	}
	
	// 쿠폰종류 수정
	@PostMapping("/modifyCouponKind")
	public String modifyCouponKind(AdminCoupon adminCoupon, HttpSession session) {
		log.info("쿠폰종류 수정: {}", adminCoupon);
		
		// 특정코드로 수정
		adminCouponService.modifyCouponKind(adminCoupon);
		
		return "redirect:/admin/coupon/getCouponKind";
	}
	
	// 쿠폰종류 수정화면
	@GetMapping("/modifyCouponKind")
	public String modifyCouponKind(@RequestParam(value = "couponCode")String couponCode
									,Model model){
		
		log.info("쿠폰종류 수정화면 couponCode : {}", couponCode);
		
		// 특정코드 조회
		AdminCoupon adminCouponKind = adminCouponService.getCouponKindByCode(couponCode);
		
		model.addAttribute("adminCouponKind", adminCouponKind);
		
	return "admin/coupon/modify_coupon_kind";
	}
	
	// 쿠폰종류 삭제
	@GetMapping("/removeCouponKind")
	public String removeCouponKind(Model model){
		
		log.info("쿠폰 종류 삭제");
		
		model.addAttribute("title", "쿠폰 종류 삭제");
		
	return "admin/coupon/remove_coupon_kind";
	}
	
	// 쿠폰종류 이름 검색
	@PostMapping("/searchForCouponName")
	@ResponseBody
	public List<AdminCoupon> searchForCouponList(@RequestParam(value="searchCouponName") String couponName) {
		
		log.info("couponName: {}", couponName);
		
		 List<AdminCoupon> searchCouponNameList = adminCouponService.getSearchCouponName(couponName);
		
		 return searchCouponNameList;
		 
	}	
	
	// 쿠폰종류 가격검색
	@PostMapping("/searchForCouponPrice")
	@ResponseBody
	public List<AdminCoupon> searchCouponPrice(@RequestBody List<Map<String, Object>> paramList){
		
		log.info("paramList:{}" , paramList);
		paramList.forEach(searchMap -> {
			String searchKey = (String) searchMap.get("searchKey");
			switch (searchKey) {
				case "couponName" -> searchKey = "eck.coupon_name";
				case "couponMinPrice" -> {
					searchKey = "eck.coupon_price";
					searchMap.put("gubun", "min");
				}
				case "couponMaxPrice" -> {
					searchKey = "eck.coupon_price";
					searchMap.put("gubun", "max");
				}
			}
			searchMap.put("searchKey", searchKey);
		});
		log.info("paramList:{}" , paramList);
		
		List<AdminCoupon> searchCouponPrice = adminCouponService.getSearchCouponPrice(paramList);
		log.info("paramList:{}" , searchCouponPrice);
		return searchCouponPrice;
		
	}
	
	// 쿠폰종류 목록조회
	@GetMapping("/getCouponKind")
	public String getCouponKind(Model model){
		
		List<AdminCoupon> adminCouponKind = adminCouponService.getCouponKind();
		
		log.info("adminCouponKind: {}",adminCouponKind);
		
		model.addAttribute("title", "쿠폰 종류 조회");
		model.addAttribute("adminCouponKind", adminCouponKind );
		
	return "admin/coupon/get_coupon_kind";
	}
	
	
	
	
	// 쿠폰지급내역 목록조회
	@GetMapping("/getCouponList")
	public String getCouponList(Model model) {
		List<AdminCoupon> couponList = adminCouponService.getCouponList();
		
		log.info("couponList: {}", couponList);
		
		model.addAttribute("title", "쿠폰지급내역 조회");
		model.addAttribute("couponList", couponList);
		
		return "admin/coupon/get_coupon_list";
	}
	
	
	
	
	
}