package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminLogin;
import ks49team01.admin.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/login")
@AllArgsConstructor
@Slf4j
public class AdminLoginController {
	
	private LoginService loginService;
	
	
	@GetMapping("/login")
	public String getLoginList(Model model) {
		
		List<AdminLogin> loginList = loginService.getLoginList();
		
		log.info("loginList {}", loginList);
		model.addAttribute("title", "로그인관리");
		model.addAttribute("loginList", loginList);
		
		
		return "admin/login/Login";
	}
}

