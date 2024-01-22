package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminInquiryBoard;
import ks49team01.admin.service.AdminInquiryBoardService;
import ks49team01.admin.service.AdminNoticeBoardService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@AllArgsConstructor
@RequestMapping("/admin/inquiryBoard")
@Controller
@Slf4j

public class AdminInquiryBoardController {

	private AdminInquiryBoardService adminInquiryBoardService;
	@GetMapping("/getInquiryBoard")
	public String getInquiryBoard(Model model) {
		
		List<AdminInquiryBoard> InquiryBoard = adminInquiryBoardService.getInquiryBoard();
		log.info("InquiryBoard: {}", InquiryBoard);
		model.addAttribute("title", "1 대 1 문의 게시글 조회");
		model.addAttribute("InquiryBoard", InquiryBoard);
		
		return "admin/inquiryBoard/get_inquiry_board";
	}
}
