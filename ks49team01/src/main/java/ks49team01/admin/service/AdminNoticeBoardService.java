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
	
	public int addNoticeBoardList(AdminNoticeBoard adminNoticeBoard) {
		return adminNoticeBoardMapper.addNoticeBoardList(adminNoticeBoard);
		
	}

	public List<AdminNoticeBoard> getSearchForNoticeList(Map<String, Object> searchMap) {
		// TODO Auto-generated method stub
		return adminNoticeBoardMapper.getSearchForNoticeList(searchMap);
	}

	public List<AdminNoticeBoard> getNoticeBoardList() {
		// TODO Auto-generated method stub
		return adminNoticeBoardMapper.getNoticeBoardList();
	}

	

	
	

}
