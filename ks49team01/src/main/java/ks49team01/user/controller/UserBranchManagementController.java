package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserBranchManagement;
import ks49team01.user.service.UserBranchManagementService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/branchManagement")
public class UserBranchManagementController {
	//의존성 주입
	private UserBranchManagementService userBranchManagementService;
	
	@GetMapping("/getbranchmanagement")
	public String getbranchmanagement(Model model) {
		List<UserBranchManagement> userManagementList = userBranchManagementService.getUserBranchManagementList();
		log.info("가맹점 조회");
		
		model.addAttribute("title", "가맹점 조회");
		model.addAttribute("userManagementList : {}", userManagementList);		
		// 연결 클래스 파일/경로
		return "user/branch_management/get_branch_management";
	}

}
