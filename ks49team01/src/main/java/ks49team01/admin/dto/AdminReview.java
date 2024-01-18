package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminReview {
	
	private String reviewNum;
	private String memberId;
	private String roomCode;
	private String visitDate;
	private String reviewContext;
	private String reviewDate;
	private String reviewViews;
}
