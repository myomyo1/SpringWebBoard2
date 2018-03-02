package kr.co.smh.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.smh.domain.board.vo.BoardVO;
import kr.co.smh.service.board.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/detail/{bidx}", method = RequestMethod.GET)
	public String getBoardDetail(@PathVariable("bidx") String bidx, Model model) throws Exception{
		BoardVO boardVO = boardService.getBoardDetail(bidx);
		model.addAttribute("board", boardVO);
		return "board/boardDetail";
	}
}
