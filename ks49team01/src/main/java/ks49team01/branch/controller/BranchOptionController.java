package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchRoomOption;
import ks49team01.branch.service.BranchOptionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/branch/option")
public class BranchOptionController {
	
	private final BranchOptionService optionService;
	
	// 객실옵션
	
	@GetMapping("/roomOptionList")
	public String roomOptionList(Model model) {
	
		log.info("객실옵션조회");
		List<BranchRoomOption> roomOptionList = optionService.getOptionList();
		log.info("roomOptionList: {}", roomOptionList);
		
		model.addAttribute("pageTitle", "객실옵션리스트 조회");
		model.addAttribute("roomOptionList", roomOptionList);
		
		return "branch/option/get_room_option";
	}

}
