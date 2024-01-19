package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchReview;
import ks49team01.branch.dto.BranchReviewReply;
import ks49team01.branch.service.BranchReviewService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/review")
@AllArgsConstructor
@Slf4j
public class BranchReviewController {

	private BranchReviewService branchReviewService;
	
	@GetMapping("/getReviewList")
	public String getReviewList(Model model){
		
		List<BranchReview> branchReviewList = branchReviewService.getReveiwList();
		
		log.info("branchReviewList: {}", branchReviewList);
		
		model.addAttribute("title", "리뷰 목록 조회");
		model.addAttribute("branchReviewList", branchReviewList);
		
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
		
		List<BranchReviewReply> branchReviewReply = branchReviewService.getBranchReviewReply();
		log.info("branchReviewReply: {}", branchReviewReply);
		
		model.addAttribute("title", "리뷰 댓글 조회");
		model.addAttribute("branchReviewReply", branchReviewReply);
		
	return "/branch/review_reply/get_review_reply";
	}
}
