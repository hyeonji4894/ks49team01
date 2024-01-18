package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminUser;

@Mapper
public interface AdminUserMapper {
	
	// 조건별 상품목록 조회
		List<AdminUser> getSearchForUserList(Map<String, Object> paramMap);
	
	List<AdminUser> getuserList();
	

}
