package ks49team01.branch.dto;

import lombok.Data;

@Data
public class BranchCoupon {

	private String couponCode;
	private String memberId;
	private String couponName;
	private String couponPrice;
	private String couponDueDate;
	private String couponKindRegisterDate;
	
	private String couponPrintCode;
	private String branchCode;
	private String couponMemberId;
	private String couponIssueDate;
	private String couponExpireDate;
	private String couponState;
	private String couponRegisterDate;
	
}
