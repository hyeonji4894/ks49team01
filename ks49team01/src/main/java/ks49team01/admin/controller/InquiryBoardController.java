package ks49team01.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InquiryBoardController {

	private static final Logger log = LoggerFactory.getLogger(InquiryBoardController.class);
	
	@GetMapping("/getInquiryBoard")
	public String getInquiryBoard(Model model) {
		
		model.addAttribute("title", "1 대 1 문의 게시글 조회");
		
		log.info("1 대 1 문의 게시글 조회");
		
		return "admin/inquiryBoard/get_inquiry_board";
	}
}
