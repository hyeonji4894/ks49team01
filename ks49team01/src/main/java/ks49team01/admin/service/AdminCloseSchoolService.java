package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCloseSchool;
import ks49team01.admin.dto.AdminRoom;
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
	/**
	 * 폐교 목록 조회
	 * */
	public List<AdminCloseSchool> getCloseSchool() {
		return adminCloseSchoolMapper.getCloseSchool();
	}
	
}
