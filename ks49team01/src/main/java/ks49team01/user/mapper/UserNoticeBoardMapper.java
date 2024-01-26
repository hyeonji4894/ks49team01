package ks49team01.user.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserNoticeBoard;

@Mapper
public interface UserNoticeBoardMapper {

    UserNoticeBoard getNoticeBoard(String noticeBoardCode);

    List<UserNoticeBoard> getAllNoticeBoards();

    void insertNoticeBoard(UserNoticeBoard noticeBoard);

    void updateNoticeBoard(UserNoticeBoard noticeBoard);

    void deleteNoticeBoard(String noticeBoardCode);
}
