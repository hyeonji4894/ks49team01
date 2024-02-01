package ks49team01.user.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserReview {

	private String reviewNum;
	private int reviewListNum;
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
	private String roomName;
	private String branchName;
}
