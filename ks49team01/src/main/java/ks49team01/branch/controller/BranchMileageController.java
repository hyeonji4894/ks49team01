package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/branch/mileage")
@Slf4j
public class BranchMileageController {
	
	@GetMapping("/sendMileage")
	public String sendMileage(Model model){
		
		log.info("적립금 지급");
		
		model.addAttribute("title", "적립금 지급");
		
	return "/branch/mileage/send_mileage";
	}
	
	@GetMapping("/modifyMileage")
	public String modifyMileage(Model model){
		
		log.info("적립금 수정");
		
		model.addAttribute("title", "적립금 수정");
		
	return "/branch/mileage/modify_mileage";
	}
	
	@GetMapping("/removeMileage")
	public String removeMileage(Model model){
		
		log.info("적립금 삭제");
		
		model.addAttribute("title", "적립금 삭제");
		
	return "/branch/mileage/remove_mileage";
	}
	
	@GetMapping("/getMileage")
	public String getMileage(Model model){
		
		log.info("적립금 조회");
		
		model.addAttribute("title", "적립금 조회");
		
	return "/branch/mileage/get_mileage";
	}
}