package ks49team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/BranchRecruitAnnouncement")
public class UserBranchRecruitAnnouncementController {
	// 메소드 명	
	@GetMapping("/getbranchrecruitannouncement")
	public String getbranchrecruitannouncement(Model model) {
		
		log.info("가맹 신청 모집 공고 조회");
		
		model.addAttribute("title", "가맹 신청 모집 공고 조회");
		
		return "user/branch_recruit_announcement/get_branch_recruit_announcement";
	}
	
}
