package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/branch/answerBoard")
@Controller
@Slf4j

public class BranchAnswerBoardController {
	@GetMapping("/getAnswerBoard")
	public String getAnswerBoard(Model model) {
		
		model.addAttribute("title", "1 대 1 문의 답변 게시글 조회");
		
		log.info("1 대 1 문의 답변 게시글 조회");
		
		return "branch/answerBoard/get_answer_board";
	}
}
