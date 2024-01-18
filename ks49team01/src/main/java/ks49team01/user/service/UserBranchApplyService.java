package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchApply;
import ks49team01.user.mapper.UserBranchApplyMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserBranchApplyService {

	private UserBranchApplyMapper userBranchApplyMapper;
	
	public void addUserBranchApply(UserBranchApply userBranchApply) {
		log.info("가맹 신청 전 userBranchApply: {}", userBranchApply);
		userBranchApplyMapper.addUserBranchApply(userBranchApply);
		log.info("가맹 신청 후 userBranchApply: {}", userBranchApply);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<UserBranchApply> getUserBranchApplyList(){
		return userBranchApplyMapper.getUserBranchApplyList();
	}
}
