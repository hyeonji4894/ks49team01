package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.dto.AdminReviewCategory;
import ks49team01.admin.dto.AdminReviewReply;

@Mapper
public interface AdminReviewMapper {

	
	// 리뷰 카테고리 등록
	int addReviewCategory(AdminReviewCategory adminreviewCategory);
	
	//리뷰 카테고리 조회
	List<AdminReviewCategory> getReviewCategory();

	//리뷰 카테고리 내용 검색
	List<AdminReviewCategory> getReviewCategoryContext(String reviewCategoryContext);
	
	//카테고리 종류 검색
	List<AdminReviewCategory> getSearchCategory(List<Map<String, Object>> paramList);

	//특정코드로 카테고리 종류 수정
	public int modifyReviewCategory(AdminReviewCategory adminReviewCategory);
	
	//특정코드 조회
	public AdminReviewCategory getReviewCategoryByCode(String categoryCode);
	
	
	
	
	
	
	//리뷰 목록 조회
	List<AdminReview> getReviewList();
	
	//리뷰 내용 검색(모달)
	List<AdminReview> getSearchReviewContext(String reviewContext);
	
	//리뷰 내용 최종검색
	List<AdminReview> getSearchByReview(List<Map<String, Object>> paramList);
	
	
	//리뷰댓글 목록 조회
	List<AdminReviewReply> getAdminReviewReply();
	
	// 리뷰댓글 내용 검색(모달)
	List<AdminReviewReply> getSearchReviewReplyContext(String reviewReplyContext);
	
	//리뷰댓글 내용 최종검색
	List<AdminReviewReply> getSearchByReviewReply(List<Map<String, Object>> paramList);
}
