package ks49team01.admin.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminCoupon;

@Mapper
public interface AdminCouponMapper {
	// 쿠폰 이름 검색
	List<AdminCoupon> getSearchCouponName(String couponName);
	
	// 쿠폰 가격 검색
	List<AdminCoupon> getSearchCouponPrice(int couponPrice);
	
	// 쿠폰 종류 조회
	List<AdminCoupon> getCouponKind();

	
}
	
	
	
	