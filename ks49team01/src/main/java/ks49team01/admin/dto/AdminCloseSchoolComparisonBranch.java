package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminCloseSchoolComparisonBranch {
	
	private String totalMap;
	private String closeSchoolCode;
	private String memberId;
	private String coordinate;
	private String changeDate;
	private String firstDate;
	private String currentStatus;
// 폐교 dto
	private String closeSchoolImg;
	private String closeSchoolArea;
	private String branchCurrentSituation;
	private long purchaseAmount;
	private String systemRegistrationDate;
	private String lastModifiedDate;
	private String viewMapImg;
//가맹점 dto
	private String branchCode;
	private String branchName;
	private String branchAddr;
	private String branchPhone;
	private String branchRepresentative;
	private String branchStartDate;
	private String branchEndDate;
	private String branchImage;
}

// @Data를 활용해 getter, setter toString()을 작성 X