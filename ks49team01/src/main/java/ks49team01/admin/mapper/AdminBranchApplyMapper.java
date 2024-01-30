package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminBranchApply;

@Mapper
public interface AdminBranchApplyMapper {
	
	List<AdminBranchApply> getAdminBranchApplyList();
}
