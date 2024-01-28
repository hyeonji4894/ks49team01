package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminRoyalty {
	private String month_royalty_payment_code;
	private String branch_code;
	private String monthly_sales_code;
	private String monthly_royalty;
	private String annual_royalty;
	private String payment_date;
	private String royalty_payment_period;
	private String payment_to_be_paid;
	private String payment_method;
	private String royalty_exemption;
	private String ranking_finish;
	private String payment_completed;
}
