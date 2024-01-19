package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchManagement;
import ks49team01.user.mapper.UserBranchManagementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserBranchManagementService {

	private  UserBranchManagementMapper userBranchManagementMapper;
	
	public void addUserBranchManagement(UserBranchManagement userBranchManagement) {
		log.info("가맹 관리 전 userBranchManagement: {}", userBranchManagement);
		userBranchManagementMapper.addUserBranchManagement(userBranchManagement);
		log.info("가맹 관리 후 userBranchManagement: {}", userBranchManagement);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<UserBranchManagement> getUserBranchManagementList(){
		return userBranchManagementMapper.getUserBranchManagementList();
	}
}
