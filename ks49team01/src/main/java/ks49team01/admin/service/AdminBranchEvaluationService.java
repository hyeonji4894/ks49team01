package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchEvaluation;
import ks49team01.admin.mapper.AdminBranchEvaluationMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminBranchEvaluationService {

	private AdminBranchEvaluationMapper adminBranchEvaluationMapper;
	
	public List<AdminBranchEvaluation> getAdminBranchEvaluationQuestionsList() {
		return adminBranchEvaluationMapper.getAdminBranchEvaluationQuestionsList();
	}
	public List<AdminBranchEvaluation> getAdminBranchEvaluationResponseAndGradeList() {
		return adminBranchEvaluationMapper.getAdminBranchEvaluationResponseAndGradeList();
	}	
	public List<AdminBranchEvaluation> getAdminBranchFinalDecisionTotalSumEvaluationList() {
		return adminBranchEvaluationMapper.getAdminBranchFinalDecisionTotalSumEvaluationList();
	}
	public List<AdminBranchEvaluation> getAdminTotalBranchApplyEvaluationList() {
		return adminBranchEvaluationMapper.getAdminTotalBranchApplyEvaluationList();
	}
	public List<AdminBranchEvaluation> getAdminBranchEvaluationScoringCriteriaList() {
		return adminBranchEvaluationMapper.getAdminBranchEvaluationScoringCriteriaList();
	}

}
