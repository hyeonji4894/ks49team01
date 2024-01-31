package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserReview;

@Mapper
public interface UserReviewMapper {

	// 리뷰 목록조회
	List<UserReview> getSearchReviewList();
}
