package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.dto.AdminReviewCategory;
import ks49team01.admin.dto.AdminReviewReply;
import ks49team01.admin.mapper.AdminReviewMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminReviewService {

	private final AdminReviewMapper adminReviewMapper;
	
	/**
	 * 리뷰 목록 조회
	 */
	
	public List<AdminReview> getReviewList(){
		
		return adminReviewMapper.getReviewList();
	}
	
	/**
	 * 리뷰 카테고리 조회
	 */
	public List<AdminReviewCategory> getReviewCategory(){
		
		return adminReviewMapper.getReviewCategory();
	}
	

	
	/**
	 * 리뷰 댓글 조회
	 */
	public List<AdminReviewReply> getAdminReviewReply(){
		
		return adminReviewMapper.getAdminReviewReply();
	}
	
	/**
	 * 리뷰 카테고리 내용 검색
	 */
	public List<AdminReviewCategory> getSearchCategoryContext(String reviewCategoryContext){
		
		return adminReviewMapper.getReviewCategoryContext(reviewCategoryContext);
	}
	
	/**
	 * 리뷰 카테고리 조건 검색 
	 */
	public List<AdminReviewCategory> getSearchCategory(List<Map<String, Object>> paramList){
		
		return adminReviewMapper.getSearchCategory(paramList);
	}
	
	
	/**
	 * 리뷰 내용 검색
	 * @param reviewContext
	 * @return
	 */
	public List<AdminReview> getSearchReviewContext(String reviewContext){
		
		return adminReviewMapper.getReviewContext(reviewContext);
	}
	

}
