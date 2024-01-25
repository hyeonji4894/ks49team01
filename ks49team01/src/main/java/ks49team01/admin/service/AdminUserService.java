package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminUser;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.mapper.AdminUserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminUserService {
	
	private final AdminUserMapper userMapper;
	
	
	

	/**
	 * 회원 수정
	 * @param adminUser
	 * @return
	 */
	public int modifyMember(AdminUser adminUser) {
		return userMapper.modifyMember(adminUser);
	}
	
	
	/**
	 * 특정회원 조회
	 * @param memberId
	 * @return
	 */
	public AdminUser getMemberInfoById(String memberId) {
		return userMapper.getMemberInfoById(memberId);
	}
	
	/**
	 * 회원 중복아이디 체크
	 * @param memberId
	 * @return
	 */
	public boolean checkId(String memberId) {
		// TODO Auto-generated method stub
		return userMapper.checkId(memberId);
	}
	
	/**
	 * 레벨별 조회
	 */
	public List<AdminUserLevel> memberLevelList() {
		// TODO Auto-generated method stub
		return userMapper.memberLevelList();
	}
	
	/**
	 * 특정 회원목록 조회
	 * @param searchMap
	 * @return
	 */
	public List<AdminUser> getSearchForUserList(Map<String, Object> searchMap) {
		return userMapper.getSearchForUserList(searchMap);
	}
	

	/**
	 *  회원 목록 조회
	 * @return
	 */
	public List<AdminUser> getuserList(){
		return userMapper.getuserList();
		
	}
	/**
	 * 맴버 등록 처리
	 * @param adminUser
	 */
	public int addMember(AdminUser adminUser) {
		log.info("insert 전 adminUser: {}", adminUser);
		log.info("insert 후 adminUser: {}", adminUser);
		return userMapper.addMember(adminUser);
	}
	



	


}
