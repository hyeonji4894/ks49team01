package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.dto.AdminReviewCategory;
import ks49team01.admin.dto.AdminReviewReply;

@Mapper
public interface AdminReviewMapper {
	//리뷰 목록 검색
	List<AdminReview> getReviewList();
	
	//리뷰 내용 검색
	List<AdminReview> getReviewContext(String reviewContext);
	
	//리뷰 카테고리 조회
	List<AdminReviewCategory> getReviewCategory();
	
	//리뷰 댓글 조회
	List<AdminReviewReply> getAdminReviewReply();

	//리뷰 카테고리 내용 검색
	List<AdminReviewCategory> getReviewCategoryContext(String reviewCategoryContext);
	
	
	//카테고리 종류 검색
	List<AdminReviewCategory> getSearchCategory(List<Map<String, Object>> paramList);
}
