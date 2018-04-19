package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.BoardVO;
import com.board.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void create(BoardVO vo) throws Exception{			//throws Exception 안 하면 에러뜸
		dao.create(vo);
	}
	
	@Override
	public List<BoardVO> listAll() throws Exception {
	    return dao.listAll();
	}	

	@Override
	public BoardVO read(Integer bno) throws Exception {
	    return dao.read(bno);
	}
	
	@Override
	public void modify(BoardVO vo) throws Exception {
		System.out.println("2");
	    dao.update(vo);
	}	
	
	@Override
	public void delete(Integer bno) throws Exception {
	    dao.delete(bno);
	}	
	
}
