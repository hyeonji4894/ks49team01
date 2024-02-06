package ks49team01.branch.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BranchReviewMileageCriteria {

	private String mileageCriteriaCode;
	private String memberId;
	private String mileageKind;
	private int mileageAmount;
	private LocalDate mileageCriteriaRegisterDate;
}
