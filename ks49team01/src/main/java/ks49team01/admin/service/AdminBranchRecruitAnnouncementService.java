package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchRecruitAnnouncement;
import ks49team01.admin.mapper.AdminBranchRecruitAnnouncementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminBranchRecruitAnnouncementService {

	private  AdminBranchRecruitAnnouncementMapper adminBranchRecruitAnnouncementMapper;
	
	public void addAdminBranchRecruitAnnouncement(AdminBranchRecruitAnnouncement adminBranchRecruitAnnouncement) {
		log.info("가맹 신청 모집 공고 전 adminBranchRecruitAnnouncement: {}", adminBranchRecruitAnnouncement);
		adminBranchRecruitAnnouncementMapper.addAdminBranchRecruitAnnouncement(adminBranchRecruitAnnouncement);
		log.info("가맹 신청 모집 공고 후 adminBranchRecruitAnnouncement: {}", adminBranchRecruitAnnouncement);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<AdminBranchRecruitAnnouncement> getAdminBranchRecruitAnnouncementList(){
		return adminBranchRecruitAnnouncementMapper.getAdminBranchRecruitAnnouncementList();
	}
}
