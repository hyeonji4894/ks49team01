package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.User;

@Mapper
public interface UserMapper {
	
	// 조건별 상품목록 조회
		List<User> getSearchForUserList(Map<String, Object> paramMap);
	
	List<User> getuserList();
	

}
