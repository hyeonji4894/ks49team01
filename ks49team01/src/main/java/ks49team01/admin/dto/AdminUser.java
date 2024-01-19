package ks49team01.admin.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AdminUser {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberGender;
	private String memberPhone;
	private String memberAddr;
	private LocalDateTime memberRegDate;  // LocalDateTime 사용
	private LocalDate memberBirth;  
	
	
	private int memberMileage;
	
	private int final_mileage;
	private int accumulated_payment_amount;
	private String memberState;  
	private String mem_level_code;  
	private String membership_rating;  


}
