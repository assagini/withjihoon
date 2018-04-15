package com.board.service;

import javax.inject.Inject;

import com.board.domain.BoardVO;
import com.board.persistence.BoardDAO;

public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void create(BoardVO vo) throws Exception{			//throws Exception 안 하면 에러뜸
		dao.create(vo);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception{
		return dao.read(bno);
	}
	
	@Override
	public void update(BoardVO vo) throws Exception{
		dao.update(vo);
	}
	
	@Override
	public void delete(Integer bno) throws Exception{
		dao.delete(bno);
	}

}
