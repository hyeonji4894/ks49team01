package ks49team01.branch.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BranchReviewCategory {

	private String categoryCode;
	private String memberId;
	private String reviewCategoryKind;
	private String reviewCategoryContext;
	private LocalDate reviewCategoryRegisterDate;

	
}
