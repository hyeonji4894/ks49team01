package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.dto.AdminReviewCategory;
import ks49team01.admin.dto.AdminReviewReply;
import ks49team01.admin.service.AdminReviewService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/review")
@AllArgsConstructor
@Slf4j
public class AdminReviewController {
	
	private final AdminReviewService adminReviewService;
	
	@GetMapping("/addReviewCategory")
	public String addReviewCategory(Model model){
		
		log.info("리뷰 카테고리 등록");
		
		model.addAttribute("title", "리뷰 카테고리 등록");
		
	return "admin/review_category/add_review_category";
	}
	
	@GetMapping("/modifyReviewCategory")
	public String modifyReviewCategory(Model model){
		
		log.info("리뷰 카테고리 수정");
		
		model.addAttribute("title", "리뷰 카테고리 수정");
		
	return "admin/review_category/modify_review_category";
	}
	
	@GetMapping("/removeReviewCategory")
	public String removeReviewCategory(Model model){
		
		log.info("리뷰 카테고리 삭제");
		
		model.addAttribute("title", "리뷰 카테고리 삭제");
		
	return "admin/review_category/remove_review_category";
	}
	
	
	@PostMapping("/searchForCategoryContext")
	@ResponseBody
	public List<AdminReviewCategory> searchForCategoryContext(@RequestParam(value="searchCategoryContext") String reviewCategoryContext) {
		
		log.info("reviewCategoryContext: {}" ,reviewCategoryContext);
		
		List<AdminReviewCategory> searchCategoryContext = adminReviewService.getSearchCategoryContext(reviewCategoryContext);

		return searchCategoryContext;
	}
	
	
	
	@GetMapping("/getReviewCategory")
	public String getReviewCategory(Model model){
		
		List<AdminReviewCategory> adminReviewCategory = adminReviewService.getReviewCategory();
		
		log.info("adminReviewCategory: {}", adminReviewCategory);
		
		model.addAttribute("title", "리뷰 카테고리 조회");
		model.addAttribute("adminReviewCategory", adminReviewCategory);
		
	return "admin/review_category/get_review_category";
	}
	
	@GetMapping("/removeReview")
	public String removeReview(Model model){
		
		log.info("리뷰 삭제");
		
		model.addAttribute("title", "리뷰 삭제");
		
	return "admin/review/remove_review";
	}
	
	@GetMapping("/getReviewList")
	public String getReviewList(Model model){
		
		List<AdminReview> adminReviewList = adminReviewService.getReviewList();
		
		log.info("adminReviewList: {}", adminReviewList);
		
		model.addAttribute("title", "리뷰 조회");
		model.addAttribute("adminReviewList", adminReviewList);
		
	return "admin/review/get_review_list";
	}
	
	@GetMapping("/addReviewReply")
	public String addReviewReply(Model model){
		
		log.info("리뷰 댓글 등록");
		
		model.addAttribute("title", "리뷰 댓글 등록");
		
	return "admin/review_reply/add_review_reply";
	}
	
	@GetMapping("/modifyReviewReply")
	public String modifyReviewReply(Model model){
		
		log.info("리뷰 댓글 수정");
		
		model.addAttribute("title", "리뷰 댓글 수정");
		
	return "admin/review_reply/modify_review_reply";
	}
	
	@GetMapping("/removeReviewReply")
	public String removeReviewReply(Model model){
		
		log.info("리뷰 댓글 삭제");
		
		model.addAttribute("title", "리뷰 댓글 삭제");
		
	return "admin/review_reply/remove_review_reply";
	}
	
	@GetMapping("/getReviewReply")
	public String getReviewReply(Model model){
		
		List<AdminReviewReply> adminReviewReply = adminReviewService.getAdminReviewReply();
		
		log.info("adminReviewReply: {}", adminReviewReply);
		
		model.addAttribute("title", "리뷰 댓글 조회");
		model.addAttribute("adminReviewReply", adminReviewReply);
		
	return "admin/review_reply/get_review_reply";
	}
}