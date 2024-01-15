package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/admin/member")
@Controller
@Slf4j
public class UserController {
	
	
	@GetMapping("/get_member")
	public String getMemberList(Model model) {
		
		model.addAttribute("title", "회원목록조회");
		
		log.info("회원목록조회");
		
		return "admin/member/get_member";
	}
}

