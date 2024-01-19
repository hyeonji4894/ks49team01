package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserBranchRecruitAnnouncement;
import ks49team01.user.service.UserBranchRecruitAnnouncementService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/BranchRecruitAnnouncement")
public class UserBranchRecruitAnnouncementController {
	//의존성 주입	
	private UserBranchRecruitAnnouncementService userBranchRecruitAnnouncementService;
	
	@GetMapping("/getbranchrecruitannouncement")
	public String getbranchrecruitannouncement(Model model) {
		List<UserBranchRecruitAnnouncement> userRecruitAnnouncementList = userBranchRecruitAnnouncementService.getUserBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 조회");
		
		model.addAttribute("title", "가맹 신청 모집 공고 조회");
		model.addAttribute("userRecruitAnnouncementList", userRecruitAnnouncementList);
		
		return "user/branch_recruit_announcement/get_branch_recruit_announcement";
	}
	
}
