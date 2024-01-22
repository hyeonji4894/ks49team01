package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminInquiryBoard;

@Mapper
public interface AdminInquiryBoardmapper {
	List<AdminInquiryBoard> getInquiryBoard();

}
