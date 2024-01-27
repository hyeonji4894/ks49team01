package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchCloseSchoolComparisonBranch;

@Mapper
public interface BranchCloseSchoolComparisonBranchMapper {

	List<BranchCloseSchoolComparisonBranch> getCloseSchoolComparisonBranch();
}
