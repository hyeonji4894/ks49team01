package ks49team01.branch.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BranchCoupon {
	
	private String couponCode;
	private String memberId;
	private String couponName;
	private int couponPrice;
	private String couponDueDate;
	private LocalDate couponKindRegisterDate;
	
	private String couponListCode;
	private String couponGiveId;
	private LocalDate couponGiveDate;
	private LocalDate couponExpireDate;
	private LocalDate couponListRegisterDate;
}
