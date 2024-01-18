package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchRecruitAnnouncement;
import ks49team01.user.mapper.UserBranchRecruitAnnouncementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserBranchRecruitAnnouncementService {

	private  UserBranchRecruitAnnouncementMapper userBranchRecruitAnnouncementMapper;
	
	public void addUserBranchRecruitAnnouncement(UserBranchRecruitAnnouncement userBranchRecruitAnnouncement) {
		log.info("가맹 신청 모집 공고 전 userBranchRecruitAnnouncement: {}", userBranchRecruitAnnouncement);
		userBranchRecruitAnnouncementMapper.addUserBranchRecruitAnnouncement(userBranchRecruitAnnouncement);
		log.info("가맹 신청 모집 공고 후 userBranchRecruitAnnouncement: {}", userBranchRecruitAnnouncement);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<UserBranchRecruitAnnouncement> getUserBranchRecruitAnnouncementList(){
		return userBranchRecruitAnnouncementMapper.getUserBranchRecruitAnnouncementList();
	}
}
