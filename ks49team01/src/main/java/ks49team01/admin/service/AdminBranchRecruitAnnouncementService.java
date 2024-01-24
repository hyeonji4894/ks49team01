package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchRecruitAnnouncement;
import ks49team01.admin.mapper.AdminBranchRecruitAnnouncementMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminBranchRecruitAnnouncementService {

	private  AdminBranchRecruitAnnouncementMapper adminBranchRecruitAnnouncementMapper;
	
	public List<AdminBranchRecruitAnnouncement> getAdminBranchRecruitAnnouncementList(){
		return adminBranchRecruitAnnouncementMapper.getAdminBranchRecruitAnnouncementList();
	}
}
