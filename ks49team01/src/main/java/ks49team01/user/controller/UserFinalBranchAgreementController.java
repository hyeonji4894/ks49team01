package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserFinalBranchAgreement;
import ks49team01.user.service.UserFinalBranchAgreementService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/FinalBranchAgreement")
public class UserFinalBranchAgreementController {
	//의존성 주입
	private UserFinalBranchAgreementService userFinalBranchAgreementService;
	
	@GetMapping("/addfinalbranchagreement")
	public String addfinalbranchagreement(Model model) {
		List<UserFinalBranchAgreement> userFinalAgreementList = userFinalBranchAgreementService.getUserFinalBranchAgreementList();
		log.info("최종 가맹점 계약 등록");
		
		model.addAttribute("title", "최종 가맹점 계약 등록");
		model.addAttribute("userFinalAgreementList : {}", userFinalAgreementList);
		
		// 연결 클래스 파일/경로
		return "user/final_branch_agreement/add_final_branch_agreement";
	}

	
	@GetMapping("/modifyfinalbranchagreement")
	public String modifybranchrecruitannouncement(Model model) {
		
		log.info("최종 가맹점 계약 수정");
		
		model.addAttribute("title", "최종 가맹점 계약 수정");
		
		return "user/final_branch_agreement/modify_final_branch_agreement";
	}
	
	
	@GetMapping("/removefinalbranchagreement")
	public String removefinalbranchagreement(Model model) {
		
		log.info("최종 가맹점 계약 삭제");
		
		model.addAttribute("title", "최종 가맹점 계약 삭제");
		
		return "user/final_branch_agreement/remove_final_branch_agreement";
	}
	
	
	@GetMapping("/getfinalbranchagreement")
	public String getfinalbranchagreement(Model model) {
		
		log.info("최종 가맹점 계약 조회");
		
		model.addAttribute("title", "최종 가맹점 계약 조회");
		
		return "user/final_branch_agreement/get_final_branch_agreement";
	}
	
}
