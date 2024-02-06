package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminBranchRecruitAnnouncement;
import ks49team01.admin.service.AdminBranchRecruitAnnouncementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/BranchRecruitAnnouncement")
@AllArgsConstructor
public class AdminBranchRecruitAnnouncementController {
	
	private final AdminBranchRecruitAnnouncementService adminBranchRecruitAnnouncementService;
	
	@GetMapping("/addbranchrecruitannouncement")
	public String addbranchrecruitannouncement(Model model) {
		
		List<AdminBranchRecruitAnnouncement> adminBranchRecruitAnnouncement = adminBranchRecruitAnnouncementService.getAdminBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 등록");
		log.info("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		model.addAttribute("title", "가맹 신청 모집 공고 등록");
		model.addAttribute("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);		
		// 연결 클래스 파일/경로
		return "admin/branch_recruit_announcement/add_branch_recruit_announcement";
	}

	
	@GetMapping("/modifybranchrecruitannouncement")
	public String modifybranchrecruitannouncement(Model model) {
		
		List<AdminBranchRecruitAnnouncement> adminBranchRecruitAnnouncement = adminBranchRecruitAnnouncementService.getAdminBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 수정");
		log.info("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		model.addAttribute("title", "가맹 신청 모집 공고 수정");
		model.addAttribute("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		return "admin/branch_recruit_announcement/modify_branch_recruit_announcement";
	}
	
	
	@GetMapping("/removebranchrecruitannouncement")
	public String removebranchrecruitannouncement(Model model) {
		
		List<AdminBranchRecruitAnnouncement> adminBranchRecruitAnnouncement = adminBranchRecruitAnnouncementService.getAdminBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 삭제");
		log.info("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		model.addAttribute("title", "가맹 신청 모집 공고 삭제");
		model.addAttribute("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		return "admin/branch_recruit_announcement/remove_branch_recruit_announcement";
	}
	
	
	@GetMapping("/getbranchrecruitannouncement")
	public String getbranchrecruitannouncement(Model model) {
		
		List<AdminBranchRecruitAnnouncement> adminBranchRecruitAnnouncement = adminBranchRecruitAnnouncementService.getAdminBranchRecruitAnnouncementList();
		log.info("가맹 신청 모집 공고 조회");
		log.info("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		model.addAttribute("title", "가맹 신청 모집 공고 조회");
		model.addAttribute("adminBranchRecruitAnnouncement", adminBranchRecruitAnnouncement);
		
		return "admin/branch_recruit_announcement/get_branch_recruit_announcement";
	}
	
}
