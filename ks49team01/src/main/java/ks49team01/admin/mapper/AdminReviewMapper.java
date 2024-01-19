package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.dto.AdminReviewCategory;

@Mapper
public interface AdminReviewMapper {

	List<AdminReview> getReviewList();
	
	List<AdminReviewCategory> getReviewMoodCategory();
	List<AdminReviewCategory> getReviewFacilityCategory();
}
