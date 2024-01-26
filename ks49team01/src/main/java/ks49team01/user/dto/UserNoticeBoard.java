package ks49team01.user.dto;

import lombok.Data;

@Data
public class UserNoticeBoard {
    private String noticeBoardCode;
    private String branchCode;
    private String memberId;
    private String noticeBoardTitle;
    private String noticeBoardContent;
    private String noticeBoardRegDate;
}
