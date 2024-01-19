package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminBranchRecruitAnnouncement;

@Mapper
public interface AdminBranchRecruitAnnouncementMapper {

	void addAdminBranchRecruitAnnouncement(AdminBranchRecruitAnnouncement adminBranchRecruitAnnouncement);

	List<AdminBranchRecruitAnnouncement> getAdminBranchRecruitAnnouncementList();
	
}
