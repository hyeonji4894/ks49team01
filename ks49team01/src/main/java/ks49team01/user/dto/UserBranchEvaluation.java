package ks49team01.user.dto;

import lombok.Data;

@Data
public class UserBranchEvaluation {
	
	private String questionCode;
	private String memberId;
	private String branchEvaluationRegisterDate;
	private String listOfBranchEvaluationQuestions;
	private String grading_code;
	private String branch_recruit_code;
	private int applicant_response;
	private int score_after_grading;
	private String grading_criteria_code;
	private String standard;
	private String more;
	private String under;
	private int score_num;
	private int score;
	private String evaluation_criteria_date;
	private String pass_or_not_code;
	private int evaluation_total_score;
	private String pass_or_not;
	private String total_evaluation_code;
	private String close_school_code;
	private int total;
	private String registrant_id;
	private String system_registration_time;
	
}	
	
