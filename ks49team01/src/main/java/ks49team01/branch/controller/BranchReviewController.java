package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/review")
@Slf4j
public class BranchReviewController {

	@GetMapping("/getReviewList")
	public String getReviewList(Model model){
		
		log.info("리뷰 목록 조회");
		
		model.addAttribute("title", "리뷰 목록 조회");
		
	return "/branch/review/get_review_list";
	}
	
	@GetMapping("/removeReview")
	public String removeReview(Model model){
		
		log.info("리뷰 삭제");
		
		model.addAttribute("title", "리뷰 삭제");
		
	return "/branch/review/remove_review";
	}
	
	@GetMapping("/addReviewReply")
	public String addReviewReply(Model model){
		
		log.info("리뷰 댓글 등록");
		
		model.addAttribute("title", "리뷰 댓글 등록");
		
	return "/branch/review_reply/add_review_reply";
	}
	
	@GetMapping("/modifyReviewReply")
	public String modifyReviewReply(Model model){
		
		log.info("리뷰 댓글 수정");
		
		model.addAttribute("title", "리뷰 댓글 수정");
		
	return "/branch/review_reply/modify_review_reply";
	}
	
	@GetMapping("/removeReviewReply")
	public String removeReviewReply(Model model){
		
		log.info("리뷰 댓글 삭제");
		
		model.addAttribute("title", "리뷰 댓글 삭제");
		
	return "/branch/review_reply/remove_review_reply";
	}
	
	@GetMapping("/getReviewReply")
	public String getReviewReply(Model model){
		
		log.info("리뷰 댓글 조회");
		
		model.addAttribute("title", "리뷰 댓글 조회");
		
	return "/branch/review_reply/get_review_reply";
	}
}
