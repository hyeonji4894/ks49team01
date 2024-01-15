package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/review")
@Slf4j
public class AdminReviewController {
	
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
	
	@GetMapping("/getReviewCategory")
	public String getReviewCategory(Model model){
		
		log.info("리뷰 카테고리 조회");
		
		model.addAttribute("title", "리뷰 카테고리 조회");
		
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
		
		log.info("리뷰 조회");
		
		model.addAttribute("title", "리뷰 조회");
		
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
		
		log.info("리뷰 댓글 조회");
		
		model.addAttribute("title", "리뷰 댓글 조회");
		
	return "admin/review_reply/get_review_reply";
	}
}