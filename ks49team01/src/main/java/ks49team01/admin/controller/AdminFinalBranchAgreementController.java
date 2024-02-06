package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminFinalBranchAgreement;
import ks49team01.admin.service.AdminFinalBranchAgreementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/FinalBranchAgreement")
@AllArgsConstructor
public class AdminFinalBranchAgreementController {
	
	private final AdminFinalBranchAgreementService adminFinalBranchAgreementService;
	
	@GetMapping("/addfinalbranchagreement")
	public String addfinalbranchagreement(Model model) {
		
		List<AdminFinalBranchAgreement> adminFinalBranchAgreement = adminFinalBranchAgreementService.getAdminFinalBranchAgreementList();
		log.info("최종 가맹점 계약 등록");
		log.info("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		model.addAttribute("title", "최종 가맹점 계약 등록");
		model.addAttribute("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		// 연결 클래스 파일/경로
		return "admin/final_branch_agreement/add_final_branch_agreement";
	}

	
	@GetMapping("/modifyfinalbranchagreement")
	public String modifybranchrecruitannouncement(Model model) {
		
		List<AdminFinalBranchAgreement> adminFinalBranchAgreement = adminFinalBranchAgreementService.getAdminFinalBranchAgreementList();
		log.info("최종 가맹점 계약 수정");
		log.info("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		model.addAttribute("title", "최종 가맹점 계약 수정");
		model.addAttribute("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		return "admin/final_branch_agreement/modify_final_branch_agreement";
	}
	
	
	@GetMapping("/removefinalbranchagreement")
	public String removefinalbranchagreement(Model model) {
		
		List<AdminFinalBranchAgreement> adminFinalBranchAgreement = adminFinalBranchAgreementService.getAdminFinalBranchAgreementList();
		log.info("최종 가맹점 계약 삭제");
		log.info("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		model.addAttribute("title", "최종 가맹점 계약 삭제");
		model.addAttribute("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		return "admin/final_branch_agreement/remove_final_branch_agreement";
	}
	
	
	@GetMapping("/getfinalbranchagreement")
	public String getfinalbranchagreement(Model model) {
		
		List<AdminFinalBranchAgreement> adminFinalBranchAgreement = adminFinalBranchAgreementService.getAdminFinalBranchAgreementList();
		log.info("최종 가맹점 계약 조회");
		log.info("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		model.addAttribute("title", "최종 가맹점 계약 조회");
		model.addAttribute("adminFinalBranchAgreement", adminFinalBranchAgreement);
		
		return "admin/final_branch_agreement/get_final_branch_agreement";
	}
	
}
