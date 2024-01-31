package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminBranchManagement;

@Mapper
public interface AdminBranchManagementMapper {

	List<AdminBranchManagement> getAdminBranchManagementList();
	
}
