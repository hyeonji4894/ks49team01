package ks49team01.branch.dto;

import lombok.Data;

@Data
public class BranchCloseSchool {
	private String closeSchoolCode;
	private String memberId;
	private String closeSchoolImg;
	private String closeSchoolArea;
	private String coordinate;
	private String branchCurrentSituation;
	private long purchaseAmount;
	private String systemRegistrationDate;
	private String lastModifiedDate;
	private String viewMapImg;
}