package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks49team01.admin.dto.AdminUser;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.service.AdminUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/member")
@AllArgsConstructor
@Slf4j
public class AdminUserController {
	
	private final AdminUserService userService;
	
	
	/*
	 * @PostMapping("/checkId") public ResponseEntity<Boolean> checkId(@RequestParam
	 * String memberId) { boolean isDuplicate = userService.checkId(memberId);
	 * return ResponseEntity.ok(isDuplicate); }
	 */
	
	

	    @PostMapping("/checkId")
	    @ResponseBody
	    public ResponseEntity <Boolean> checkId(@RequestParam String memberId) {
	        boolean isDuplicate = userService.checkId(memberId);
	        return ResponseEntity.ok(isDuplicate);
	    }

	

	
	
	@GetMapping("/memberLevelList")
	public String memberLevelList(Model model) {
		log.info("맴버레벨조회");
		return "admin/member/member_level_list";
	}
	
	@GetMapping("/removeMember")
	public String removeMember(Model model) {
		
		return "admin/member/remove_member";
	}
	
	
	
	
	@PostMapping("/modifyMember")
	public String modifyMember(AdminUser adminUser) {
		
		log.info("회원수정" );
		userService.modifyMember(adminUser);
		return "redirect:/admin/member/getMember";
	}
	
	
	@GetMapping("/modifyMember")
	public String modifyMember(@RequestParam(value="memberId") String memberId
			  ,Model model) {
		
		log.info("회원수정" );
		
		// 특정회원 조회
		AdminUser memberInfo = userService.getMemberInfoById(memberId);
		
		// 회원등급 목록 조회
		List<AdminUserLevel> memberLevelList = userService.memberLevelList();
		
		model.addAttribute("title", "회원수정");
		model.addAttribute("memberInfo", memberInfo);
		model.addAttribute("memberLevelList", memberLevelList);
		
		return "admin/member/modify_member";
	}


	
	@PostMapping("/addMember")
	public String addMember(AdminUser adminUser) {
		
		log.info("맴버등록: {}", adminUser);
		userService.addMember(adminUser);
		
		return "redirect:/admin/member/getMember";
	}
	
	@GetMapping("/addMember")
	public String addMember(Model model) {
		
		List<AdminUserLevel> addMember = userService.memberLevelList();
		model.addAttribute("addMember", addMember);

		
		return "admin/member/add_member";
	}

	
	
	
	@PostMapping("/searchForUserList")
	@ResponseBody
	public List<AdminUser> searchForUserList(@RequestBody Map<String, Object> searchMap) {
		
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
		
		List<AdminUser> searchList = userService.getSearchForUserList(searchMap);
		
		return searchList;
	}
	
	
	@GetMapping("/getMember")
	public String getMemberList(Model model) {
		List<AdminUser> userList = userService.getuserList();
		
		log.info("userList: {}", userList);
		model.addAttribute("title", "회원목록조회");
		model.addAttribute("userList", userList);
		
		return "admin/member/get_member";
	}
}

