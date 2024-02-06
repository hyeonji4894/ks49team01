package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	// 추가금리스트 검색
	@PostMapping("/searchSurchargeList")
	@ResponseBody
	public List<AdminSurcharge> searchSurchargeList(@RequestBody Map<String, Object> paramMap){
		
		log.info("paramMap:{}", paramMap);
		String searchKey = (String) paramMap.get("searchKey");
		
		if(searchKey != null) {
			switch (searchKey) {
				case "lowseasonPeakseason" -> searchKey = "bs.lowseason_peakseason"; 
				case "dayOfTheWeek" -> searchKey =  "bs.day_of_the_week";
				case "additionalAmount" -> searchKey = "bs.additional_amount";
				case "registerDate" -> searchKey = "bs.register_date";
				case "surchargeRegistrantId" -> searchKey = "bs.surcharge_registrant_id";
			}
			paramMap.put("searchKey", searchKey);
		}
		//List<AdminSurcharge> searchSurchargeList = surchargeService.getSearchForSurchargeList(paramMap);
		return null;
	}
	
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
			
			List<AdminSurcharge> surchargeList = surchargeService.getSurchargeList();
			log.info("surchargeList: {}", surchargeList);
			
			model.addAttribute("service", "시즌추가금등록");
			model.addAttribute("pageTitle", "시즌추가금등록");
			model.addAttribute("surchargeList", surchargeList);
			
			return "admin/season_surcharge/add_season_surcharge_list";
			// 나중에 추가금 리스트에 등록하면 목록으로 페이지 전환할수있게 redirect사용
		}
		
		@GetMapping("/surchargeList")
		public String getSurchargeList(Model model) {
			
		
			List<AdminSurcharge> branchBySurchargeList = surchargeService.getBranchBySurchargeList();
			log.info("branchBySurchargeList: {}", branchBySurchargeList);
			
			model.addAttribute("service", "시즌추가금");
			model.addAttribute("serviceUri", "/admin/surcharge");
			model.addAttribute("pageTitle", "시즌추가금 목록 조회");
			model.addAttribute("branchBySurchargeList", branchBySurchargeList);
			
			
			return "admin/season_surcharge/get_season_surcharge_list";
		}

}
