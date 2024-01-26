package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminTotalPrice;
import ks49team01.branch.dto.BranchTotalPrice;

@Mapper
public interface BranchTotalPriceMapper {
	
	List<BranchTotalPrice> BranchTotalPriceList();
}
