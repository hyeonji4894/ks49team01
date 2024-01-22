package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCloseSchool;
import ks49team01.admin.mapper.AdminCloseSchoolMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class AdminCloseSchoolService {

	private AdminCloseSchoolMapper adminCloseSchoolMapper;
	
	public void addCloseSchool(AdminCloseSchool adminCloseSchool) {
		log.info("폐교 목록 전 adminCloseSchool : {}", adminCloseSchool);
		adminCloseSchoolMapper.addCloseSchool(adminCloseSchool);
	}
	/**
	 * 폐교 목록 조회
	 * */
	public List<AdminCloseSchool> getCloseSchool() {
		return adminCloseSchoolMapper.getCloseSchool();
	}
	
	
	
}
