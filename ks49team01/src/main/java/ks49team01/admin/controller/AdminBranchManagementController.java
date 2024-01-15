package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/branchManagement")
public class AdminBranchManagementController {
	// 메소드 명
	@GetMapping("/addbranchmanagement")
	public String addbranchmanagement(Model model) {
		
		log.info("가맹점 등록");
		
		model.addAttribute("title", "가맹점 등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_management/add_branch_management";
	}

	
	@GetMapping("/modifybranchmanagement")
	public String modifybranchmanagement(Model model) {
		
		log.info("가맹점 수정");
		
		model.addAttribute("title", "가맹점 수정");
		
		return "admin/branch_management/modify_branch_management";
	}
	
	
	@GetMapping("/removebranchmanagement")
	public String removebranchmanagement(Model model) {
		
		log.info("가맹점 삭제");
		
		model.addAttribute("title", "가맹점 삭제");
		
		return "admin/branch_management/remove_branch_management";
	}
	
	
	@GetMapping("/getbranchmanagement")
	public String getbranchmanagement(Model model) {
		
		log.info("가맹점 조회");
		
		model.addAttribute("title", "가맹점 조회");
		
		return "admin/branch_management/get_branch_management";
	}
	
}
