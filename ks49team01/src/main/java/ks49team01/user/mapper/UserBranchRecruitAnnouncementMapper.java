package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserBranchRecruitAnnouncement;

@Mapper
public interface UserBranchRecruitAnnouncementMapper {

	void addUserBranchRecruitAnnouncement(UserBranchRecruitAnnouncement userBranchRecruitAnnouncement);

	List<UserBranchRecruitAnnouncement> getUserBranchRecruitAnnouncementList();
	
}
