package ks49team01.branch.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchReview;
import ks49team01.branch.dto.BranchReviewCategory;
import ks49team01.branch.dto.BranchReviewReply;

@Mapper
public interface BranchReviewMapper {

	
	// 리뷰 카테고리 등록
	int addReviewCategory(BranchReviewCategory branchreviewCategory);
	
	//리뷰 카테고리 조회
	List<BranchReviewCategory> getReviewCategory();

	//리뷰 카테고리 내용 검색
	List<BranchReviewCategory> getReviewCategoryContext(String reviewCategoryContext);
	
	//카테고리 종류 검색
	List<BranchReviewCategory> getSearchCategory(List<Map<String, Object>> paramList);

	//특정코드로 카테고리 종류 수정
	public int modifyReviewCategory(BranchReviewCategory branchReviewCategory);
	
	//특정코드 조회
	public BranchReviewCategory getReviewCategoryByCode(String categoryCode);
	
	
	
	
	
	
	//리뷰 목록 조회
	List<BranchReview> getReviewList();
	
	//리뷰 내용 검색(모달)
	List<BranchReview> getSearchReviewContext(String reviewContext);
	
	//리뷰 내용 최종검색
	List<BranchReview> getSearchByReview(List<Map<String, Object>> paramList);
	
	
	//리뷰댓글 목록 조회
	List<BranchReviewReply> getBranchReviewReply();
	
	// 리뷰댓글 내용 검색(모달)
	List<BranchReviewReply> getSearchReviewReplyContext(String reviewReplyContext);
	
	//리뷰댓글 내용 최종검색
	List<BranchReviewReply> getSearchByReviewReply(List<Map<String, Object>> paramList);
}
