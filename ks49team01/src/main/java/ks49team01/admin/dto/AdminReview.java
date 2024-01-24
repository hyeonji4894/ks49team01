package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminReview {
	
	private String reviewNum;
	private String memberId;
	private String roomCode;
	private LocalDate visitDate;
	private String reviewContext;
	private LocalDate reviewDate;
	private int reviewViews;
}
