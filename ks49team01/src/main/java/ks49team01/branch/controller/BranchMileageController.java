package ks49team01.branch.controller;

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
import ks49team01.branch.dto.BranchMileage;
import ks49team01.branch.dto.BranchPaymentCriteriaMileage;
import ks49team01.branch.dto.BranchReviewMileageCriteria;
import ks49team01.branch.service.BranchMileageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/mileage")
@AllArgsConstructor
@Slf4j
public class BranchMileageController {
	
	private final BranchMileageService branchMileageService;
	
	
	// 결제적립금 기준 조회
	@GetMapping("/getPaymentCriteriaMileage")
	public String getBranchPaymentCriteriaMileage(Model model){
		
		List<BranchPaymentCriteriaMileage> paymentCriteriaMileage = branchMileageService.getBranchPaymentCriteriaMileage();
		
		log.info("paymentCriteriaMileage: {}", paymentCriteriaMileage);
		
		model.addAttribute("title", "결제 기준 적립금 조회");
		model.addAttribute("paymentCriteriaMileage", paymentCriteriaMileage);
		
		return "branch/pay_mileage/get_payment_criteria_mileage";
	}
	
	
	// 결제적립금기준 등록
	@GetMapping("/addPaymentCriteriaMileage")
	public String addBranchPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 등록");
		
		model.addAttribute("title", "결제 기준 적립금 등록");
		
	return "branch/pay_mileage/add_payment_criteria_mileage";
	}
	
	// 결제적립금기준 등록
	@PostMapping("/addPaymentCriteriaMileage")
	public String addBranchPaymentCriteriaMileage(BranchPaymentCriteriaMileage branchPaymentcriteriaMileage, HttpSession session){
		
		log.info("결제적립금기준 등록 branchpaymentcriteriaMileage: {}", branchPaymentcriteriaMileage);
		
		branchPaymentcriteriaMileage.setMemberId("id001");
		
		branchMileageService.addBranchPaymentCriteriaMileage(branchPaymentcriteriaMileage);
		
		return "redirect:/branch/mileage/getPaymentCriteriaMileage";
	}
	
	// 결제적립금 기준 수정
	@GetMapping("/modifyPaymentCriteriaMileage")
	public String modifyBranchPaymentCriteriaMileage(@RequestParam(value = "roompayMileageRateCode")String roompayMileageRateCode
			,Model model){
		
		log.info("결제적립금 기준 수정화면 roompayMileageRateCode : {}", roompayMileageRateCode);
		
		// 특정코드 조회
		BranchPaymentCriteriaMileage branchPaymentCriteriaMileage = branchMileageService.getPaymentMileageCriteriaByCode(roompayMileageRateCode);
		
		model.addAttribute("branchPaymentCriteriaMileage", branchPaymentCriteriaMileage);
		
		return "branch/pay_mileage/modify_payment_criteria_mileage";
	}
		
	// 결제적립금 기준 수정
	@PostMapping("/modifyPaymentCriteriaMileage")
	public String modifyBranchPaymentCriteriaMileage(BranchPaymentCriteriaMileage branchPaymentCriteriaMileage, HttpSession session) {
		log.info("결제적립금 기준 수정: {}", branchPaymentCriteriaMileage);
		
		// 특정코드로 수정
		branchMileageService.modifyBranchPaymentCriteriaMileage(branchPaymentCriteriaMileage);
		
		return "redirect:/branch/mileage/getPaymentCriteriaMileage";
	}	
	
	
	
	//결제적립금 기준 삭제
	@GetMapping("/removePaymentCriteriaMileage")
	public String removeBranchPaymentCriteriaMileage(Model model){
		
		log.info("적립금 기준 삭제");
		
		model.addAttribute("title", "결제 기준 적립금 삭제");
		
	return "branch/pay_mileage/remove_payment_criteria_mileage";
	}
	
	
	
	
	
	
	// 리뷰적립금 기준 조회	
	@GetMapping("/getReviewMileageCriteria")
	public String getBranchReviewMileageCriteria(Model model){
		
		List<BranchReviewMileageCriteria> reviewMileageCriteria = branchMileageService.getBranchReviewMileageCriteria();	
		
		log.info("reviewMileageCriteria: {}", reviewMileageCriteria);
		
		model.addAttribute("title", "리뷰 적립금기준 조회");
		model.addAttribute("reviewMileageCriteria", reviewMileageCriteria);
		
		return "branch/review_mileage/get_review_mileage_criteria";
	}
	
	//리뷰적립금 기준 등록
	@GetMapping("/addReviewMileageCriteria")
	public String addBranchReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 등록");
		
		model.addAttribute("title", "리뷰 적립금기준 등록");
		
		return "branch/review_mileage/add_review_mileage_criteria";
	}
	
	// 리뷰적립금 기준 등록
	@PostMapping("/addReviewMileageCriteria")
	public String addBranchReviewMileageCriteria(BranchReviewMileageCriteria branchReviewMileageCriteria, HttpSession session){
		
		log.info("리뷰적립금기준 등록 branchReviewMileageCriteria: {}", branchReviewMileageCriteria);
		
		branchReviewMileageCriteria.setMemberId("id001");
		
		branchMileageService.addBranchReviewMileageCriteria(branchReviewMileageCriteria);
		
		return "redirect:/branch/mileage/getReviewMileageCriteria";
	}
	
	// 리뷰적립금 기준 수정
	@GetMapping("/modifyReviewMileageCriteria")
	public String modifyBranchReviewMileageCriteria(@RequestParam(value = "mileageCriteriaCode")String mileageCriteriaCode
											,Model model){
		
		log.info("리뷰적립금 기준 수정화면 mileageCriteriaCode : {}", mileageCriteriaCode);
		
		// 특정코드 조회
		BranchReviewMileageCriteria branchReviewMileageCriteria = branchMileageService.getReviewMileageCriteriaByCode(mileageCriteriaCode);
		
		model.addAttribute("branchReviewMileageCriteria", branchReviewMileageCriteria);
		
		return "branch/review_mileage/modify_review_mileage_criteria";
	}
		
	// 리뷰적립금 기준 수정
	@PostMapping("/modifyReviewMileageCriteria")
	public String modifyBranchReviewMileageCriteria(BranchReviewMileageCriteria branchReviewMileageCriteria, HttpSession session) {
		log.info("리뷰적립금 기준 수정: {}", branchReviewMileageCriteria);
		
		// 특정코드로 수정
		branchMileageService.modifyBranchReviewMileageCriteria(branchReviewMileageCriteria);
		
		return "redirect:/branch/mileage/getReviewMileageCriteria";
	}	
	
	// 리뷰적립금 기준 삭제	
	@GetMapping("/removeReviewMileageCriteria")
	public String removeBranchReviewMileageCriteria(Model model){
		
		log.info("적립금 기준 삭제");
		
		model.addAttribute("title", "리뷰 적립금기준 삭제");
		
	return "branch/review_mileage/remove_review_mileage_criteria";
	}
	
	
	
	
	
	
	
	
	// 적립금지급내역 조회	
	@GetMapping("/getMileageList")
	public String getMileageList(Model model) {
		
		List<BranchMileage> mileageList = branchMileageService.getMileageList();
		
		log.info("mileageList: {}", mileageList);
		
		model.addAttribute("title", "적립금 지급목록 조회");
		model.addAttribute("mileageList", mileageList);
		
		return "branch/mileage/get_mileage_list";
	}
	
	// 적립금지급내역 등록화면
	@GetMapping("/addMileageList")
	public String addMileageList(Model model){
		
		log.info("적립금지급내역 등록");
		
		model.addAttribute("title", "적립금지급내역 등록");
		
		return "branch/mileage/add_mileage_list";
	}
	
	// 적립금지급내역 등록
	@PostMapping("/addMileageList")
	public String addMileageList(BranchMileage branchMileage, HttpSession session){
		
		log.info("적립금지급내역 등록 branchMileage: {}", branchMileage);
		
		branchMileageService.addMileageList(branchMileage);
		
		return "redirect:/branch/mileage/getMileageList";
	}	
	
	// 적립금지급내역 수정
	@GetMapping("/modifyMileageList")
	public String modifyMileageList(@RequestParam(value = "mileageListCode")String mileageListCode
											,Model model){
		
		log.info("적립금지급내역 수정화면 mileageListCode : {}", mileageListCode);
		
		// 특정코드 조회
		 BranchMileage branchMileage = branchMileageService.getMileageListByCode(mileageListCode);
		
		model.addAttribute("branchMileage", branchMileage);
		
		return "branch/mileage/modify_mileage_list";
	}
		
	// 적립금지급내역 수정
	@PostMapping("/modifyMileageList")
	public String modifyMileageList(BranchMileage branchMileage, HttpSession session) {
		
		log.info("적립금지급내역 수정: {}", branchMileage);
		
		// 특정코드로 수정
		branchMileageService.modifyMileageList(branchMileage);
		
		return "redirect:/branch/mileage/getMileageList";
	}	
	
	
	// 적립금지급받은 회원아이디 검색(모달)
	@PostMapping("/getSearchMileageId")
	@ResponseBody
	public List<BranchMileage> getSearchMileageId(@RequestParam(value="searchMileageId") String memberId) {
		
		log.info("memberId: {}", memberId);
		
		 List<BranchMileage> searchMileageId = branchMileageService.getSearchMileageId(memberId);
		
		return searchMileageId;
	}	
	
	// 적립금지급내역 최종검색
	@PostMapping("/getSearchMileageList")
	@ResponseBody
	public List<BranchMileage> getSearchMileageList(@RequestBody List<Map<String, Object>> paramList) {
		
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
		
		 List<BranchMileage> searchMileageList = branchMileageService.getSearchMileageList(paramList);
		
		return searchMileageList;
	}	
	
	
	
}