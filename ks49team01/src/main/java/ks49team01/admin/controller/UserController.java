package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.User;
import ks49team01.admin.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/member")
@AllArgsConstructor
@Slf4j
public class UserController {
	
	private UserService userService;
	
	
	@GetMapping("/get_member")
	public String getMemberList(Model model) {
		List<User> userList = userService.getuserList();
		
		log.info("userList: {}", userList);
		model.addAttribute("title", "회원목록조회");
		model.addAttribute("userList", userList);
		
		return "admin/member/get_member";
	}
}

