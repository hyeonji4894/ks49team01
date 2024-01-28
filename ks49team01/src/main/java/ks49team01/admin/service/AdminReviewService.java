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
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminReviewService {

	private final AdminReviewMapper adminReviewMapper;
	
	
	// 리뷰 카테고리 등록
	public void addReviewCategory(AdminReviewCategory adminReviewCategory) {
		log.info("리뷰카테고리 insert 전 adminReviewCategory: {}", adminReviewCategory);
		adminReviewMapper.addReviewCategory(adminReviewCategory);
		log.info("리뷰카테고리 insert 후 adminReviewCategory: {}", adminReviewCategory);
		
	}

	// 리뷰 카테고리 조회
	public List<AdminReviewCategory> getReviewCategory(){
		
		return adminReviewMapper.getReviewCategory();
	}
	

	// 리뷰 카테고리 내용 검색
	public List<AdminReviewCategory> getSearchCategoryContext(String reviewCategoryContext){
		
		return adminReviewMapper.getReviewCategoryContext(reviewCategoryContext);
	}
	
	// 리뷰 카테고리 조건 검색
	public List<AdminReviewCategory> getSearchCategory(List<Map<String, Object>> paramList){
		
		return adminReviewMapper.getSearchCategory(paramList);
	}
	
	// 특정코드로 리뷰카테고리 조회
	public AdminReviewCategory getReviewCategoryByCode(String categoryCode) {
		
		AdminReviewCategory adminReviewCategory = adminReviewMapper.getReviewCategoryByCode(categoryCode);
		
		return adminReviewCategory;
	}	
	
	// 특정코드로 리뷰카테고리 수정
	public void modifyReviewCategory(AdminReviewCategory adminReviewCategory) {
		int result = adminReviewMapper.modifyReviewCategory(adminReviewCategory);
		if(result > 0) log.info("리뷰카테고리 수정 완료");
	}
	
	
	
	
	
	
	// 리뷰 내용 검색
	public List<AdminReview> getReviewContext(String reviewContext){
		
		return adminReviewMapper.getReviewContext(reviewContext);
	}
	
	// 리뷰 목록 조회	
	public List<AdminReview> getReviewList(){
		
		return adminReviewMapper.getReviewList();
	}

	
	
	
	
	
	
	// 리뷰 댓글 조회
	public List<AdminReviewReply> getAdminReviewReply(){
		
		return adminReviewMapper.getAdminReviewReply();
	}
}
