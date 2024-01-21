package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminBranchManagement {
	private String branch_code;
	private String member_id;
	private String branch_name;
	private String branch_addr;
	private String branch_phone;
	private String branch_representative;
	private int branch_start_date;
	private int branch_end_date;
	private String branch_image;
}	
	
