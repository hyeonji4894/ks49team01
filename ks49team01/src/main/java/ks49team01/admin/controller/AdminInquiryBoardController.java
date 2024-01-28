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

import ks49team01.admin.dto.AdminInquiryBoard;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.service.AdminInquiryBoardService;
import ks49team01.admin.service.AdminUserService;
import ks49team01.user.dto.UserBranchManagement;
import ks49team01.user.service.UserBranchManagementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@AllArgsConstructor
@RequestMapping("/admin/inquiryBoard")
@Controller
@Slf4j

public class AdminInquiryBoardController {

	private AdminInquiryBoardService adminInquiryBoardService;
	private UserBranchManagementService userBranchManagementService;
	private AdminUserService userService;
	
	

	@PostMapping("/modifyInquiryBoard")
	public String modifyNoticeBoardList(AdminInquiryBoard adminInquiryBoard) {
		adminInquiryBoardService.modifyadminInquiryBoardList(adminInquiryBoard);
		
		return "redirect:/admin/inquiryBoard/getInquiryBoard";
	}
	@GetMapping("/modifyInquiryBoard")
	public String modifyInquiryBoardList(@RequestParam(value="inquiry_board_code") String inquiry_board_code
	  ,Model model) {
		
		AdminInquiryBoard adminInquiryBoardIfno = adminInquiryBoardService.adminInquiryBoard(inquiry_board_code);
		List<UserBranchManagement> branchName = userBranchManagementService.getUserBranchManagementList();
		List<AdminUserLevel> memberLevel = userService.memberLevelList();
		model.addAttribute("title", "1대1문의 수정");
		model.addAttribute("memberLevel", memberLevel);
		model.addAttribute("branchName", branchName);
		model.addAttribute("adminInquiryBoardIfno", adminInquiryBoardIfno);
		
		return "admin/inquiryBoard/modify_inquiry_board";
	}
	
	/**
	 * 1대1 문의 등록
	 * @param adminInquiryBoard
	 * @return
	 */
	@PostMapping("addInquiryBoard")
	public String addInquiryBoardList(AdminInquiryBoard adminInquiryBoard) {
		adminInquiryBoardService.addInquiryBoardList(adminInquiryBoard);
		
		return "redirect:/admin/inquiryBoard/getInquiryBoard";
	}
	@GetMapping("/addInquiryBoard")
	public String addInquiryBoardList(Model model) {
		List<UserBranchManagement> branchName = userBranchManagementService.getUserBranchManagementList();
		List<AdminUserLevel> memberLevel = userService.memberLevelList();
		model.addAttribute("title", "1대1문의 작성");
		model.addAttribute("memberLevel", memberLevel);
		model.addAttribute("branchName", branchName);
		
		return "admin/inquiryBoard/add_inquiry_board";
	}
	
	/**
	 * 1대1 문의 검색
	 * @param searchMap
	 * @return
	 */
	
	@PostMapping("/searchForInquiryBoardList")
	@ResponseBody
	public List<AdminInquiryBoard> SearchForInquiryList(@RequestBody Map<String, Object> searchMap) {
		
		log.info("searchMap: {}", searchMap);
		
		String searchKey = (String) searchMap.get("searchKey");
		if(searchKey != null) {
			switch (searchKey) {
				case "inquiry_board_code" -> searchKey = "inquiry_board_code";
				case "branch_code" -> searchKey = "branch_code";
				case "member_id" -> searchKey = "ib.member_id";
				case "inquiry_board_title" -> searchKey = "inquiry_board_title";
				case "inquiry_board_content" -> searchKey = "inquiry_board_content";
			}
			searchMap.put("searchKey", searchKey);
		}
		
		List<AdminInquiryBoard> searchList = adminInquiryBoardService.getSearchForInquiryList(searchMap);
		
		return searchList;
	}
	
	
	/**
	 * 1대1문의 조회
	 * @param model
	 * @return
	 */
	@GetMapping("/getInquiryBoard")
	public String getInquiryBoard(Model model) {
		
		List<AdminInquiryBoard> InquiryBoard = adminInquiryBoardService.getInquiryBoard();
		log.info("InquiryBoard: {}", InquiryBoard);
		model.addAttribute("title", "1 대 1 문의 게시글 조회");
		model.addAttribute("InquiryBoard", InquiryBoard);
		
		return "admin/inquiryBoard/get_inquiry_board";
	}
}
