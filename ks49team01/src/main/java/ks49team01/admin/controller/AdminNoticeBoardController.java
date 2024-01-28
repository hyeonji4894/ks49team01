package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks49team01.admin.dto.AdminNoticeBoard;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.service.AdminNoticeBoardService;
import ks49team01.admin.service.AdminUserService;
import ks49team01.user.dto.UserBranchManagement;
import ks49team01.user.service.UserBranchManagementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@AllArgsConstructor
@RequestMapping("/admin/noticeBoard")
@Controller
@Slf4j
public class AdminNoticeBoardController {
	
	private UserBranchManagementService userBranchManagementService;

	private AdminNoticeBoardService adminNoticeBoardService;
	private final AdminUserService userService;
	
	@PostMapping("/modifyNoticeBoard")
	public String modifyNoticeBoardList(AdminNoticeBoard adminNoticeBoard) {
		adminNoticeBoardService.modifyNoticeBoardList(adminNoticeBoard);
		
		return "redirect:/admin/noticeBoard/getNoticeBoard";
	}
	@GetMapping("/modifyNoticeBoard")
	public String  modifyNoticeBoardList(@RequestParam(value="noticeBoardCode") String noticeBoardCode
			  ,Model model) {
		// "notice_board_"를 붙여서 받아오도록 수정
	    //AdminNoticeBoard noticeBoardInfo = adminNoticeBoardService.noticeBoardInfo("notice_board_code_" + noticeBoardCode);
	    //AdminNoticeBoard noticeBoardInfo = adminNoticeBoardService.noticeBoardInfo("notice_board_code_" + noticeBoardCode);

		AdminNoticeBoard noticeBoardInfo = adminNoticeBoardService.noticeBoardInfo(noticeBoardCode);
		
		List<UserBranchManagement> branchName = userBranchManagementService.getUserBranchManagementList();
		List<AdminUserLevel> memberLevel = userService.memberLevelList();
		model.addAttribute("title", "공지사항 수정");
		model.addAttribute("memberLevel", memberLevel);
		model.addAttribute("branchName", branchName);
		model.addAttribute("noticeBoardInfo", noticeBoardInfo);

		return "admin/noticeBoard/modify_notice_board";
	}
	
	/**
	 * 공지사항 추가
	 * @param model
	 * @return
	 */
	@PostMapping("addNoticeBoard")
	public String addNoticeBoardList(AdminNoticeBoard adminNoticeBoard) {
		adminNoticeBoardService.addNoticeBoardList(adminNoticeBoard);
		
		return "redirect:/admin/noticeBoard/getNoticeBoard";
	}
	@GetMapping("/addNoticeBoard")
	public String addNoticeBoardList(Model model) {
		List<UserBranchManagement> branchName = userBranchManagementService.getUserBranchManagementList();
		List<AdminUserLevel> memberLevel = userService.memberLevelList();
		model.addAttribute("title", "공지사항 작성");
		model.addAttribute("memberLevel", memberLevel);
		model.addAttribute("branchName", branchName);
		
		return "admin/noticeBoard/add_notice_board";
	}
	/**
	 * 공지사항 검색 항목
	 * @param searchMap
	 * @return
	 */
	@PostMapping("/searchForNoticeList")
	@ResponseBody
	public List<AdminNoticeBoard> SearchForNoticeList(@RequestBody Map<String, Object> searchMap) {
		
		log.info("searchMap: {}", searchMap);
		
		String searchKey = (String) searchMap.get("searchKey");
		if(searchKey != null) {
			switch (searchKey) {
				case "noticeBoardCode" -> searchKey = "notice_board_code";
				case "branchCode" -> searchKey = "branch_code";
				case "memberId" -> searchKey = "nb.member_id";
				case "noticeBoardTitle" -> searchKey = "notice_board_title";
				case "noticeBoardContent" -> searchKey = "notice_board_content";
			}
			searchMap.put("searchKey", searchKey);
		}
		
		List<AdminNoticeBoard> searchList = adminNoticeBoardService.getSearchForNoticeList(searchMap);
		
		return searchList;
	}
	/**
	 * 공지사상 조회
	 * @param model
	 * @return
	 */
	@GetMapping("/getNoticeBoard")
	public String getNoticeBoardList(Model model) {
		
		List<AdminNoticeBoard> NoticeBoardList = adminNoticeBoardService.getNoticeBoardList();
		
		log.info("NoticeBoardList: {}", NoticeBoardList);
		model.addAttribute("title", "공지사항조회");
		model.addAttribute("NoticeBoardList", NoticeBoardList );
		
		return "admin/noticeBoard/get_notice_board";
	}
}
