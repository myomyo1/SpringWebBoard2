package kr.co.smh.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.smh.domain.board.dto.BoardDTO;
import kr.co.smh.domain.board.vo.BoardVO;
import kr.co.smh.service.board.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
(locations={"file:src/main/webapp/WEB-INF/spring/*-context.xml"})
public class BoardServiceTest {
	@Autowired
	private BoardService boardService;
	
	//회원가입 테스트
	@Test
	public void testBoardInsert() throws Exception{
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setUserid("mhso");
		boardDTO.setTitle("test Title");
		boardDTO.setContents("test Contents");
		
		boardService.insertBoard(boardDTO);
	}
	
	@Test
	public void testBoardListSelect() throws Exception{
		List<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO boardVO : boardList){
			System.out.println("글번호 : " + boardVO.getBidx());
			System.out.println("제목 : " + boardVO.getTitle());
			System.out.println("내용 : " + boardVO.getContents());
		}
	}
	
}
