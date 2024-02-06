package ks49team01.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user/inquiryBoard")
@Controller
public class UserInquiryBoardController {

	private static final Logger log = LoggerFactory.getLogger(UserInquiryBoardController.class);
	
	@GetMapping("/getInquiryBoard")
	public String getInquiryBoard(Model model) {
		
		model.addAttribute("title", "1 대 1 문의 게시글 조회");
		
		log.info("1 대 1 문의 게시글 조회");
		
		return "user/inquiryBoard/get_inquiry_board";
	}
}
