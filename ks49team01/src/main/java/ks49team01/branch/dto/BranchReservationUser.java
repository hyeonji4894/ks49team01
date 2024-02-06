package ks49team01.branch.dto;

import lombok.Data;

@Data
public class BranchReservationUser {	
	private String stayPeriodCode;
	private String memberId;
	private String branchCode;
	private String checkIn;
	private String checkOut;
	private String numberOfStays;
	private String reservRegistrationDate;

}
