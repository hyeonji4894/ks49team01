package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import ks49team01.admin.dto.AdminFinalBranchAgreement;

@Mapper
public interface AdminFinalBranchAgreementMapper {

	void addAdminFinalBranchAgreement(AdminFinalBranchAgreement adminFinalBranchAgreement);

	List<AdminFinalBranchAgreement> getAdminFinalBranchAgreementList();
	
}
