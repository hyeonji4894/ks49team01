package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminNoticeBoard {
	private String noticeBoardCode;
	private String branchCode;
	private String memberId;
	private String noticeBoardTitle;
	private String noticeBoardContent;
	private String noticeBoardRegDate;

}
