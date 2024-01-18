package ks49team01.admin.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AdminCoupon {
	private String couponCode;
	private String memberId;
	private String couponName;
	private String couponPrice;
	private String couponDueDate;
	private String couponKindRegisterDate;
}
