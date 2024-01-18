package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminCloseSchool {
	private String closeSchoolCode;
	private String memberId;
	private String closeSchoolImg;
	private String closeSchoolArea;
	private String coordinate;
	// 원래 좌표는 SD_EDU_OFFC_DIV_NM 해당 명이다. 좌표는 X, Y 가 필요하지만 해당 프로젝트에선 위치를 좌표로 대체 시킨다.
	private String branchCurrentSituation;
	private long purchaseAmount;
	private String systemRegistrationDate;
	private String lastModifiedDate;
	private String viewMapImg;
}
// @Data를 활용해 getter, setter toString()을 작성 X