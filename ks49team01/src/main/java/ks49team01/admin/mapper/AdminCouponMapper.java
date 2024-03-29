package ks49team01.admin.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminCoupon;

@Mapper
public interface AdminCouponMapper {
	
	// 쿠폰 종류 조회
	List<AdminCoupon> getCouponKind();

	// 쿠폰 종류 등록
	int addCouponKind(AdminCoupon adminCoupon);
	
	// 특정 코드로 쿠폰종류 조회
	public AdminCoupon getCouponKindByCode(String couponCode);
	
	//특정 코드로 쿠폰종류 수정
	public int modifyCouponKind(AdminCoupon adminCoupon);

	// 쿠폰 종류 삭제
	public int removeCouponKind(List<String> paramList);
	
	// 쿠폰종류 이름 검색
	List<AdminCoupon> getSearchCouponName(String couponName);
	
	// 쿠폰종류 가격 검색
	List<AdminCoupon> getSearchCouponPrice(List<Map<String, Object>> paramList);
	
	
	
	// 쿠폰지급내역 목록조회
	List<AdminCoupon> getCouponList();
	
	// 쿠폰지급내역 등록
	int addCouponList(AdminCoupon adminCoupon);
	
	// 특정코드로 쿠폰지급내역 조회
	public AdminCoupon getCouponListByCode(String couponListCode);
	
	// 특정코드로 쿠폰지급내역 수정
	public int modifyCouponList(AdminCoupon adminCoupon);
	
	// 쿠폰지급내역 지급받은아이디 검색(모달)
	List<AdminCoupon> getSearchCouponId(String memberId);
		
	// 쿠폰 지급받은 아이디 최종검색
	List<AdminCoupon> getSearchCouponList(List<Map<String, Object>> paramList);
	}

	
	
	
	