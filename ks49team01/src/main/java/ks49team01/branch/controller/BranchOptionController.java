package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchOption;
import ks49team01.branch.service.BranchOptionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Controller
@RequestMapping("/branch/option")
public class BranchOptionController {
	
	private final BranchOptionService optionService;
	
	
	@GetMapping("/roomOptionList")
	public String roomOptionList(Model model) {
		
		log.info("객실옵션리스트 조회(가맹점)");
		List<BranchOption> optionList = optionService.getOptionList();
		log.info("optionList: {}", optionList);
		
		model.addAttribute("optionList", optionList);
		return "branch/option/get_room_option";
	}
	

}
