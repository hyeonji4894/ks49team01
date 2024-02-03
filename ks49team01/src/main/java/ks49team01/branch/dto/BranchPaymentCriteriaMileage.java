package ks49team01.branch.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BranchPaymentCriteriaMileage {
	
	private String roompayMileageRateCode;
	private String memberId;
	private String mileageGradeName;
	private String paymentCriteriaMileagePercent;
	private int paymentCriteriaUpgrade;
	private LocalDate mileageRateRegisterDate;
	
}
