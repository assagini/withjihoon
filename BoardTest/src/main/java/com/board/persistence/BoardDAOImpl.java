package com.board.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.board.domain.BoardVO;


//vo작성 --> mapper작성 --> dao작성
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;			//session이 왜 필요한걸까?
	
	private static String namespace = "com.board.mapper.boardMapper";		//mapper가보면 namespace라고 있음, 거기 써있는 거 쓰는 거임

	@Override
	public void create(BoardVO vo) throws Exception{
		session.insert(namespace + ".create", vo);			//boardMapper에 가보면 id가 있다. 그 id값이 따옴표 안에 있는 값이다.
															//그 id값을 namespace와 결합해서 지정한다.
															//뒤에 vo는 매개변수를 의미하는 듯 함
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception{
		return session.selectOne(namespace + ".read", bno);		//selectOne()메소드는 오직 하나의 데이터를 검색하는 SQL구문을 실행할 때 사용
	}
	
	@Override
	public void update(BoardVO vo) throws Exception{
		session.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(Integer bno) throws Exception{
		session.delete(namespace + ".delete", bno);
	}	
}
