package ks49team01.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("admin/noticeBoard")
@Controller
public class NoticeBoardController {
	

	private static final Logger log = LoggerFactory.getLogger(NoticeBoardController.class);
	
	@GetMapping("/getNoticeBoard")
	public String getNoticeBoard(Model model) {
		
		model.addAttribute("title", "공지사항조회");
		
		log.info("공지사항조회");
		
		return "admin/noticeBoard/get_notice_board";
	}
}
