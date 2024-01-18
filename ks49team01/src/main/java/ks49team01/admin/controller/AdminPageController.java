package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/mypage")
@Slf4j
public class AdminPageController {
	
	@GetMapping("/mypage")
	public String mypage(Model model) {
		
		model.addAttribute("title", "마이페이지");
		
		log.info("마이페이지");
		
		return "admin/mypage/mypage";
	}
}
