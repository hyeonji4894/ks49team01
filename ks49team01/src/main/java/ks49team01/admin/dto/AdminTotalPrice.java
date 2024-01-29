package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminTotalPrice {

	private String paymentsDueCode;
	private String memberId;
	private String stayPeriodCode;
	private String reservationCode;
	private String branchCode;
	private String couponListCode;
	private int dueToPayPriceTotal;
	private int useMilage;
	private int useCoupon;
	private int finalPayment;
	private int mileageSave;
	private String finalPaymentState;
	private int royaltyPaymentAmountForEachCase;
}
