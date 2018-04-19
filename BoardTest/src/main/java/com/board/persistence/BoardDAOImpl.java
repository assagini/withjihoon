package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;			//session이 왜 필요한걸까?
	
	@Inject
	private BoardDAO dao;
	
	private static String namespace = "com.board.mapper.boardMapper";		//mapper가보면 namespace라고 있음, 거기 써있는 거 쓰는 거임

	@Override
	public void create(BoardVO vo) throws Exception{
		session.insert(namespace + ".create", vo);			//boardMapper에 가보면 id가 있다. 그 id값이 따옴표 안에 있는 값이다.
															//그 id값을 namespace와 결합해서 지정한다.
															//뒤에 vo는 매개변수를 의미하는 듯 함
	}
	
	@Override
	public List<BoardVO> listAll() throws Exception {
	    return session.selectList(namespace + ".listAll");
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception {
	    return session.selectOne(namespace + ".read", bno);
	}	
	
	
	@Override
	public void update(BoardVO vo) throws Exception {
		System.out.println("3");
	    session.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(Integer bno) throws Exception {
	    session.delete(namespace + ".delete", bno);
	}
	
}
