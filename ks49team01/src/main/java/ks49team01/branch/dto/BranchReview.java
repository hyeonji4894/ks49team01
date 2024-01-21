package ks49team01.branch.dto;

import lombok.Data;

@Data
public class BranchReview {

	private String reviewNum;
	private String memberId;
	private String roomCode;
	private String visitDate;
	private String reviewContext;
	private String reviewDate;
	private String reviewViews;
}
