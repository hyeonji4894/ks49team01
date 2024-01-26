package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminNoticeBoard;

@Mapper
public interface AdminNoticeBoardMapper {
	
	
	public int addNoticeBoardList(AdminNoticeBoard adminNoticeBoard);
	
	public List<AdminNoticeBoard> getNoticeBoardList();
	
	public List<AdminNoticeBoard> getSearchForNoticeList(Map<String, Object> paramMap);
}
