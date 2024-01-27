package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminNoticeBoard;

@Mapper
public interface AdminNoticeBoardMapper {
	
	/**
	 * 공지사항 추가
	 * @param adminNoticeBoard
	 * @return
	 */
	public int addNoticeBoardList(AdminNoticeBoard adminNoticeBoard);
	/**
	 * 공지사항 검색
	 * @param paramMap
	 * @return
	 */
	public List<AdminNoticeBoard> getSearchForNoticeList(Map<String, Object> paramMap);
	/**
	 * 공지사항 조회
	 * @return
	 */
	public List<AdminNoticeBoard> getNoticeBoardList();
	
}
