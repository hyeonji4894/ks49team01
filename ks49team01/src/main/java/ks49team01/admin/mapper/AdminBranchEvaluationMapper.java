package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminBranchEvaluation;

@Mapper
public interface AdminBranchEvaluationMapper {

	List<AdminBranchEvaluation> getAdminBranchEvaluationQuestionsList();

	List<AdminBranchEvaluation> getAdminBranchEvaluationResponseAndGradeList();

	List<AdminBranchEvaluation> getAdminBranchFinalDecisionTotalSumEvaluationList();

	List<AdminBranchEvaluation> getAdminTotalBranchApplyEvaluationList();

	List<AdminBranchEvaluation> getAdminBranchEvaluationScoringCriteriaList();
	
}
