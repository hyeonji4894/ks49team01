package ks49team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user/mileage")
@Slf4j
public class UserMileageController {

	@GetMapping("/getMileage")
	public String getMileage(Model model){
		
		log.info("적립금 조회");
		
		model.addAttribute("title", "적립금 조회");
		
	return "/user/mileage/get_mileage";
	}
	
	@GetMapping("/useMileage")
	public String useMileage(Model model){
		
		log.info("적립금 사용");
		
		model.addAttribute("title", "적립금 사용");
		
	return "/user/mileage/use_mileage";
	}
}
