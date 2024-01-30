package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminOption;
import ks49team01.admin.mapper.AdminOptionMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@AllArgsConstructor
public class AdminOptionService {
	
	private final AdminOptionMapper adminOptionMapper;
	
	/**
	 * 객실옵션 목록
	 * @return List<AdminOption>
	 */
	public List<AdminOption> getOptionList(){
		
		return adminOptionMapper.getOptionList();
	}
	
	// 옵션 검색
	public List<AdminOption> getSearchOption(List<Map<String, Object>> paramList){
		return adminOptionMapper.getSearchOption(paramList);
	}
	
	// 옵션등록
	public void addOption(AdminOption adminOption) {
		log.info("옵션 insert 전 adminOPtion: {}", adminOption);
		adminOptionMapper.addOption(adminOption);
		log.info("옵션 insert 후 adminOPtion: {}", adminOption);
	}
	
	//옵션번호로 옵션 조회
	public AdminOption getNumberByOption(String roomOptionNumber) {
		
		AdminOption optionList = adminOptionMapper.getNumberByOption(roomOptionNumber);
		return optionList;
	}
	
	// 옵션번호로 객실 수정
	public void modifyRoomOption(AdminOption adminOption) {
		int result = adminOptionMapper.modifyRoomOption(adminOption);
		if(result > 0) log.info("옵션 수정 완료");
	}

}
