package ks49team01.admin.service;

import java.util.List;

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
	
	public List<AdminNoticeBoard> getNoticeBoardList(){
		return adminNoticeBoardMapper.getNoticeBoardList();
		
	}
	

}
