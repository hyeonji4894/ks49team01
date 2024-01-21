package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminBranchApply {
	private String branch_apply_code;
	private String branch_recruit_code;
	private String close_school_code;
	private String member_id;
	private int branch_apply_date;
}
