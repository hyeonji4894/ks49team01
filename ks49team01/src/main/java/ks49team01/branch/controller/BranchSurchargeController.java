package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/branch/surcharge")
public class BranchSurchargeController {
	
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
			
			log.info("시즌추가금리스트");
			
			model.addAttribute("pageTitle", "시즌추가금리스트");
			
			return "branch/season_surcharge/get_season_surcharge_list";
		}

}