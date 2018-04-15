package com.board.domain;

public class BoardVO {			//변수 이름을 테이블의 칼럼명과 일치시킨다.
	
	private Integer bno;
	private String title;
	private String content;
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + "]";
	}
}
