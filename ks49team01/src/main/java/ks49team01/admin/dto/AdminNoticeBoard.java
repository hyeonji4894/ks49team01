package ks49team01.admin.dto;

import ks49team01.user.dto.UserBranchManagement;
import lombok.Data;

@Data
public class AdminNoticeBoard {
	private String noticeBoardCode;
	private String branchCode;
	private String memberId;
	private String noticeBoardTitle;
	private String noticeBoardContent;
	private String noticeBoardRegDate;
	
	private AdminUser adminUser;
	private AdminUserLevel adminUserLevel;
	
	private UserBranchManagement userBranchManagement;
	
	 

}
