package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminSurcharge;
import ks49team01.admin.service.AdminSurchargeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/surcharge")
@AllArgsConstructor
public class AdminSurchargeController {
	
	
	private final AdminSurchargeService surchargeService;
	
	// 시즌 추가금 리스트
	
		@GetMapping("/removeSurchargeList")
		public String removeSurchargeList(Model model) {
			
			log.info("시즌추가금리스트삭제");
			
			model.addAttribute("pageTitle", "시즌추가금삭제");
			
			return "admin/season_surcharge/remove_season_surcharge_list";
		}
		

		
		@GetMapping("/modifySurchargeList")
		public String modifySurchargeList(Model model) {
			
			log.info("시즌추가금리스트수정");
			
			model.addAttribute("pageTitle", "시즌추가금리스트수정");
			
			return "admin/season_surcharge/modify_season_surcharge_list";
			
		}
		
		@GetMapping("/addSurchargeList")
		public String addSeurcargeList(Model model) {
			
			log.info("시즌추가금리스트등록");
			
			model.addAttribute("service", "시즌추가금등록");
			model.addAttribute("pageTitle", "시즌추가금등록");
			
			return "admin/season_surcharge/add_season_surcharge_list";
			// 나중에 추가금 리스트에 등록하면 목록으로 페이지 전환할수있게 redirect사용
		}
		
		@GetMapping("/surchargeList")
		public String getSurchargeList(Model model) {
			
		
			
			List<AdminSurcharge> adminSurchargeList = surchargeService.getAdminSurchargeList();
			log.info("adminSurchargeList: {}", adminSurchargeList);
			
			model.addAttribute("service", "시즌추가금");
			model.addAttribute("serviceUri", "/admin/room");
			model.addAttribute("pageTitle", "시즌추가금 목록 조회");
			model.addAttribute("adminSurchargeList", adminSurchargeList);
			
			
			return "admin/season_surcharge/get_season_surcharge_list";
		}

}
