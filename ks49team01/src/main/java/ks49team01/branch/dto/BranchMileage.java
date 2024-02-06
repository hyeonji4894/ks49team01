package ks49team01.branch.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BranchMileage {

	private String mileageListCode;
	private String memberId;
	private String paymentsDueCode;
	private String mileageKind;
	private int mileageSavePrice;
	private LocalDate mileageListRegisterDate;
}
