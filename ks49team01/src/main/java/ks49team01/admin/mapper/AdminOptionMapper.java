package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminOption;

@Mapper
public interface AdminOptionMapper {
	
	// 옵션 리스트 조회
	List<AdminOption> getOptionList();
}
