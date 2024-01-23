package ks49team01.admin.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminCoupon;

@Mapper
public interface AdminCouponMapper {
	// 쿠폰 검색
	List<AdminCoupon> getSearchForCouponList(Map<String, Object> paramMap);
	

	// 쿠폰 종류 조회
	List<AdminCoupon> getCouponKind();

}
	
	
	
	