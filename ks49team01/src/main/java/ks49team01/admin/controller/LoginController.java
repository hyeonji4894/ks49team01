package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/login")
@AllArgsConstructor
@Slf4j
public class LoginController {
	

	@GetMapping("/login")
	public String getLoginList(Model model) {
		
		log.info("로그인관리");
		model.addAttribute("title", "로그인관리");
		
		return "admin/login/Login";
	}
}

