package kr.co.smh.service.board;

import java.util.List;

import kr.co.smh.domain.board.dto.BoardDTO;
import kr.co.smh.domain.board.vo.BoardVO;
import kr.co.smh.exception.BoardNotFoundException;

public interface BoardService {
	public void insertBoard(BoardDTO boardDTO) throws Exception;
	public List<BoardVO> getBoardList() throws Exception;
	public BoardVO getBoardDetail(String bidx) throws BoardNotFoundException;
}
