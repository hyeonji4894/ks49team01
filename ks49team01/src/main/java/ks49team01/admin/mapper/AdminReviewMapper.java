package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminReview;

@Mapper
public interface AdminReviewMapper {

	List<AdminReview> getReviewList();
}
