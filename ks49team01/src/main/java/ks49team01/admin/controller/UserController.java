package ks49team01.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.User;
import ks49team01.admin.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("admin/member")
@AllArgsConstructor
@Slf4j
public class UserController {
	
	private UserService userService;
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/get_member")
	public String getMemberList(Model model) {
		List<User> userLsit = userService.getuserLsit();
		
		log.info("회원목록조회");
		model.addAttribute("title", "회원목록조회");
		model.addAttribute("userLsit", userLsit);
		
		return "admin/member/get_member";
	}
}

