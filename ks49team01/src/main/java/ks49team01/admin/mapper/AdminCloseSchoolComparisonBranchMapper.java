package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminCloseSchool;
import ks49team01.admin.dto.AdminCloseSchoolComparisonBranch;

@Mapper
public interface AdminCloseSchoolComparisonBranchMapper {
	
	List<AdminCloseSchoolComparisonBranch> getAdminCloseSchoolComparisonBranch();
}
