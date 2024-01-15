package ks49team01.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user/answerBoard")
@Controller
public class UserBoardController {

	private static final Logger log = LoggerFactory.getLogger(UserBoardController.class);
	
	@GetMapping("/get_answer_board")
	public String getAnswerBoard(Model model) {
		
		model.addAttribute("title", "1 대 1 문의 답변 게시글 조회");
		
		log.info("1 대 1 문의 답변 게시글 조회");
		
		return "user/answerBoard/get_answer_board";
	}
}
