package ks49team01.branch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks49team01.admin.dto.AdminTotalPrice;
import ks49team01.admin.mapper.AdminTotalPriceMapper;
import ks49team01.branch.dto.BranchTotalPrice;
import ks49team01.branch.mapper.BranchTotalPriceMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BranchTotalPriceService {
	
	private final BranchTotalPriceMapper branchTotalPriceMapper;
	
	public List<BranchTotalPrice> BranchTotalPriceList(){

		return branchTotalPriceMapper.BranchTotalPriceList();
	}
}
