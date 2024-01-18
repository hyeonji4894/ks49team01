package ks49team01.admin.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AdminLogin {
	
	private AdminUser user;
	private String loginCode;
	private String memberId;
	private LocalDateTime logDate;
	private LocalDateTime logoutDate;

	

}
