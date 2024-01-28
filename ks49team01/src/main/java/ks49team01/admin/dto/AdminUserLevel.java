package ks49team01.admin.dto;

import ks49team01.user.dto.RoompayMileageRate;
import lombok.Data;

@Data
public class AdminUserLevel {
	
	private String mem_level_code;
	private String member_id;
	private String membership_rating;
	private String System_registration_time;
	
	private RoompayMileageRate roompayMileageRate;

	
	
	

}
