package ks49team01.user.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserNoticeBoard;
import ks49team01.user.service.UserNoticeBoardService;

@Transactional
@Controller
@RequestMapping("/noticeboard")
public class UserNoticeBoardController {
	
	
	
	
	
	@ModelAttribute("noticeBoard")
	public UserNoticeBoard getNoticeBoard() {
	    return new UserNoticeBoard(); // 또는 적절한 초기화
	}

	@ModelAttribute("org.springframework.validation.BindingResult.noticeBoard")
	public BindingResult getBindingResult() {
	    return new BeanPropertyBindingResult(getNoticeBoard(), "noticeBoard");
	}



	@Autowired
	private UserNoticeBoardService userNoticeBoardService;

    @GetMapping("/viewAll")
    public String viewAllNoticeBoards(Model model) {
        List<UserNoticeBoard> noticeBoards = userNoticeBoardService.getAllNoticeBoards();
        model.addAttribute("noticeBoards", noticeBoards);
        return "index"; // Thymeleaf 뷰 이름
    }

    @GetMapping("/{noticeBoardCode}")
    public ResponseEntity<UserNoticeBoard> getNoticeBoard(@PathVariable String noticeBoardCode) {
        UserNoticeBoard noticeBoard = userNoticeBoardService.getNoticeBoard(noticeBoardCode);
        return ResponseEntity.ok(noticeBoard);
    }

    @PostMapping("/add")
    public String addNoticeBoard(@ModelAttribute UserNoticeBoard noticeBoard) {
        userNoticeBoardService.insertNoticeBoard(noticeBoard);
        return "redirect:/noticeboard/viewAll";
    }

    
    
    @GetMapping("/edit/{noticeBoardCode}")
    public String editNoticeBoardView(@PathVariable String noticeBoardCode, Model model) {
        UserNoticeBoard noticeBoard = userNoticeBoardService.getNoticeBoard(noticeBoardCode);
        model.addAttribute("noticeBoard", noticeBoard);
        return "edit"; // Thymeleaf 뷰 이름
    }

    @PostMapping("/update")
    public String updateNoticeBoard(@ModelAttribute UserNoticeBoard noticeBoard) {
        userNoticeBoardService.updateNoticeBoard(noticeBoard);
        return "redirect:/noticeboard/viewAll";
    }

    @GetMapping("/delete/{noticeBoardCode}")
    public String deleteNoticeBoard(@PathVariable String noticeBoardCode) {
        userNoticeBoardService.deleteNoticeBoard(noticeBoardCode);
        return "redirect:/noticeboard/viewAll";
    }
}
