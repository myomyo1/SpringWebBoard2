package kr.co.smh.service.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.smh.dao.board.BoardDao;
import kr.co.smh.domain.board.dto.BoardDTO;
import kr.co.smh.domain.board.vo.BoardVO;
import kr.co.smh.exception.BoardNotFoundException;
import kr.co.smh.service.board.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public void insertBoard(BoardDTO boardDTO) throws Exception {
		boardDao.insertBoard(boardDTO);
	}

	@Override
	public List<BoardVO> getBoardList() throws Exception {
		return boardDao.selectBoardList();
	}

	@Override
	public BoardVO getBoardDetail(String bidx) throws BoardNotFoundException{
		boardDao.addHitCount(bidx);
		
		BoardVO boardVO = boardDao.selectBoardDetail(bidx);
		
		if(boardVO == null){
			throw new BoardNotFoundException();
		}
		
		return boardVO;
	}
	
}
