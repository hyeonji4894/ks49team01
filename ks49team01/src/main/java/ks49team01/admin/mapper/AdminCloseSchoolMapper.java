package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminCloseSchool;

@Mapper
public interface AdminCloseSchoolMapper {
	
	// 폐교 이름 검색
	List<AdminCloseSchool> getCloseSchoolSearch(String searchValue);
	
	int addCloseSchool(AdminCloseSchool closeSchoolList);
	
	List<AdminCloseSchool> getCloseSchool();

	List<AdminCloseSchool> getCloseSchoolSearchTotal(List<Map<String, Object>> paramList);
}
