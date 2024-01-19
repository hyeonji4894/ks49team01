package ks49team01.user.dto;

import lombok.Data;

@Data
public class UserBranchEvaluation {
	
	private String grading_code;
	private String branch_recruit_code;
	private String question_code;
	private String member_id;
	private String list_of_branch_evaluation_questions;
	private int applicant_response;
	private int score_after_grading;
}	
	
