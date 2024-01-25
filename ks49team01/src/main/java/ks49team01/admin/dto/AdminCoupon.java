package ks49team01.admin.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AdminCoupon {
	
	private String couponCode;
	private String memberId;
	private String couponName;
	private int couponPrice;
	private String couponDueDate;
	private LocalDate couponKindRegisterDate;
	
	private String branchCode;
	private String couponMemberId;
	private LocalDate CouponIssueDate;
	private LocalDate CouponExpireDate;
	private String couponState;
	private LocalDateTime couponRegisterTime;
}
