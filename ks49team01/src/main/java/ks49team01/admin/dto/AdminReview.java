package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminReview {
	
	private String reviewNum;
	private String memberId;
	private String branchCode;
	private String paymentsDueCode;
	private String stayPeriodCode;
	private String roomCode;
	private String reviewContext;
	private LocalDate reviewDate;
	private int reviewViews;
	private String reviewFileCode;
	private String FileAttribute;
}
