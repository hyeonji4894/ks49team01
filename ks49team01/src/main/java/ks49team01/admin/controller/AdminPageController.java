package ks49team01.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/mypage")
public class AdminPageController {
	private static final Logger log = LoggerFactory.getLogger(AdminPageController.class);
	
	@GetMapping("/mypage")
	public String mypage(Model model) {
		
		model.addAttribute("title", "마이페이지");
		
		log.info("마이페이지");
		
		return "admin/mypage/mypage";
	}
}
