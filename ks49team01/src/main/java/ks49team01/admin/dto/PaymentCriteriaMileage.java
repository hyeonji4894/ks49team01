package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PaymentCriteriaMileage {
	
	private String roompayMileageRateCode;
	private String memberId;
	private String mileageGradeName;
	private String paymentCriteriaMileagePercent;
	private int paymentCriteriaUpgrade;
	private LocalDate mileageRateRegisterDate;
	
}
