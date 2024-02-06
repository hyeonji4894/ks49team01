package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminBranchApply;
import ks49team01.admin.service.AdminBranchApplyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/admin/branchApply")
public class AdminBranchApplyController {
	
	private final AdminBranchApplyService adminBranchApplyService;
	
	@GetMapping("/addbranchapply")
	public String addbranchapply(Model model) {
		
		List<AdminBranchApply> adminBranchApply = adminBranchApplyService.getAdminBranchApplyList();
		log.info("가맹신청등록");
		log.info("adminBranchApply", adminBranchApply);
		
		model.addAttribute("title", "가맹신청등록");
		model.addAttribute("adminBranchApply", adminBranchApply);
		
		// 연결 클래스 파일/경로
		return "admin/branch_apply/add_branch_apply";
	}

	
	@GetMapping("/modifybranchapply")
	public String modifybranchapply(Model model) {
		
		List<AdminBranchApply> adminBranchApply = adminBranchApplyService.getAdminBranchApplyList();
		log.info("가맹신청수정");
		log.info("adminBranchApply", adminBranchApply);
		
		model.addAttribute("title", "가맹신청수정");
		model.addAttribute("adminBranchApply", adminBranchApply);
		
		return "admin/branch_apply/modify_branch_apply";
	}
	
	
	@GetMapping("/removebranchapply")
	public String removebranchapply(Model model) {
		
		List<AdminBranchApply> adminBranchApply = adminBranchApplyService.getAdminBranchApplyList();
		log.info("가맹신청삭제");
		log.info("adminBranchApply", adminBranchApply);
		
		model.addAttribute("title", "가맹신청삭제");
		model.addAttribute("adminBranchApply", adminBranchApply);
		
		return "admin/branch_apply/remove_branch_apply";
	}
	
	
	@GetMapping("/getbranchapply")
	public String getbranchapply(Model model) {
		
		List<AdminBranchApply> adminBranchApply = adminBranchApplyService.getAdminBranchApplyList();
		log.info("가맹신청조회");
		log.info("adminBranchApply", adminBranchApply);
		
		model.addAttribute("title", "가맹신청조회");
		model.addAttribute("adminBranchApply", adminBranchApply);
		
		return "admin/branch_apply/get_branch_apply";
	}
	
	
}
