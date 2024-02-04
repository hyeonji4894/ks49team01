package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	// 리뷰목록 조회
	@GetMapping("/getReview")
	public String getReview(Model model) {
		
		List<UserReview> userReviewList = userReviewService.getUserReviewList();
		
		log.info("userReviewList: {}", userReviewList);
		
		model.addAttribute("title", "리뷰목록조회");
		model.addAttribute("userReviewList", userReviewList);
		
		return "user/review/get_review";
	}
	
	// 자세한 리뷰 조회
	@GetMapping("/getReviewDetail")
	public String getReviewDetail(@RequestParam(value="reviewNum", required = false)String reviewNum
								,Model model) {

		UserReview reviewDetail = userReviewService.getReviewByNum(reviewNum);
		
		log.info("reviewDetail: {}", reviewDetail);
		
		model.addAttribute("reviewDetail", reviewDetail);
		
		return "user/review/get_review_detail";
	}
		

	// 리뷰등록
	@GetMapping("/addReview")
	public String addReview(Model model) {
		
		log.info("리뷰 등록");
		
		model.addAttribute("title", "리뷰등록");
		
		return "user/review/add_review";
	}
		
	// 리뷰 수정
	@PostMapping("/modifyReview")
	public String modifyReview(UserReview userReview
								,@RequestParam(name="reviewNum", required=false)String reviewNum
								, Model model) {
		
		
		
		return "user/review/getReviewDetail";
	}
}
