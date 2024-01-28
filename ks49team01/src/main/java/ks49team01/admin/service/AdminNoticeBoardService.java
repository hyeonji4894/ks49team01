package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminNoticeBoard;
import ks49team01.admin.mapper.AdminNoticeBoardMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminNoticeBoardService {
	
	private final AdminNoticeBoardMapper adminNoticeBoardMapper;
	
	public AdminNoticeBoard noticeBoardInfo(String noticeBoardCode) {
		return adminNoticeBoardMapper.noticeBoardInfo(noticeBoardCode);
		
	}
	
	public int modifyNoticeBoardList(AdminNoticeBoard adminNoticeBoard) {
		return adminNoticeBoardMapper.addNoticeBoardList(adminNoticeBoard);
		
	}
	
	/**
	 * 공지사항 추가
	 * @param adminNoticeBoard
	 * @return
	 */
	public int addNoticeBoardList(AdminNoticeBoard adminNoticeBoard) {
		return adminNoticeBoardMapper.addNoticeBoardList(adminNoticeBoard);
		
	}
	
	/**
	 * 공지사항 검색
	 * @param searchMap
	 * @return
	 */
	public List<AdminNoticeBoard> getSearchForNoticeList(Map<String, Object> searchMap) {

		return adminNoticeBoardMapper.getSearchForNoticeList(searchMap);
	}
	
	/**
	 * 공지사항 조회
	 * @return
	 */
	public List<AdminNoticeBoard> getNoticeBoardList() {
		// TODO Auto-generated method stub
		return adminNoticeBoardMapper.getNoticeBoardList();
	}

	

	
	

}
