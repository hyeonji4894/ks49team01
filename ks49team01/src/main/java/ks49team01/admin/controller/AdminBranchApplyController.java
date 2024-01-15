package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/branchApply")
public class AdminBranchApplyController {
	// 메소드 명
	@GetMapping("/addbranchapply")
	public String addbranchapply(Model model) {
		
		log.info("가맹신청등록");
		
		model.addAttribute("title", "가맹신청등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_apply/add_branch_apply";
	}

	
	@GetMapping("/modifybranchapply")
	public String modifybranchapply(Model model) {
		
		log.info("가맹신청수정");
		
		model.addAttribute("title", "가맹신청수정");
		
		return "admin/branch_apply/modify_branch_apply";
	}
	
	
	@GetMapping("/removebranchapply")
	public String removebranchapply(Model model) {
		
		log.info("가맹신청삭제");
		
		model.addAttribute("title", "가맹신청삭제");
		
		return "admin/branch_apply/remove_branch_apply";
	}
	
	
	@GetMapping("/getbranchapply")
	public String getbranchapply(Model model) {
		
		log.info("가맹신청조회");
		
		model.addAttribute("title", "가맹신청조회");
		
		return "admin/branch_apply/get_branch_apply";
	}
	
	
}
