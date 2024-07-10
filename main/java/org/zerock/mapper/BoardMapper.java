package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	void insert(BoardVO board);
	
	public int update(BoardVO board);
	
	public BoardVO read(int bno);
	
	@Select("select * from tbl_board where bno > 5 ")
	public List<BoardVO> getList2();

	public int delete(int bno);

	//public BoardVO read(int i);
	
}
