package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminAnswerBoard;
import ks49team01.admin.mapper.AdminAnswerBoardmapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminAnswerBoardService {

	private final AdminAnswerBoardmapper adminAnswerBoardmapper;
	
	public List<AdminAnswerBoard> getAnswerBoard(){
		return adminAnswerBoardmapper.getAnswerBoard();
		
	}
}
