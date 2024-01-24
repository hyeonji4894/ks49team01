package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminOption;
import ks49team01.admin.mapper.AdminOptionMapper;
import lombok.AllArgsConstructor;

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

}
