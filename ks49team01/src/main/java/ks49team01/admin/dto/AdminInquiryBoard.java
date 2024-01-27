package ks49team01.admin.dto;

import java.time.LocalDateTime;

import ks49team01.user.dto.UserBranchManagement;
import lombok.Data;

@Data
public class AdminInquiryBoard {
	
	private String inquiry_board_code;
	private String branch_code;
	private String member_id;
	private String inquiry_board_title;
	private String inquiry_board_content;
	private LocalDateTime inquiry_board_reg_time;
	private AdminUserLevel adminUserLevel;
	
	private UserBranchManagement userBranchManagement;
	
}
