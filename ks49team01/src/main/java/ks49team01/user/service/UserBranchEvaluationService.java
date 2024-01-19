package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchEvaluation;
import ks49team01.user.mapper.UserBranchEvaluationMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserBranchEvaluationService {

	private UserBranchEvaluationMapper userBranchEvaluationMapper;
	
	/**
	 * 가맹 신청 조회
	 */
	public List<UserBranchEvaluation> getUserBranchEvaluationList(){
		return userBranchEvaluationMapper.getUserBranchEvaluationList();
	}
}
