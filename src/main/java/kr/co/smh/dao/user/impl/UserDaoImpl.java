package kr.co.smh.dao.user.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.smh.dao.user.UserDao;
import kr.co.smh.domain.user.dto.LoginDTO;
import kr.co.smh.domain.user.dto.UserDTO;
import kr.co.smh.domain.user.vo.LoginVO;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "kr.co.smh.mapper.UserMapper.";
	
	@Override
	public void insertUser(UserDTO userDTO) throws Exception {
		sqlSession.insert(namespace+"insertUser", userDTO);
	}

	@Override
	public void deleteUser(String userid) throws Exception {
		sqlSession.delete(namespace+"deleteUser", userid);
	}

	@Override
	public LoginVO loginUser(LoginDTO loginDTO) throws Exception {
		return sqlSession.selectOne(namespace+"loginUser", loginDTO);
	}
}
