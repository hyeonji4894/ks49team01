package ks49team01.admin.dto;

import lombok.Data;

@Data
public class AdminReviewCategory {

	private String facilityCode;
	private String memberId;
	private String facilityRegisterDate;
	private String facilityCategoryContext;
	
	private String moodCode;
	private String moodRegisterDate;
	private String moodCategoroyContext;
	
	private String facilityMoodChoiceCode;
	private String chosenCategory;
}
