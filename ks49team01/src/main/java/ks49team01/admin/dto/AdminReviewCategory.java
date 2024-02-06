package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminReviewCategory {

	private String categoryCode;
	private String memberId;
	private String reviewCategoryKind;
	private String reviewCategoryContext;
	private LocalDate reviewCategoryRegisterDate;

	
}
