package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/admin/noticeBoard")
@Controller
@Slf4j
public class AdminNoticeBoardController {
	

	
	@GetMapping("/getNoticeBoard")
	public String getNoticeBoard(Model model) {
		
		model.addAttribute("title", "공지사항조회");
		
		log.info("공지사항조회");
		
		return "admin/noticeBoard/get_notice_board";
	}
}
