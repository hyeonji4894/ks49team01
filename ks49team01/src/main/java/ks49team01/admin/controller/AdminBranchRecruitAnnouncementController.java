package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminBranchRecruitAnnouncement;
import ks49team01.admin.service.AdminBranchRecruitAnnouncementService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/BranchRecruitAnnouncement")
public class AdminBranchRecruitAnnouncementController {
	//의존성 주입
	private AdminBranchRecruitAnnouncementService adminBranchRecruitAnnouncementService;
	
	@GetMapping("/addbranchrecruitannouncement")
	public String addbranchrecruitannouncement(Model model) {
		List<AdminBranchRecruitAnnouncement> adminRecruitAnnouncementList = adminBranchRecruitAnnouncementService.getAdminBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 등록");
		
		model.addAttribute("title", "가맹 신청 모집 공고 등록");
		model.addAttribute("adminRecruitAnnouncementList", adminRecruitAnnouncementList);		
		// 연결 클래스 파일/경로
		return "admin/branch_recruit_announcement/add_branch_recruit_announcement";
	}

	
	@GetMapping("/modifybranchrecruitannouncement")
	public String modifybranchrecruitannouncement(Model model) {
		
		log.info("가맹 신청 모집 공고 수정");
		
		model.addAttribute("title", "가맹 신청 모집 공고 수정");
		
		return "admin/branch_recruit_announcement/modify_branch_recruit_announcement";
	}
	
	
	@GetMapping("/removebranchrecruitannouncement")
	public String removebranchrecruitannouncement(Model model) {
		
		log.info("가맹 신청 모집 공고 삭제");
		
		model.addAttribute("title", "가맹 신청 모집 공고 삭제");
		
		return "admin/branch_recruit_announcement/remove_branch_recruit_announcement";
	}
	
	
	@GetMapping("/getbranchrecruitannouncement")
	public String getbranchrecruitannouncement(Model model) {
		
		log.info("가맹 신청 모집 공고 조회");
		
		model.addAttribute("title", "가맹 신청 모집 공고 조회");
		
		return "admin/branch_recruit_announcement/get_branch_recruit_announcement";
	}
	
}
