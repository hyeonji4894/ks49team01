package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminCloseSchool {
	private String closeSchoolCode;
	private String closeSchoolName;
	private String memberId;
	private String closeSchoolImg;
	private String closeSchoolArea;
	private String roadAddress;
	private String roadAddressDetail;	
	private String branchCurrentSituation;
	private long purchaseAmount;
	private String systemRegistrationDate;
	private String lastModifiedDate;
	private String viewMapImg;
}