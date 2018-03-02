package kr.co.smh.dao.board;

import java.util.List;

import kr.co.smh.domain.board.dto.BoardDTO;
import kr.co.smh.domain.board.vo.BoardVO;

public interface BoardDao {
	public void insertBoard(BoardDTO boardDTO) throws Exception;
	public List<BoardVO> selectBoardList() throws Exception;
	public BoardVO selectBoardDetail(String bidx);
	public void addHitCount(String bidx);
}
