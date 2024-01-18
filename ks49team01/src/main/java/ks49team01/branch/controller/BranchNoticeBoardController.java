package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/branch/noticeBoard")
@Controller
@Slf4j
public class BranchNoticeBoardController {
	

	
	@GetMapping("/getNoticeBoard")
	public String getNoticeBoard(Model model) {
		
		model.addAttribute("title", "공지사항조회");
		
		log.info("공지사항조회");
		
		return "branch/noticeBoard/get_notice_board";
	}
}
