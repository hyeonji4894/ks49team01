package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminCloseSchoolComparisonBranch {
//폐교와 가맹점 이미지 비교 테이블임. TotalMap은 폐교 + 가맹점을 나타내기 위한 PK임
// total_map을 기준으로 close_school_code와 branch_code가 일치하다면 해당 폐교와 가맹점의 이미지를 보여주는 것임.
// 그렇게 하기 위해서 모든 정보를 가져와야 함? 내가 필요한 컬럼만 가져오면 되나?
// EX) AdminCloseSchoolComparisonBranch의 모든 컬럼 + 폐교 img + 가맹점 img
	// 위가 아니라면 AdminCloseSchoolComparisonBranch 모든 컬럼 + 폐교 모든 컬럼 + 가맹점 모든 컬럼;?
	
	private String totalMap;
	private String closeSchoolCode;
	private String memberId;
	private String branchCode;
	private String changeDate;
	private String firstDate;
	/*--까지 AdminCloseSchoolComparisonBranch의 컬럼 --*/
	private String closeSchoolImg;
	private String viewMapImg;
	private String closeSchoolName;
	/*--까지 closeSchool컬럼*/
	private String branchImage;
	private String branchName;
	/*--까지  branch 컬럼--*/
}
	
	
	
/*	private String totalMap;
	private String closeSchoolCode;
	private String memberId;
	private String roadAddress;
	private String roadAddressDetail;
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
}*/

// @Data를 활용해 getter, setter toString()을 작성 X