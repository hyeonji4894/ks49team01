package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserBranchRecruitAnnouncement;
import ks49team01.user.service.UserBranchRecruitAnnouncementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/user/BranchRecruitAnnouncement")
public class UserBranchRecruitAnnouncementController {
	
	private final UserBranchRecruitAnnouncementService userBranchRecruitAnnouncementService;
	
	@GetMapping("/getbranchrecruitannouncement")
	public String getbranchrecruitannouncement(Model model) {
		
		List<UserBranchRecruitAnnouncement> userBranchRecruitAnnouncement = userBranchRecruitAnnouncementService.getUserBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 조회");
		log.info("userBranchRecruitAnnouncement",userBranchRecruitAnnouncement);
		
		model.addAttribute("title", "가맹 신청 모집 공고 조회");
		model.addAttribute("userBranchRecruitAnnouncement", userBranchRecruitAnnouncement);
		
		return "user/branch_recruit_announcement/get_branch_recruit_announcement";
	}
	
}
