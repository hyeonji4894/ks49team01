package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminBranchManagement;
import ks49team01.admin.service.AdminBranchManagementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/admin/branchManagement")
public class AdminBranchManagementController {
	
	private final AdminBranchManagementService adminBranchManagementService;
	
	@GetMapping("/addbranchmanagement")
	public String addbranchmanagement(Model model) {
		
		List<AdminBranchManagement> adminBranchManagement = adminBranchManagementService.getAdminBranchManagementList();
		log.info("가맹점 등록");
		log.info("adminBranchManagement", adminBranchManagement);
		
		model.addAttribute("title", "가맹점 등록");
		model.addAttribute("adminBranchManagement", adminBranchManagement);
		
		// 연결 클래스 파일/경로
		return "admin/branch_management/add_branch_management";
	}

	
	@GetMapping("/modifybranchmanagement")
	public String modifybranchmanagement(Model model) {
		
		List<AdminBranchManagement> adminBranchManagement = adminBranchManagementService.getAdminBranchManagementList();
		log.info("가맹점 수정");
		log.info("adminBranchManagement", adminBranchManagement);
		
		model.addAttribute("title", "가맹점 수정");
		model.addAttribute("adminBranchManagement", adminBranchManagement);
		
		return "admin/branch_management/modify_branch_management";
	}
	
	
	@GetMapping("/removebranchmanagement")
	public String removebranchmanagement(Model model) {
		
		List<AdminBranchManagement> adminBranchManagement = adminBranchManagementService.getAdminBranchManagementList();
		log.info("가맹점 삭제");
		log.info("adminBranchManagement", adminBranchManagement);
		
		model.addAttribute("title", "가맹점 삭제");
		model.addAttribute("adminBranchManagement", adminBranchManagement);
		
		return "admin/branch_management/remove_branch_management";
	}
	
	
	@GetMapping("/getbranchmanagement")
	public String getbranchmanagement(Model model) {
		
		List<AdminBranchManagement> adminBranchManagement = adminBranchManagementService.getAdminBranchManagementList();
		log.info("가맹점 조회");
		log.info("adminBranchManagement", adminBranchManagement);
		
		model.addAttribute("title", "가맹점 조회");
		model.addAttribute("adminBranchManagement", adminBranchManagement);
		
		return "admin/branch_management/get_branch_management";
	}
	
}
