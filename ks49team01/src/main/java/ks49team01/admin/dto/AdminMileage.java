package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminMileage {

	private String mileageListCode;
	private String memberId;
	private String paymentsDueCode;
	private String mileageKind;
	private int mileageSavePrice;
	private LocalDate mileageListRegisterDate;
}
