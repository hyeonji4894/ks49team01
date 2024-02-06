package ks49team01.branch.controller;

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

import jakarta.servlet.http.HttpSession;
import ks49team01.branch.dto.BranchReview;
import ks49team01.branch.dto.BranchReviewCategory;
import ks49team01.branch.dto.BranchReviewReply;
import ks49team01.branch.mapper.BranchReviewMapper;
import ks49team01.branch.service.BranchReviewService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/review")
@AllArgsConstructor
@Slf4j
public class BranchReviewController {
	
	private final BranchReviewService branchReviewService;
	private final BranchReviewMapper branchReviewMapper;
	
	// 리뷰카테고리 등록화면
	@GetMapping("/addReviewCategory")
	public String addReviewCategory(Model model){
		
		log.info("리뷰카테고리 등록");
		
		model.addAttribute("title", "리뷰 카테고리 등록");
		
	return "branch/review_category/add_review_category";
	}
	
	// 리뷰카테고리 등록
	@PostMapping("/addReviewCategory")
	public String addReviewCategory(BranchReviewCategory branchReviewCategory, HttpSession session) {
		
		log.info("리뷰카테고리 등록 branchReviewCategory: {}", branchReviewCategory);
		
		branchReviewCategory.setMemberId("id001");
		
		branchReviewService.addReviewCategory(branchReviewCategory);
		
		return "redirect:/branch/review/getReviewCategory";
	}
	
	// 리뷰카테고리 수정
	@PostMapping("/modifyReviewCategory")
	public String modifyReviewCategory(BranchReviewCategory branchReviewCategory, HttpSession session) {
		log.info("리뷰카테고리 수정: {}", branchReviewCategory);
		
		// 특정코드로 수정
		branchReviewService.modifyReviewCategory(branchReviewCategory);
		
		return "redirect:/branch/review/getReviewCategory";
	}	
	
	
	
	// 리뷰 카테고리 수정화면
	@GetMapping("/modifyReviewCategory")
	public String modifyReviewCategory(@RequestParam(value = "categoryCode")String categoryCode
										,Model model){

	log.info("카테고리 수정화면 categoryCode : {}", categoryCode);
	
	// 특정코드 조회
	BranchReviewCategory branchReviewCategory = branchReviewService.getReviewCategoryByCode(categoryCode);
	
	model.addAttribute("branchReviewCategory", branchReviewCategory);
	
	return "branch/review_category/modify_review_category";
}
	

	//리뷰카테고리 삭제
	@GetMapping("/removeReviewCategory")
	public String removeReviewCategory(Model model){
		
		log.info("리뷰 카테고리 삭제");
		
		model.addAttribute("title", "리뷰 카테고리 삭제");
		
	return "branch/review_category/remove_review_category";
	}
	
	
	// 리뷰 카테고리 최종 검색
	@PostMapping("/getSearchCategory")
	@ResponseBody
	public List<BranchReviewCategory> getSearchCategory(@RequestBody List<Map<String, Object>> paramList) {
		log.info("검색 내용 선택 : {}", paramList);
		if(paramList != null) {
			paramList.forEach(paramMap -> {
				String searchKey = (String) paramMap.get("searchKey");
				switch (searchKey) {
					case "reviewCategoryContext" -> searchKey = "review_category_context"; 
					case "reviewCategoryKind" -> searchKey = "review_category_kind"; 
				}
				paramMap.put("searchKey",searchKey);
			});
		}
		log.info("선택 내용 검색 : {}", paramList);
		
		
		List<BranchReviewCategory> searchReviewCategory = branchReviewMapper.getSearchCategory(paramList);
		
		
		return searchReviewCategory;
	}
	
	
	// 리뷰카테고리 목록조회
	@GetMapping("/getReviewCategory")
	public String getReviewCategory(Model model){
		
		List<BranchReviewCategory> branchReviewCategory = branchReviewService.getReviewCategory();
		
		log.info("branchReviewCategory: {}", branchReviewCategory);
		
		model.addAttribute("title", "리뷰 카테고리 조회");
		model.addAttribute("branchReviewCategory", branchReviewCategory);
		
	return "branch/review_category/get_review_category";
	}
	
	
	
	
	
	
	
	
	 
	// 리뷰 목록 조회
	@GetMapping("/getReviewList")
	public String getReviewList(Model model){
		
		List<BranchReview> branchReviewList = branchReviewService.getReviewList();
		
		log.info("branchReviewList: {}", branchReviewList);
		
		model.addAttribute("title", "리뷰 조회");
		model.addAttribute("branchReviewList", branchReviewList);
		
	return "branch/review/get_review_list";
	}
	
	// 리뷰 삭제
	@GetMapping("/removeReview")
	public String removeReview(Model model){
		
		log.info("리뷰 삭제");
		
		model.addAttribute("title", "리뷰 삭제");
		
		return "branch/review/remove_review";
	}
	
	// 리뷰 내용 검색(모달)
	@PostMapping("/getSearchReviewContext")
	@ResponseBody
	public List<BranchReview> getSearchReviewContext(@RequestParam(value="searchReviewContext") String reviewContext){
		
		log.info("reviewContext: {}", reviewContext);
		
		List<BranchReview> searchReviewContext = branchReviewService.getSearchReviewContext(reviewContext);
		
		return searchReviewContext;
		
	}
	
	// 리뷰내용 최종검색
	@PostMapping("/searchReviewList")
	@ResponseBody
	public List<BranchReview> searchReviewList(@RequestBody List<Map<String, Object>> paramList){
		
		log.info("검색 조건 선택:{}" , paramList);
		if(paramList != null) {
			paramList.forEach(searchMap -> {
				String searchKey = (String) searchMap.get("searchKey");
				switch (searchKey) {
					case "reviewContext" -> searchKey = "review_context";
				}
				searchMap.put("searchKey", searchKey);
			});
		}
		log.info("선택 조건 검색:{}" , paramList);
		
		List<BranchReview> searchByReview = branchReviewService.getSearchByReview(paramList);
		
		return searchByReview;
		
	}
	
	
	
	
	
	
	
	// 리뷰 댓글 조회
	@GetMapping("/getReviewReply")
	public String getReviewReply(Model model){
		
		List<BranchReviewReply> branchReviewReply = branchReviewService.getBranchReviewReply();
		
		log.info("branchReviewReply: {}", branchReviewReply);
		
		model.addAttribute("title", "리뷰 댓글 조회");
		model.addAttribute("branchReviewReply", branchReviewReply);
		
		return "branch/review_reply/get_review_reply";
	}
	
	
	// 리뷰 댓글 등록
	@GetMapping("/addReviewReply")
	public String addReviewReply(Model model){
		
		log.info("리뷰 댓글 등록");
		
		model.addAttribute("title", "리뷰 댓글 등록");
		
	return "branch/review_reply/add_review_reply";
	}
	
	// 리뷰 댓글 수정
	@GetMapping("/modifyReviewReply")
	public String modifyReviewReply(Model model){
		
		log.info("리뷰 댓글 수정");
		
		model.addAttribute("title", "리뷰 댓글 수정");
		
	return "branch/review_reply/modify_review_reply";
	}
	
		
	// 리뷰 댓글 삭제
	@GetMapping("/removeReviewReply")
	public String removeReviewReply(Model model){
		
		log.info("리뷰 댓글 삭제");
		
		model.addAttribute("title", "리뷰 댓글 삭제");
		
	return "branch/review_reply/remove_review_reply";
	}
	
	
	// 리뷰댓글 내용 검색(모달)
	@PostMapping("/getSearchReviewReplyContext")
	@ResponseBody
	public List<BranchReviewReply> getSearchReviewReplyContext(@RequestParam(value="searchReviewReplyContext") String reviewReplyContext){
		
		log.info("reviewReplyContext: {}", reviewReplyContext);
		
		List<BranchReviewReply> searchReviewReplyContext = branchReviewService.getSearchReviewReplyContext(reviewReplyContext);
		
		return searchReviewReplyContext;
		
	}
	
	// 리뷰댓글 내용 최종검색
	@PostMapping("/searchReviewReplyList")
	@ResponseBody
	public List<BranchReviewReply> searchReviewReplyList(@RequestBody List<Map<String, Object>> paramList){
		
		log.info("검색 조건 선택:{}" , paramList);
		if(paramList != null) {
			paramList.forEach(searchMap -> {
				String searchKey = (String) searchMap.get("searchKey");
				switch (searchKey) {
					case "reviewReplyContext" -> searchKey = "review_reply_context";
				}
				searchMap.put("searchKey", searchKey);
			});
		}
		log.info("선택 조건 검색:{}" , paramList);
		
		List<BranchReviewReply> searchByReviewReply = branchReviewService.getSearchByReviewReply(paramList);
		
		return searchByReviewReply;
		
	}	
	
}