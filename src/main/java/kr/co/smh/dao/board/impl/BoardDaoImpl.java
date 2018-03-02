package kr.co.smh.dao.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.smh.dao.board.BoardDao;
import kr.co.smh.domain.board.dto.BoardDTO;
import kr.co.smh.domain.board.vo.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "kr.co.smh.mapper.BoardMapper.";
	
	@Override
	public void insertBoard(BoardDTO boardDTO) throws Exception {
		sqlSession.insert(namespace+"insertBoard", boardDTO);
	}

	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		return sqlSession.selectList(namespace+"selectBoard");
	}

	@Override
	public BoardVO selectBoardDetail(String bidx) {
		return sqlSession.selectOne(namespace+"selectBoardOne", bidx);
		
	}

	@Override
	public void addHitCount(String bidx)  {
		sqlSession.update(namespace+"addHitCount", bidx);
	}

}
