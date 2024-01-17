package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@PostMapping("/searchForUserList")
	@ResponseBody
	public List<User> searchForUserList(@RequestBody Map<String, Object> searchMap) {
		
		log.info("searchMap: {}", searchMap);
		
		String searchKey = (String) searchMap.get("searchKey");
		if(searchKey != null) {
			switch (searchKey) {
				case "memberId" -> searchKey = "m.member_id";
				case "memberName" -> searchKey = "m.member_name";
				case "memberBirth" -> searchKey = "m.member_birth";
				case "memberEmail" -> searchKey = "m.member_email";
			}
			searchMap.put("searchKey", searchKey);
		}
		
		List<User> searchList = userService.getSearchForUserList(searchMap);
		
		return searchList;
	}
	
	
	@GetMapping("/get_member")
	public String getMemberList(Model model) {
		List<User> userList = userService.getuserList();
		
		log.info("userList: {}", userList);
		model.addAttribute("title", "회원목록조회");
		model.addAttribute("userList", userList);
		
		return "admin/member/get_member";
	}
}

