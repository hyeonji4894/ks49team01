package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminUser;
import ks49team01.admin.mapper.AdminUserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserService {
	
	private final AdminUserMapper userMapper;

	/**
	 * 조건별 맴버 조회
	 * @return
	 */
	public List<AdminUser> getuserList(){
		return userMapper.getuserList();
		
	}
	/**
	 * 맴버 등록 처리
	 * @param adminUser
	 */
	public void addMember(AdminUser adminUser) {
		log.info("insert 전 adminUser: {}", adminUser);
		userMapper.addMember(adminUser);
		log.info("insert 후 adminUser: {}", adminUser);
	}
	
	/**
	 * 상품목록 조회
	 * @param searchMap
	 * @return
	 */
	public List<AdminUser> getSearchForUserList(Map<String, Object> searchMap) {
		// TODO Auto-generated method stub
		return userMapper.getSearchForUserList(searchMap);
	}


}
