package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminAnswerBoard;
import ks49team01.admin.service.AdminAnswerBoardService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@RequestMapping("/admin/answerBoard")
@Controller
@Slf4j

public class AdminAnswerBoardController {
	
	private AdminAnswerBoardService adminAnswerBoardService;
	
	@GetMapping("/getAnswerBoard")
	public String getAnswerBoard(Model model) {
		
		List<AdminAnswerBoard> answerBoard = adminAnswerBoardService.getAnswerBoard();
		model.addAttribute("title", "1 대 1 문의 답변 게시글 조회");
		model.addAttribute("answerBoard",answerBoard);
		
		log.info("answerBoard: {}",answerBoard);
		
		return "admin/answerBoard/get_answer_board";
	}
}
