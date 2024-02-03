package ks49team01.branch.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchMileage;
import ks49team01.branch.dto.BranchPaymentCriteriaMileage;
import ks49team01.branch.dto.BranchReviewMileageCriteria;



@Mapper
public interface BranchMileageMapper {
	
	// 결제적립금기준 목록조회
	List<BranchPaymentCriteriaMileage> getBranchPaymentCriteriaMileage();
	
	// 결제적립금기준 등록
	int addBranchPaymentCriteriaMileage(BranchPaymentCriteriaMileage branchPaymentCriteriaMileage);
	
	//특정코드로 결제적립금기준 조회
	public BranchPaymentCriteriaMileage getPaymentMileageCriteriaByCode(String roompayMileageRateCode);
	
	// 특정코드로 결제적립금기준 수정
	public int modifyBranchPaymentCriteriaMileage(BranchPaymentCriteriaMileage branchPaymentCriteriaMileage);
	
	
	
	
	// 리뷰적립금기준 목록조회
	List<BranchReviewMileageCriteria> getBranchReviewMileageCriteria();
	
	// 리뷰적립금기준 등록
	int addBranchReviewMileageCriteria(BranchReviewMileageCriteria branchReviewMileageCriteria);
	
	// 특정코드로 리뷰적립금기준 조회
	public BranchReviewMileageCriteria getReviewMileageCriteriaByCode(String mileageCriteriaCode);                       
	
	// 특정코드로 리뷰적립금기준 수정
	public int modifyBranchReviewMileageCriteria(BranchReviewMileageCriteria branchReviewMileageCriteria);



	
	// 적립금지급내역 목록조회
	List<BranchMileage> getMileageList();
	
	// 적립금지급내역 지급받은아이디 검색(모달)
	List<BranchMileage> getSearchMileageId(String memberId);
	
	// 적립금 지급받은 아이디 최종검색
	List<BranchMileage> getSearchMileageList(List<Map<String, Object>> paramList);
}
