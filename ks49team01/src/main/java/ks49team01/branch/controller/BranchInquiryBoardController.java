package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/branch/inquiryBoard")
@Controller
@Slf4j

public class BranchInquiryBoardController {

	
	@GetMapping("/getInquiryBoard")
	public String getInquiryBoard(Model model) {
		
		model.addAttribute("title", "1 대 1 문의 게시글 조회");
		
		log.info("1 대 1 문의 게시글 조회");
		
		return "branch/inquiryBoard/get_inquiry_board";
	}
}
