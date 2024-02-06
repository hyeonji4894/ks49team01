package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchRecruitAnnouncement;
import ks49team01.user.mapper.UserBranchRecruitAnnouncementMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserBranchRecruitAnnouncementService {

	private  UserBranchRecruitAnnouncementMapper userBranchRecruitAnnouncementMapper;
	
	public List<UserBranchRecruitAnnouncement> getUserBranchRecruitAnnouncementList(){
		return userBranchRecruitAnnouncementMapper.getUserBranchRecruitAnnouncementList();
	}
}
