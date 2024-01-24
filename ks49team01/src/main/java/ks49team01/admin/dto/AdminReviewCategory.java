package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminReviewCategory {

	private String facilityCode;
	private String memberId;
	private LocalDate facilityRegisterDate;
	private String facilityCategoryContext;
	
	private String moodCode;
	private LocalDate moodRegisterDate;
	private String moodCategoryContext;
	
	private String facilityMoodChoiceCode;
	private String chosenCategory;
}
