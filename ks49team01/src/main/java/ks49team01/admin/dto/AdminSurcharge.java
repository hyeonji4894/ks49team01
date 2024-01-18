package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminSurcharge {
	// 리스트 등록에 필요
	private String seasonSurchargeListCode;
	private String listRegistrantId;
	private String lowseasonPeakseason;
	private String dayOfTheWeek;
	private String systemRegisterDate;
	
	// 가맹점이 등록한 리스트 조회에 필요하여 추가
	private String branchSeasonUnitPriceCode;
	private String surchargeRegistrantId;
	private String branchCode;
	private String additionalAmount;
	private String registerDate;
}
