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
import ks49team01.admin.dto.AdminMileage;
import ks49team01.admin.dto.AdminPaymentCriteriaMileage;
import ks49team01.admin.dto.AdminReviewMileageCriteria;
import ks49team01.admin.service.AdminMileageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/mileage")
@AllArgsConstructor
@Slf4j
public class AdminMileageController {
	
	private final AdminMileageService adminMileageService;
	
	
	// 결제적립금 기준 조회
	@GetMapping("/getPaymentCriteriaMileage")
	public String getAdminPaymentCriteriaMileage(Model model){
		
		List<AdminPaymentCriteriaMileage> paymentCriteriaMileage = adminMileageService.getAdminPaymentCriteriaMileage();
		
		log.info("paymentCriteriaMileage: {}", paymentCriteriaMileage);
		
		model.addAttribute("title", "결제 기준 적립금 조회");
		model.addAttribute("paymentCriteriaMileage", paymentCriteriaMileage);
		
		return "admin/pay_mileage/get_payment_criteria_mileage";
	}
	
	
	// 결제적립금기준 등록
	@GetMapping("/addPaymentCriteriaMileage")
	public String addAdminPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 등록");
		
		model.addAttribute("title", "결제 기준 적립금 등록");
		
	return "admin/pay_mileage/add_payment_criteria_mileage";
	}
	
	// 결제적립금기준 등록
	@PostMapping("/addPaymentCriteriaMileage")
	public String addAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentcriteriaMileage, HttpSession session){
		
		log.info("결제적립금기준 등록 adminpaymentcriteriaMileage: {}", adminPaymentcriteriaMileage);
		
		adminPaymentcriteriaMileage.setMemberId("id001");
		
		adminMileageService.addAdminPaymentCriteriaMileage(adminPaymentcriteriaMileage);
		
		return "redirect:/admin/mileage/getPaymentCriteriaMileage";
	}
	
	// 결제적립금 기준 수정
	@GetMapping("/modifyPaymentCriteriaMileage")
	public String modifyAdminPaymentCriteriaMileage(@RequestParam(value = "roompayMileageRateCode")String roompayMileageRateCode
			,Model model){
		
		log.info("결제적립금 기준 수정화면 roompayMileageRateCode : {}", roompayMileageRateCode);
		
		// 특정코드 조회
		AdminPaymentCriteriaMileage adminPaymentCriteriaMileage = adminMileageService.getPaymentMileageCriteriaByCode(roompayMileageRateCode);
		
		model.addAttribute("adminPaymentCriteriaMileage", adminPaymentCriteriaMileage);
		
		return "admin/pay_mileage/modify_payment_criteria_mileage";
	}
		
	// 결제적립금 기준 수정
	@PostMapping("/modifyPaymentCriteriaMileage")
	public String modifyAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage, HttpSession session) {
		log.info("결제적립금 기준 수정: {}", adminPaymentCriteriaMileage);
		
		// 특정코드로 수정
		adminMileageService.modifyAdminPaymentCriteriaMileage(adminPaymentCriteriaMileage);
		
		return "redirect:/admin/mileage/getPaymentCriteriaMileage";
	}	
	
	
	
	//결제적립금 기준 삭제
	@GetMapping("/removePaymentCriteriaMileage")
	public String removeAdminPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 삭제");
		
		model.addAttribute("title", "결제 기준 적립금 삭제");
		
	return "admin/pay_mileage/remove_payment_criteria_mileage";
	}
	
	
	
	
	
	
	// 리뷰적립금 기준 조회	
	@GetMapping("/getReviewMileageCriteria")
	public String getAdminReviewMileageCriteria(Model model){
		
		List<AdminReviewMileageCriteria> reviewMileageCriteria = adminMileageService.getAdminReviewMileageCriteria();	
		
		log.info("reviewMileageCriteria: {}", reviewMileageCriteria);
		
		model.addAttribute("title", "리뷰 적립금기준 조회");
		model.addAttribute("reviewMileageCriteria", reviewMileageCriteria);
		
		return "admin/review_mileage/get_review_mileage_criteria";
	}
	
	//리뷰적립금 기준 등록
	@GetMapping("/addReviewMileageCriteria")
	public String addAdminReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 등록");
		
		model.addAttribute("title", "리뷰 적립금기준 등록");
		
		return "admin/review_mileage/add_review_mileage_criteria";
	}
	
	// 리뷰적립금 기준 등록
	@PostMapping("/addReviewMileageCriteria")
	public String addAdminReviewMileageCriteria(AdminReviewMileageCriteria adminReviewMileageCriteria, HttpSession session){
		
		log.info("리뷰적립금기준 등록 adminReviewMileageCriteria: {}", adminReviewMileageCriteria);
		
		adminReviewMileageCriteria.setMemberId("id001");
		
		adminMileageService.addAdminReviewMileageCriteria(adminReviewMileageCriteria);
		
		return "redirect:/admin/mileage/getReviewMileageCriteria";
	}
	
	// 리뷰적립금 기준 수정
	@GetMapping("/modifyReviewMileageCriteria")
	public String modifyAdminReviewMileageCriteria(@RequestParam(value = "mileageCriteriaCode")String mileageCriteriaCode
											,Model model){
		
		log.info("리뷰적립금 기준 수정화면 mileageCriteriaCode : {}", mileageCriteriaCode);
		
		// 특정코드 조회
		AdminReviewMileageCriteria adminReviewMileageCriteria = adminMileageService.getReviewMileageCriteriaByCode(mileageCriteriaCode);
		
		model.addAttribute("adminReviewMileageCriteria", adminReviewMileageCriteria);
		
		return "admin/review_mileage/modify_review_mileage_criteria";
	}
		
	// 리뷰적립금 기준 수정
	@PostMapping("/modifyReviewMileageCriteria")
	public String modifyAdminReviewMileageCriteria(AdminReviewMileageCriteria adminReviewMileageCriteria, HttpSession session) {
		log.info("리뷰적립금 기준 수정: {}", adminReviewMileageCriteria);
		
		// 특정코드로 수정
		adminMileageService.modifyAdminReviewMileageCriteria(adminReviewMileageCriteria);
		
		return "redirect:/admin/mileage/getReviewMileageCriteria";
	}	
	
	// 리뷰적립금 기준 삭제	
	@GetMapping("/removeReviewMileageCriteria")
	public String removeAdminReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 삭제");
		
		model.addAttribute("title", "리뷰 적립금기준 삭제");
		
	return "admin/review_mileage/remove_review_mileage_criteria";
	}
	
	
	
	
	
	
	
	
	
	// 적립금 지급 목록 조회	
	@GetMapping("/getMileageList")
	public String getMileageList(Model model) {
		
		List<AdminMileage> mileageList = adminMileageService.getMileageList();
		
		log.info("mileageList: {}", mileageList);
		
		model.addAttribute("title", "적립금 지급목록 조회");
		model.addAttribute("mileageList", mileageList);
		
		return "admin/mileage/get_mileage_list";
	}
	
	// 적립금지급받은 회원아이디 검색(모달)
	@PostMapping("/getSearchMileageId")
	@ResponseBody
	public List<AdminMileage> getSearchMileageId(@RequestParam(value="searchMileageId") String memberId) {
		
		log.info("memberId: {}", memberId);
		
		 List<AdminMileage> searchMileageId = adminMileageService.getSearchMileageId(memberId);
		
		return searchMileageId;
	}	
	
	// 적립금지급내역 최종검색
	@PostMapping("/getSearchMileageList")
	@ResponseBody
	public List<AdminMileage> getSearchMileageList(@RequestBody List<Map<String, Object>> paramList) {
		
		log.info("검색 조건 선택:{}" , paramList);
		if(paramList != null) {
			paramList.forEach(searchMap -> {
				String searchKey = (String) searchMap.get("searchKey");
				switch (searchKey) {
					case "memberId" -> searchKey = "member_id";
				}
				searchMap.put("searchKey", searchKey);
			});
		}
		
		log.info("선택 조건 검색: {}", paramList);
		
		 List<AdminMileage> searchMileageList = adminMileageService.getSearchMileageList(paramList);
		
		return searchMileageList;
	}	
	
	
	
}