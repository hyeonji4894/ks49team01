package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.PaymentCriteriaMileage;
import ks49team01.admin.dto.ReviewMileageCriteria;



@Mapper
public interface AdminMileageMapper {

	List<ReviewMileageCriteria> getReviewMileageCriteria();
	
	List<PaymentCriteriaMileage> getPaymentCriteriaMileage();
}
