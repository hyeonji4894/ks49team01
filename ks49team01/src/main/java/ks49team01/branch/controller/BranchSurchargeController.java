package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchSurcharge;
import ks49team01.branch.service.branchSurchargeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/branch/surcharge")
@AllArgsConstructor
public class BranchSurchargeController {
	
	private final branchSurchargeService surchargeService;
	
	// 시즌 추가금 리스트
	
		@GetMapping("/modifySurchargeList")
		public String modifySurchargeList(Model model) {
			
			log.info("시즌추가금리스트수정");
			
			model.addAttribute("pageTitle", "시즌추가금리스트수정");
			
			return "branch/season_surcharge/modify_season_surcharge_list";
		}
		
		@GetMapping("/addSurchargeList")
		public String addSurchargeList(Model model) {
			
			log.info("시즌추가금리스트등록");
			
			model.addAttribute("pageTitle", "시즌추가금리스트등록");
			
			return "branch/season_surcharge/add_season_surcharge_list";
		}
		
		@GetMapping("/surchargeList")
		public String surchargeList(Model model) {
			
			List<BranchSurcharge> surchargeList = surchargeService.getSurchargeList();
			
			log.info("시즌추가금리스트");
			
			model.addAttribute("pageTitle", "시즌추가금리스트");
			model.addAttribute("surchargeList", surchargeList);
			
			return "branch/season_surcharge/get_season_surcharge_list";
		}

}
