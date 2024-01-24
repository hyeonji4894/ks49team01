package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReviewMileageCriteria {

	private String mileageCriteriaCode;
	private String memberId;
	private String mileageKind;
	private int mileageAmount;
	private LocalDate mileageCriteriaRegisterDate;
}
