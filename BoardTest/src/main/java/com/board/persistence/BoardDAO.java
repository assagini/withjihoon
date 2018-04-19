package com.board.persistence;

import java.util.List;
import com.board.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;			//게시글 작성
	
	public List<BoardVO> listAll() throws Exception;			//리스트 보기
	
	public BoardVO read(Integer bno) throws Exception;	
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;	
}
