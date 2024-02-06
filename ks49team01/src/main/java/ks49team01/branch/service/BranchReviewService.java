package ks49team01.branch.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchReview;
import ks49team01.branch.dto.BranchReviewCategory;
import ks49team01.branch.dto.BranchReviewReply;
import ks49team01.branch.mapper.BranchReviewMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class BranchReviewService {

	private final BranchReviewMapper branchReviewMapper;
	
	
	// 리뷰 카테고리 등록
	public void addReviewCategory(BranchReviewCategory branchReviewCategory) {
		
		log.info("리뷰카테고리 insert 전 branchReviewCategory: {}", branchReviewCategory);
		branchReviewMapper.addReviewCategory(branchReviewCategory);
		log.info("리뷰카테고리 insert 후 branchReviewCategory: {}", branchReviewCategory);
	}

	// 리뷰 카테고리 조회
	public List<BranchReviewCategory> getReviewCategory(){
		
		return branchReviewMapper.getReviewCategory();
	}
	
	// 특정코드로 리뷰카테고리 조회
	public BranchReviewCategory getReviewCategoryByCode(String categoryCode) {
		
		BranchReviewCategory branchReviewCategory = branchReviewMapper.getReviewCategoryByCode(categoryCode);
		
		return branchReviewCategory;
	}	
	
	// 특정코드로 리뷰카테고리 수정
	public void modifyReviewCategory(BranchReviewCategory branchReviewCategory) {
		int result = branchReviewMapper.modifyReviewCategory(branchReviewCategory);
		if(result > 0) log.info("리뷰카테고리 수정 완료");
	}
	
	// 리뷰 카테고리 내용 검색
	public List<BranchReviewCategory> getSearchCategoryContext(String reviewCategoryContext){
		
		return branchReviewMapper.getReviewCategoryContext(reviewCategoryContext);
	}
	
	// 리뷰 카테고리 조건 검색
	public List<BranchReviewCategory> getSearchCategory(List<Map<String, Object>> paramList){
		
		return branchReviewMapper.getSearchCategory(paramList);
	}
	
	
	
	
	
	// 리뷰 목록 조회	
	public List<BranchReview> getReviewList(){
		
		return branchReviewMapper.getReviewList();
	}
	
	// 리뷰 내용 검색(모달)
	public List<BranchReview> getSearchReviewContext(String reviewContext){
		
		return branchReviewMapper.getSearchReviewContext(reviewContext);
	}
	

	// 조건에 따른 리뷰검색(최종)
	public List<BranchReview> getSearchByReview(List<Map<String, Object>> paramList){
		
		return branchReviewMapper.getSearchByReview(paramList);
	}
	
	
	
	
	
	// 리뷰 댓글 조회
	public List<BranchReviewReply> getBranchReviewReply(){
		
		return branchReviewMapper.getBranchReviewReply();
	}
	
	// 리뷰댓글 내용 검색(모달)
	public List<BranchReviewReply> getSearchReviewReplyContext(String reviewReplyContext){
		
		return branchReviewMapper.getSearchReviewReplyContext(reviewReplyContext);
	}
	
	// 조건에 따른 리뷰 검색(최종)
	public List<BranchReviewReply> getSearchByReviewReply(List<Map<String, Object>> paramList){
		
		return branchReviewMapper.getSearchByReviewReply(paramList);
	}
	
}
