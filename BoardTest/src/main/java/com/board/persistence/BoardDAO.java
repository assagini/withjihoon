package com.board.persistence;

import com.board.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;			//게시글 작성
	
	public BoardVO read(Integer bno) throws Exception;			//게시글 상세보기
	
	public void update(BoardVO vo) throws Exception;			//게시글 수정
	
	public void delete(Integer bno) throws Exception;			//게시글 삭제
	
}
