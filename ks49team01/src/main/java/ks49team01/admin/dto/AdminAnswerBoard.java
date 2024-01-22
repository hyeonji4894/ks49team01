package ks49team01.admin.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminAnswerBoard {

	private String answer_board_code;
	private String branch_code;
	private String member_id;
	private String answer_board_title;
	private String answer_board_content;
	private LocalDate answer_board_reg_time;

}
