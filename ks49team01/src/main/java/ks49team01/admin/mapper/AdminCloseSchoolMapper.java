package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminCloseSchool;

@Mapper
public interface AdminCloseSchoolMapper {
	
	int addCloseSchool(AdminCloseSchool closeSchoolList);
	
	List<AdminCloseSchool> getCloseSchool();
}
