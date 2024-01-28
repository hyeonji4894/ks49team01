package ks49team01.admin.dto;

import java.time.LocalDateTime;

import ks49team01.user.dto.UserBranchManagement;
import lombok.Data;

@Data
public class AdminNoticeBoard {
	private String noticeBoardCode;
	private String branchCode;
	private String memberId;
	private String noticeBoardTitle;
	private String noticeBoardContent;
	private LocalDateTime noticeBoardRegDate;
	
	private AdminUser adminUser;
	private AdminUserLevel adminUserLevel;
	
	private UserBranchManagement userBranchManagement;

}
