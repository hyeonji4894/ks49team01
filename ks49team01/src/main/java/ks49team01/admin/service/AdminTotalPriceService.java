package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks49team01.admin.dto.AdminTotalPrice;
import ks49team01.admin.mapper.AdminTotalPriceMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminTotalPriceService {
	
	private final AdminTotalPriceMapper adminTotalPriceMapper;
	
	public List<AdminTotalPrice> AdminTotalPriceList(){

		return adminTotalPriceMapper.AdminTotalPriceList();
	}
}
