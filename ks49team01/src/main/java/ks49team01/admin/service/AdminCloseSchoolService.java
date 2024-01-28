package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCloseSchool;

import ks49team01.admin.mapper.AdminCloseSchoolMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class AdminCloseSchoolService {

	private final AdminCloseSchoolMapper adminCloseSchoolMapper;
	
	public void addCloseSchool(AdminCloseSchool adminCloseSchool) {
		log.info("폐교 등록 전 adminCloseSchool : {}", adminCloseSchool);
		adminCloseSchoolMapper.addCloseSchool(adminCloseSchool);
		log.info("폐교 등록 후adminCloseSchool :{}", adminCloseSchool);
	}
	
	public List<AdminCloseSchool> getCloseSchool(List<Map<String, Object>> paramList){
		return adminCloseSchoolMapper.getCloseSchool(paramList);
	}
	
// 특정 명으로 폐교 조회
	public AdminCloseSchool getCloseSchoolInfoByName(String closeSchoolName) {
		
		AdminCloseSchool closeSchoolInfo = adminCloseSchoolMapper.getCloseSchoolInfoByName(closeSchoolName);
		return closeSchoolInfo;
	}
	
	// 특정명으로 폐교 수정
	public void modifyCloseSchoolInfo(AdminCloseSchool adminCloseSchool) {
		int result = adminCloseSchoolMapper.modifyCloseSchoolInfo(adminCloseSchool);
		if(result > 0) log.info("폐교 수정 완료");
	}
	
	public List<AdminCloseSchool> getCloseSchool() {
		return adminCloseSchoolMapper.getCloseSchool();
	}
	
}
