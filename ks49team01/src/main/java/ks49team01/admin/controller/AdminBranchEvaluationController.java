package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
	// 파일경로
@RequestMapping("/admin/branchEvaluation")
public class AdminBranchEvaluationController {
	// 메소드 명
	@GetMapping("/addbranchevaluationquestions")
	public String addbranchevaluationquestions(Model model) {
		
		log.info("본사 1차 가맹 평가 질문 등록");
		
		model.addAttribute("title", "본사 1차 가맹 평가 질문 등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation/add_branch_evaluation_questions";
	}

	
	@GetMapping("/modifybranchevaluationquestions")
	public String modifybranchevaluationquestions(Model model) {
		
		log.info("본사 1차 가맹 평가 질문 수정");
		
		model.addAttribute("title", "본사 1차 가맹 평가 질문 수정");
		
		return "admin/branch_evaluation/modify_branch_evaluation_questions";
	}
	
	
	@GetMapping("/removebranchevaluationquestions")
	public String removebranchevaluationquestions(Model model) {
		
		log.info("본사 1차 가맹 평가 질문 삭제");
		
		model.addAttribute("title", "본사 1차 가맹 평가 질문 삭제");
		
		return "admin/branch_evaluation/remove_branch_evaluation_questions";
	}
	
	
	@GetMapping("/getbranchevaluationquestions")
	public String getbranchevaluationquestions(Model model) {
		
		log.info("본사 1차 가맹 평가 질문 조회");
		
		model.addAttribute("title", "본사 1차 가맹 평가 질문 조회");
		
		return "admin/branch_evaluation/get_branch_evaluation_questions";
	}
	
	@GetMapping("/addbranchevaluationscoringcriteria")
	public String addbranchevaluationscoringcriteria(Model model) {
		
		log.info("본사 1차 가맹 평가 채점 기준 등록");
		
		model.addAttribute("title", "본사 1차 가맹 평가 채점 기준 등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation/add_branch_evaluation_scoring_criteria";
	}

	
	@GetMapping("/modifybranchevaluationscoringcriteria")
	public String modifybranchevaluationscoringcriteria(Model model) {
		
		log.info("본사 1차 가맹 평가 채점 기준 수정");
		
		model.addAttribute("title", "본사 1차 가맹 평가 채점 기준 수정");
		
		return "admin/branch_evaluation/modify_branch_evaluation_scoring_criteria";
	}
	
	
	@GetMapping("/removebranchevaluationscoringcriteria")
	public String removebranchevaluationscoringcriteria(Model model) {
		
		log.info("본사 1차 가맹 평가 채점 기준 삭제");
		
		model.addAttribute("title", "본사 1차 가맹 평가 채점 기준 삭제");
		
		return "admin/branch_evaluation/remove_branch_evaluation_scoring_criteria";
	}
	
	
	@GetMapping("/getbranchevaluationscoringcriteria")
	public String getbranchevaluationscoringcriteria(Model model) {
		
		log.info("본사 1차 가맹 평가 채점 기준 조회");
		
		model.addAttribute("title", "본사 1차 가맹 평가 채점 기준 조회");
		
		return "admin/branch_evaluation/get_branch_evaluation_scoring_criteria";
	}
	
	@GetMapping("/addbranchevaluationresponseandgrade")
	public String addbranchevaluationresponseandgrade(Model model) {
		
		log.info("가맹신청시 1차 평가 답변 및 채점 등록");
		
		model.addAttribute("title", "가맹신청시 1차 평가 답변 및 채점 등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation/add_branch_evaluation_response_and_grade";
	}

	
	@GetMapping("/modifybranchevaluationresponseandgrade")
	public String modifybranchevaluationresponseandgrade(Model model) {
		
		log.info("가맹신청시 1차 평가 답변 및 채점 수정");
		
		model.addAttribute("title", "가맹신청시 1차 평가 답변 및 채점 수정");
		
		return "admin/branch_evaluation/modify_branch_evaluation_response_and_grade";
	}
	
	
	@GetMapping("/removebranchevaluationresponseandgrade")
	public String removebranchevaluationresponseandgrade(Model model) {
		
		log.info("가맹신청시 1차 평가 답변 및 채점 삭제");
		
		model.addAttribute("title", "가맹신청시 1차 평가 답변 및 채점 삭제");
		
		return "admin/branch_evaluation/remove_branch_evaluation_response_and_grade";
	}
	
	
	@GetMapping("/getbranchevaluationresponseandgrade")
	public String getbranchevaluationresponseandgrade(Model model) {
		
		log.info("가맹신청시 1차 평가 답변 및 채점 조회");
		
		model.addAttribute("title", "가맹신청시 1차 평가 답변 및 채점 조회");
		
		return "admin/branch_evaluation/get_branch_evaluation_response_and_grade";
	}
	@GetMapping("/addtotalbranchapplyevaluation")
	public String addtotalbranchapplyevaluation(Model model) {
		
		log.info("1차 가맹 신청 평가 총합계 등록");
		
		model.addAttribute("title", "1차 가맹 신청 평가 총합계 등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation/add_total_branch_apply_evaluation";
	}

	
	@GetMapping("/modifytotalbranchapplyevaluation")
	public String modifytotalbranchapplyevaluation(Model model) {
		
		log.info("1차 가맹 신청 평가 총합계 수정");
		
		model.addAttribute("title", "1차 가맹 신청 평가 총합계 수정");
		
		return "admin/branch_evaluation/modify_total_branch_apply_evaluation";
	}
	
	
	@GetMapping("/removetotalbranchapplyevaluation")
	public String removetotalbranchapplyevaluation(Model model) {
		
		log.info("1차 가맹 신청 평가 총합계 삭제");
		
		model.addAttribute("title", "1차 가맹 신청 평가 총합계 삭제");
		
		return "admin/branch_evaluation/remove_total_branch_apply_evaluation";
	}
	
	
	@GetMapping("/gettotalbranchapplyevaluation")
	public String gettotalbranchapplyevaluation(Model model) {
		
		log.info("1차 가맹 신청 평가 총합계 조회");
		
		model.addAttribute("title", "1차 가맹 신청 평가 총합계 조회");
		
		return "admin/branch_evaluation/get_total_branch_apply_evaluation";
	}
	@GetMapping("/addbranchfinaldecisiontotalsumevaluation")
	public String addbranchfinaldecisiontotalsumevaluation(Model model) {
		
		log.info("1차 평가 총합계 기준으로최종 합격여부 결정 등록");
		
		model.addAttribute("title", "1차 평가 총합계 기준으로최종 합격여부 결정 등록");
		
		// 연결 클래스 파일/경로
		return "admin/branch_evaluation/add_branch_final_decision_total_sum_evaluation";
	}

	
	@GetMapping("/modifybranchfinaldecisiontotalsumevaluation")
	public String modifybranchfinaldecisiontotalsumevaluation(Model model) {
		
		log.info("1차 평가 총합계 기준으로최종 합격여부 결정 수정");
		
		model.addAttribute("title", "1차 평가 총합계 기준으로최종 합격여부 결정 수정");
		
		return "admin/branch_evaluation/modify_branch_final_decision_total_sum_evaluation";
	}
	
	
	@GetMapping("/removebranchfinaldecisiontotalsumevaluation")
	public String removebranchfinaldecisiontotalsumevaluation(Model model) {
		
		log.info("1차 평가 총합계 기준으로최종 합격여부 결정 삭제");
		
		model.addAttribute("title", "1차 평가 총합계 기준으로최종 합격여부 결정 삭제");
		
		return "admin/branch_evaluation/remove_branch_final_decision_total_sum_evaluation";
	}
	
	
	@GetMapping("/getbranchfinaldecisiontotalsumevaluation")
	public String getbranchfinaldecisiontotalsumevaluation(Model model) {
		
		log.info("1차 평가 총합계 기준으로최종 합격여부 결정 조회");
		
		model.addAttribute("title", "1차 평가 총합계 기준으로최종 합격여부 결정 조회");
		
		return "admin/branch_evaluation/get_branch_final_decision_total_sum_evaluation";
	}
	
}
