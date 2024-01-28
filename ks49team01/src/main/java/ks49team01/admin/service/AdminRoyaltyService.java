package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminRoyalty;
import ks49team01.admin.mapper.AdminRoyaltyMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminRoyaltyService {
	private final AdminRoyaltyMapper adminRoyaltyMapper;
	public List<AdminRoyalty> getRoyaltyList(){
		return adminRoyaltyMapper.getRoyaltyList();
		
	}


}
