package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import ks49team01.admin.dto.AdminUser;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.user.dto.RoompayMileageRate;

@Mapper
public interface AdminUserMapper {
	
    AdminUser findByUsernameAndPassword(@Param("memberId") String memberId, @Param("memberPw") String memberPw);
    	
    
		public int removeMemberById(String memberId);

    
    	// 회원 적립등급 조회
    	public List<RoompayMileageRate>memberMileageList();
		// 특정회원 조회
		public AdminUser getMemberInfoById(String memberId);
	
		// 회원 수정
		public int modifyMember(AdminUser adminUser);
		
		 //회원 중복아이디 체크
		 public boolean checkId(String memberId);
		 
		//회원 레벨 조회
		 public List<AdminUserLevel>memberLevelList ();
		
		// 조건별 맴버 조회
		 public List<AdminUser> getSearchForUserList(Map<String, Object> paramMap);
		
		// 회원등록
		public int addMember(AdminUser adminUser);
		
			//맴버 조회
		public List<AdminUser> getuserList();
			

}
