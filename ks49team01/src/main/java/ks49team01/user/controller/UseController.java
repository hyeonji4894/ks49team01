package ks49team01.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminUser;
import ks49team01.admin.dto.AdminUserLevel;
import ks49team01.admin.mapper.AdminUserMapper;
import ks49team01.admin.service.AdminUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user/member")
@AllArgsConstructor
@Slf4j
public class UseController {
	private final AdminUserService userService;
	  @Autowired
	    private AdminUserMapper adminUserMapper;
	
	
		@GetMapping("/login")
	  public String showLoginForm(Model model) {
	      model.addAttribute("adminUser", new AdminUser());
			return "user/member/login";
	  }
	
	  @PostMapping("/login")
	  public String processLogin(AdminUser adminUser, Model model) {
	      AdminUser storedAdminUser = adminUserMapper.findByUsernameAndPassword(adminUser.getMemberId(), adminUser.getMemberPw());
	      if (storedAdminUser != null) {
	          // 로그인 성공 시, 세션 또는 쿠키를 이용하여 사용자 정보 저장 등의 작업 수행
	  		return "redirect:/user";
	      } else {
	          model.addAttribute("error", "Invalid username or password");
	          return "redirect:/user/member/login"; // 로그인 실패 시 에러 메시지와 함께 다시 로그인 페이지로 이동
	      }
	  }
  
  
	
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

	}
