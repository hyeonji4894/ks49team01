package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminUser;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.service.AdminUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user/member")
@AllArgsConstructor
@Slf4j
public class UseController {
	private final AdminUserService userService;

	
	@PostMapping("/addMember")
	public String addMember(AdminUser adminUser) {
		log.info("맴버등록: {}", adminUser);
		
		//2개의 주소 필드에 저장되어 있는 값을 가져와서
		//하나의 주소 필드에 셋팅한다.
		//adminUser.se
		userService.addMember(adminUser);
		
		return "redirect:/user/member/login";
	}
	
	@GetMapping("/addMember")
	public String addMember(Model model) {
		
		List<AdminUserLevel> addMember = userService.memberLevelList();
		
		model.addAttribute("addMember", addMember);
		model.addAttribute("title", "회원등록");

		return "user/member/add_member";
	}

	
	@GetMapping("/getMember")
	public String getMemberList(Model model) {
		
		model.addAttribute("title", "회원목록");
		
		return "user/member/get_member";
	}
	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("title", "로그인");
		
		return "user/member/login";
	}
}
