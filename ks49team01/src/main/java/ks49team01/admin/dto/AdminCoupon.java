package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminCoupon {
	
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
