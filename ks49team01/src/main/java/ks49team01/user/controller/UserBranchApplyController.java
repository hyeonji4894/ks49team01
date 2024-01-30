package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserBranchApply;
import ks49team01.user.service.UserBranchApplyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/user/branchApply")
public class UserBranchApplyController {
	
	private final UserBranchApplyService userBranchApplyService;
	
	@GetMapping("/addbranchapply")
	public String addbranchapply(Model model) {
		
		List<UserBranchApply> userBranchApply = userBranchApplyService.getUserBranchApplyList();
		log.info("가맹신청등록");
		log.info("userBranchApply",userBranchApply);
		
		model.addAttribute("title", "가맹신청등록");
		model.addAttribute("userBranchApply", userBranchApply);
		// 연결 클래스 파일/경로
		return "user/branch_apply/add_branch_apply";
	}

	
	@GetMapping("/modifybranchapply")
	public String modifybranchapply(Model model) {
		
		List<UserBranchApply> userBranchApply = userBranchApplyService.getUserBranchApplyList();
		log.info("가맹신청수정");
		log.info("userBranchApply",userBranchApply);
		
		model.addAttribute("title", "가맹신청수정");
		model.addAttribute("userBranchApply", userBranchApply);
		
		return "user/branch_apply/modify_branch_apply";
	}
	
	
	@GetMapping("/removebranchapply")
	public String removebranchapply(Model model) {
		
		List<UserBranchApply> userBranchApply = userBranchApplyService.getUserBranchApplyList();
		log.info("가맹신청삭제");
		log.info("userBranchApply",userBranchApply);
		
		model.addAttribute("title", "가맹신청삭제");
		model.addAttribute("userBranchApply", userBranchApply);
		
		return "user/branch_apply/remove_branch_apply";
	}
	
	
	@GetMapping("/getbranchapply")
	public String getbranchapply(Model model) {
		
		List<UserBranchApply> userBranchApply = userBranchApplyService.getUserBranchApplyList();
		log.info("가맹신청조회");
		log.info("userBranchApply",userBranchApply);
		
		model.addAttribute("title", "가맹신청조회");
		model.addAttribute("userBranchApply", userBranchApply);
		
		return "user/branch_apply/get_branch_apply";
	}
	
	
}
