package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchRoomOption;

@Mapper
public interface BranchOptionMapper {
	
	// 옵션목록 조회
	List<BranchRoomOption> getOptionList();

}
