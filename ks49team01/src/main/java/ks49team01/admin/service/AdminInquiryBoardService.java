package ks49team01.admin.service;

import java.util.List;

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
	
	public List<AdminInquiryBoard> getInquiryBoard(){
		return adminInquiryBoardmapper.getInquiryBoard();
		
	}

}
