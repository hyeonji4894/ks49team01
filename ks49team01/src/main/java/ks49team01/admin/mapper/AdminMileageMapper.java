package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminMileage;
import ks49team01.admin.dto.AdminPaymentCriteriaMileage;
import ks49team01.admin.dto.AdminReviewMileageCriteria;



@Mapper
public interface AdminMileageMapper {
	
	// 결제적립금기준 목록조회
	List<AdminPaymentCriteriaMileage> getAdminPaymentCriteriaMileage();
	
	// 결제적립금기준 등록
	int addAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage);
	
	//특정코드로 결제적립금기준 조회
	public AdminPaymentCriteriaMileage getPaymentMileageCriteriaByCode(String roompayMileageRateCode);
	
	// 특정코드로 결제적립금기준 수정
	public int modifyAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage);
	
	
	
	
	// 리뷰적립금기준 목록조회
	List<AdminReviewMileageCriteria> getAdminReviewMileageCriteria();
	
	// 리뷰적립금기준 등록
	int addAdminReviewMileageCriteria(AdminReviewMileageCriteria adminReviewMileageCriteria);
	
	// 특정코드로 리뷰적립금기준 조회
	public AdminReviewMileageCriteria getReviewMileageCriteriaByCode(String mileageCriteriaCode);                       
	
	// 특정코드로 리뷰적립금기준 수정
	public int modifyAdminReviewMileageCriteria(AdminReviewMileageCriteria adminReviewMileageCriteria);



	
	// 적립금지급내역 목록조회
	List<AdminMileage> getMileageList();
	
	// 적립금지급내역 지급받은아이디 검색(모달)
	List<AdminMileage> getSearchMileageId(String memberId);
	
	// 적립금 지급받은 아이디 최종검색
	List<AdminMileage> getSearchMileageList(List<Map<String, Object>> paramList);
}
