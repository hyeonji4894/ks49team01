package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchCoupon;

@Mapper
public interface BranchCouponMapper {

	List<BranchCoupon> getCouponList();
	
	List<BranchCoupon> getSendCouponList();
}
