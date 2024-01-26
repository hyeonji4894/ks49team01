package ks49team01.branch.dto;

import lombok.Data;

@Data
public class BranchTotalPrice {

	private String paymentsDueCode;
	private String memberId;
	private String stayPeriodCode;
	private String reservationCode;
	private String branchCode;
	private String couponPrintCode;
	private int dueToPayPriceTotal;
	private int useMilage;
	private int useCoupon;
	private int finalPayment;
	private int mileageSave;
	private String finalPaymentState;
	private int royaltyPaymentAmountForEachCase;
}
