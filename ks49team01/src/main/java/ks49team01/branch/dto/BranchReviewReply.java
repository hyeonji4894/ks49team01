package ks49team01.branch.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BranchReviewReply {

	private String replyCode;
	private String memberId;
	private String reviewNum;
	private int reviewReplyNum;
	private String reviewReplyContext;
	private LocalDateTime reviewReplyRegisterTime;
	
}
