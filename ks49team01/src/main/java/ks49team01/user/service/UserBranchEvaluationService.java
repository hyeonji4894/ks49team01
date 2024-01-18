package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchEvaluation;
import ks49team01.user.mapper.UserBranchEvaluationMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserBranchEvaluationService {

	private UserBranchEvaluationMapper userBranchEvaluationMapper;
	
	public void addUserBranchEvaluation(UserBranchEvaluation userBranchEvaluation) {
		log.info("가맹 평가 전 userBranchEvaluation: {}", userBranchEvaluation);
		userBranchEvaluationMapper.addUserBranchEvaluation(userBranchEvaluation);
		log.info("가맹 평가 후 userBranchEvaluation: {}", userBranchEvaluation);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<UserBranchEvaluation> getUserBranchEvaluationList(){
		return userBranchEvaluationMapper.getUserBranchEvaluationList();
	}
}
