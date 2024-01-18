package ks49team01.admin.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberGender;
	private String memberPhone;
	private String memberAddr;
	private int memberMileage;
	private LocalDateTime memberRegDate;  // LocalDateTime 사용
	private LocalDate memberBirth;  
	


}
