package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminReservationUser {
	private String stayPeriodCode;
	private String memberId;
	private String branchCode;
	private String checkIn;
	private String checkOut;
	private String numberOfStays;
	private String reservRegistrationDate;
}