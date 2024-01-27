package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminInquiryBoard;

@Mapper
public interface AdminInquiryBoardmapper {
	
	/**
	 * 1대1 문의 추가
	 * @param adminInquiryBoard
	 * @return
	 */
	public int addInquiryBoardList(AdminInquiryBoard adminInquiryBoard);

	
	/**
	 *  1대1문의 검색
	 * @param paramMap
	 * @return
	 */
	List<AdminInquiryBoard> getSearchForInquiryList(Map<String, Object> paramMap);
	
	/**
	 * 1대1 문의 조회
	 * @return
	 */
	List<AdminInquiryBoard> getInquiryBoard();

}
