package ks49team01.admin.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AdminSales {
	private String daily_sales_code;
	private String branchCode;
	private LocalDate DailySalesDay;
	private int totalPrice;
	private LocalDateTime dailySalesRegTime;
	
}
