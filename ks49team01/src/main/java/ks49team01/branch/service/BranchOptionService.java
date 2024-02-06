package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchOption;
import ks49team01.branch.mapper.BranchOptionMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BranchOptionService {
	
	private BranchOptionMapper brachOptionMapper;
	
	public List<BranchOption> getOptionList(){
		return brachOptionMapper.getOptionList();
	}
	

}
