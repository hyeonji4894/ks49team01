package ks49team01.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks49team01.user.dto.UserNoticeBoard;
import ks49team01.user.mapper.UserNoticeBoardMapper;

@Service
public class UserNoticeBoardService {

    @Autowired
    private UserNoticeBoardMapper userNoticeBoardMapper;

    public UserNoticeBoard getNoticeBoard(String noticeBoardCode) {
        return userNoticeBoardMapper.getNoticeBoard(noticeBoardCode);
    }

    public List<UserNoticeBoard> getAllNoticeBoards() {
        return userNoticeBoardMapper.getAllNoticeBoards();
    }

    public void insertNoticeBoard(UserNoticeBoard noticeBoard) {
        userNoticeBoardMapper.insertNoticeBoard(noticeBoard);
    }

    public void updateNoticeBoard(UserNoticeBoard noticeBoard) {
        userNoticeBoardMapper.updateNoticeBoard(noticeBoard);
    }

    public void deleteNoticeBoard(String noticeBoardCode) {
        userNoticeBoardMapper.deleteNoticeBoard(noticeBoardCode);
    }
}
