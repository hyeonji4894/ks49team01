package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminUser;

@Mapper
public interface AdminUserMapper {
	
	//회원별 맴버 조회
	
	
	// 조건별 맴버 조회
		List<AdminUser> getSearchForUserList(Map<String, Object> paramMap);
	
		
		int addMember(AdminUser adminUser);
		
		//맴버 조회
	List<AdminUser> getuserList();
	

}
