package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminCloseSchoolComparisonBranch {
	
	private String totalMap;
	private String closeSchoolCode;
	private String memberId;
	private String branchCode;
	private String coordinate;
	private String changeDate;
	private String firstDate;
	private String currentStatus;
}
// @Data를 활용해 getter, setter toString()을 작성 X