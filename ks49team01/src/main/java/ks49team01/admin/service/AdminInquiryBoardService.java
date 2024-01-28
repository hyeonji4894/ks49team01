package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminInquiryBoard;
import ks49team01.admin.mapper.AdminInquiryBoardmapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminInquiryBoardService {
	
	private final AdminInquiryBoardmapper adminInquiryBoardmapper;
	
	public int modifyadminInquiryBoardList(AdminInquiryBoard adminInquiryBoard) {
		return adminInquiryBoardmapper.addInquiryBoardList(adminInquiryBoard);
		
	}

	
	public AdminInquiryBoard adminInquiryBoard(String inquiry_board_code) {
		return adminInquiryBoardmapper.adminInquiryBoardIfno(inquiry_board_code);
		
	}
	/**
	 * 1대1 문의 추가
	 * @param adminInquiryBoard
	 * @return
	 */
	public int addInquiryBoardList(AdminInquiryBoard adminInquiryBoard) {
		return adminInquiryBoardmapper.addInquiryBoardList(adminInquiryBoard);
		
	}

	
	/**
	 * 1대1 문의 검색
	 * @param searchMap
	 * @return
	 */
	public List<AdminInquiryBoard> getSearchForInquiryList(Map<String, Object> searchMap) {
		
		return adminInquiryBoardmapper.getSearchForInquiryList(searchMap);
	}
	
	/**
	 * 1대1 문의 조회
	 * @return
	 */
	public List<AdminInquiryBoard> getInquiryBoard(){
		return adminInquiryBoardmapper.getInquiryBoard();
		
	}

}
