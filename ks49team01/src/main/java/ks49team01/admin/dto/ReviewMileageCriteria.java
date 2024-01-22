package ks49team01.admin.dto;

import lombok.Data;

@Data
public class ReviewMileageCriteria {

	private String mileageCriteriaCode;
	private String memberId;
	private String mileageKind;
	private String mileageAmount;
	private String mileageCriteriaRegisterDate;
}
