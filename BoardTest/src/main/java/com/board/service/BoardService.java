package com.board.service;

import java.util.List;
import com.board.domain.BoardVO;


public interface BoardService {
	
	public void create(BoardVO vo) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void modify(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
}
