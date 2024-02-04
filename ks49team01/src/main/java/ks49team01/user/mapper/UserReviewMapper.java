package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserReview;

@Mapper
public interface UserReviewMapper {

	// 리뷰등록
	public int addReview(UserReview userReview);
	
	// 리뷰 목록조회
	List<UserReview> getUserReviewList();
	
	// 리뷰 자세히보기
	public UserReview getReviewDetail(String reviewNum);
	
	// reviewNum에 따른 자세한리뷰조회
	public UserReview getReviewByNum(String reviewNum);
	
	// 리뷰수정
	public int modifyReview(UserReview userReview);
	
	// 리뷰삭제
	public int removeReview(String reviewNum);
}
