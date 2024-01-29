package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminMileage;
import ks49team01.admin.dto.AdminPaymentCriteriaMileage;
import ks49team01.admin.dto.AdminReviewMileageCriteria;



@Mapper
public interface AdminMileageMapper {
	
	// 리뷰적립금 기준 등록
	int addAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage);
	
	// 특정코드로 리뷰적립금 기준 수정
	public int modifyAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage);
	
	//특정코드 조회
	public AdminPaymentCriteriaMileage getPaymentMileageCriteriaByCode(String roompayMileageRateCode);
	
	// 리뷰적립금 기준 조회
	List<AdminReviewMileageCriteria> getAdminReviewMileageCriteria();
	
	// 결제적립금 기준 조회
	List<AdminPaymentCriteriaMileage> getAdminPaymentCriteriaMileage();
	
	// 적립금지급내역 목록조회
	List<AdminMileage> getMileageList();
	
	// 적립금지급내역 지급받은아이디 검색
	List<AdminMileage> getSearchMileageId(String memberId);
}
