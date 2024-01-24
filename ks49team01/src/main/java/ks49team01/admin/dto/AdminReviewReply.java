package ks49team01.admin.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AdminReviewReply {

	private String replyCode;
	private String memberId;
	private String reviewNum;
	private int reviewReplyNum;
	private String reviewReplyContext;
	private String reviewReplyName;
	private LocalDateTime reviewReplyRegisterTime;
	
}
