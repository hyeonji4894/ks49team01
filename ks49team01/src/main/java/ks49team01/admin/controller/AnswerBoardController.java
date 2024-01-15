package ks49team01.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnswerBoardController {

	private static final Logger log = LoggerFactory.getLogger(AnswerBoardController.class);
	
	@GetMapping("/get_answer_board")
	public String getAnswerBoard(Model model) {
		
		model.addAttribute("title", "1 대 1 문의 답변 게시글 조회");
		
		log.info("1 대 1 문의 답변 게시글 조회");
		
		return "admin/answerBoard/get_answer_board";
	}
}
