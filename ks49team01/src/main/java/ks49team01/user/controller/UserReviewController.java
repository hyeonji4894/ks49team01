package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserReview;
import ks49team01.user.service.UserReviewService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user/review")
@AllArgsConstructor
@Slf4j
public class UserReviewController {

	private final UserReviewService userReviewService;
	
	@GetMapping("/getReview")
	public String getReview(Model model){
		
		List<UserReview> userReviewList = userReviewService.getUserReviewList();
		
		log.info("리뷰 조회: {}",userReviewList);
		
		model.addAttribute("title", "리뷰 조회");
		model.addAttribute("userReviewList", userReviewList);
		
		return "user/review/get_review";
	}
	
	@GetMapping("/getReviewDetail")
	public String getReviewDetail(Model model) {
		
		return "user/review/get_review_detail";
	}
	
	@GetMapping("/selectCategory")
	public String selectCategory(Model model){
		
		log.info("리뷰 카테고리 선택");
		
		model.addAttribute("title", "리뷰 카테고리 선택");
		
	return "user/review/select_review_category";
	}
	
	@GetMapping("/addReviewFile")
	public String addReviewFile(Model model){
		
		log.info("리뷰 첨부파일 등록");
		
		model.addAttribute("title", "리뷰 첨부파일 등록");
		
	return "user/review/add_review_file";
	}
	
	@GetMapping("/addReview")
	public String addReview(Model model){
		
		log.info("리뷰 등록");
		
		model.addAttribute("title", "리뷰 등록");
		
	return "user/review/add_review";
	}
	
	@GetMapping("/modifyReview")
	public String modifyReview(Model model){
		
		log.info("리뷰 수정");
		
		model.addAttribute("title", "리뷰 수정");
		
	return "user/review/modify_review";
	}
	
	@GetMapping("/removeReview")
	public String removeReview(Model model){
		
		log.info("리뷰 삭제");
		
		model.addAttribute("title", "리뷰 삭제");
		
	return "user/review/remove_review";
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("/addReviewReply")
	public String addReviewReply(Model model){
		
		log.info("리뷰 댓글 등록");
		
		model.addAttribute("title", "리뷰 댓글 등록");
		
	return "/user/review/add_review_reply";
	}
	
	@GetMapping("/modifyReviewReply")
	public String modifyReviewReply(Model model){
		
		log.info("리뷰 댓글 수정");
		
		model.addAttribute("title", "리뷰 댓글 수정");
		
	return "/user/review/modify_review_reply";
	}
	
	@GetMapping("/removeReviewReplly")
	public String removeReviewReplly(Model model){
		
		log.info("리뷰 댓글 삭제");
		
		model.addAttribute("title", "리뷰 댓글 삭제");
		
	return "/user/review/remove_review_reply";
	}
	
	@GetMapping("/getReviewReply")
	public String getReviewReply(Model model){
		
		log.info("리뷰 댓글 조회");
		
		model.addAttribute("title", "리뷰 댓글 조회");
		
	return "/user/review/get_review_reply";
	}
}
