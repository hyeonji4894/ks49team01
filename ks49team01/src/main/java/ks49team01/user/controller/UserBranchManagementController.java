package ks49team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/branchManagement")
public class UserBranchManagementController {
	// 메소드 명
	@GetMapping("/getbranchmanagement")
	public String getbranchmanagement(Model model) {
		
		log.info("가맹점 조회");
		
		model.addAttribute("title", "가맹점 조회");
		
		// 연결 클래스 파일/경로
		return "user/branch_management/get_branch_management";
	}

}
