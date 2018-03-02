package kr.co.smh.controller.commons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.smh.domain.board.vo.BoardVO;
import kr.co.smh.exception.BoardNotFoundException;
import kr.co.smh.service.board.BoardService;

@Controller
public class MainController {
	
	@Autowired
	private BoardService boardService;
		
	//메인페이지 이동
	@RequestMapping("/")
	public String main(Model model) throws Exception{
		List<BoardVO> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "home";
	}
	
	@RequestMapping("/doError")
	public String doException() throws BoardNotFoundException{
		throw new BoardNotFoundException();
	}
}