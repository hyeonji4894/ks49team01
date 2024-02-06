package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminSales;
import ks49team01.admin.mapper.AdminSalesMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminSalesService {

	private final AdminSalesMapper adminSalesMapper;
	
	public List<AdminSales> getBranchSalesList(){
		return adminSalesMapper.getBranchSalesList();
		
	}
}
