package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserBranchManagement;
import ks49team01.user.service.UserBranchManagementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/user/branchManagement")
public class UserBranchManagementController {
	
	private final UserBranchManagementService userBranchManagementService;
	
	@GetMapping("/getbranchmanagement")
	public String getbranchmanagement(Model model) {
		
		List<UserBranchManagement> userBranchManagement = userBranchManagementService.getUserBranchManagementList();
		log.info("가맹점 조회");
		log.info("userBranchManagement: {}",userBranchManagement);
		
		model.addAttribute("title", "가맹점 조회");
		model.addAttribute("userBranchManagement", userBranchManagement);
		// 연결 클래스 파일/경로
		return "user/branch_management/get_branch_management";
	}

}
