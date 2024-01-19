package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminOption;
import ks49team01.admin.mapper.AdminOptionMapper;
import ks49team01.admin.mapper.AdminSurchargeMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminOptionService {
	
	private AdminOptionMapper adminOptionMapper;
	
	/**
	 * 객실옵션 목록
	 * @return List<AdminOption>
	 */
	public List<AdminOption> getOptionList(){
		
		return adminOptionMapper.getOptionList();
	}

}
