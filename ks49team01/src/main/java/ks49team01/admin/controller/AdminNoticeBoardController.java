package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminNoticeBoard;
import ks49team01.admin.service.AdminNoticeBoardService;
import ks49team01.admin.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@AllArgsConstructor
@RequestMapping("/admin/noticeBoard")
@Controller
@Slf4j
public class AdminNoticeBoardController {
	
	private AdminNoticeBoardService adminNoticeBoardService;
	

	
	@GetMapping("/getNoticeBoard")
	public String getNoticeBoardList(Model model) {
		
		List<AdminNoticeBoard> NoticeBoardList = adminNoticeBoardService.getNoticeBoardList();
		
		log.info("NoticeBoardList: {}", NoticeBoardList);
		model.addAttribute("title", "공지사항조회");
		model.addAttribute("NoticeBoardList", NoticeBoardList );
		
		return "admin/noticeBoard/get_notice_board";
	}
}
