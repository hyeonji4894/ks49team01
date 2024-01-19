package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchEvaluation;
import ks49team01.admin.mapper.AdminBranchEvaluationMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminBranchEvaluationService {

	private AdminBranchEvaluationMapper adminBranchEvaluationMapper;
	
	public void addAdminBranchEvaluation(AdminBranchEvaluation adminBranchEvaluation) {
		log.info("가맹 평가 전 adminBranchEvaluation: {}", adminBranchEvaluation);
		adminBranchEvaluationMapper.addAdminBranchEvaluation(adminBranchEvaluation);
		log.info("가맹 평가 후 adminBranchEvaluation: {}", adminBranchEvaluation);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<AdminBranchEvaluation> getAdminBranchEvaluationList(){
		return adminBranchEvaluationMapper.getAdminBranchEvaluationList();
	}
}
