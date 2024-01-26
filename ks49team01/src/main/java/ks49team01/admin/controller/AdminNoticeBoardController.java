package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ks49team01.admin.dto.AdminNoticeBoard;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.service.AdminNoticeBoardService;
import ks49team01.admin.service.AdminUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@AllArgsConstructor
@RequestMapping("/admin/noticeBoard")
@Controller
@Slf4j
public class AdminNoticeBoardController {
	
	private AdminNoticeBoardService adminNoticeBoardService;
	private final AdminUserService userService;
	
	@PostMapping("addNoticeBoard")
	public String addNoticeBoardList(AdminNoticeBoard adminNoticeBoard) {
		
		adminNoticeBoardService.addNoticeBoardList(adminNoticeBoard);
		

		return "Redirect:admin/noticeBoard/getNoticeBoard";
		
	}
	
	
	
	@GetMapping("/addNoticeBoard")
	public String addNoticeBoardList(Model model) {
		
		List<AdminUserLevel> memberLevel = userService.memberLevelList();
		model.addAttribute("title", "공지사항추가");
		model.addAttribute("memberLevel", memberLevel);
		
		return "admin/noticeBoard/add_notice_board";
	}
	
	@PostMapping("/searchForNoticeList")
	@ResponseBody
	public List<AdminNoticeBoard> SearchForNoticeList(@RequestBody Map<String, Object> searchMap) {
		
		log.info("searchMap: {}", searchMap);
		
		String searchKey = (String) searchMap.get("searchKey");
		if(searchKey != null) {
			switch (searchKey) {
				case "noticeBoardCode" -> searchKey = "notice_board_code";
				case "branchCode" -> searchKey = "branch_code";
				case "memberId" -> searchKey = "member_id";
				case "noticeBoardTitle" -> searchKey = "notice_board_title";
				case "noticeBoardContent" -> searchKey = "notice_board_content";
			}
			searchMap.put("searchKey", searchKey);
		}
		
		List<AdminNoticeBoard> searchList = adminNoticeBoardService.getSearchForNoticeList(searchMap);
		
		return searchList;
	}
	
	@GetMapping("/getNoticeBoard")
	public String getNoticeBoardList(Model model) {
		
		List<AdminNoticeBoard> NoticeBoardList = adminNoticeBoardService.getNoticeBoardList();
		
		log.info("NoticeBoardList: {}", NoticeBoardList);
		model.addAttribute("title", "공지사항조회");
		model.addAttribute("NoticeBoardList", NoticeBoardList );
		
		return "admin/noticeBoard/get_notice_board";
	}
}
