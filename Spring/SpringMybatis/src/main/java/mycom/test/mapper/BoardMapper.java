package mycom.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import mycom.test.domain.BoardVO;

public interface BoardMapper {
	
	@Select("SELECT * FROM tbl_board WHERE bno > 0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	public void insrtSelectKey(BoardVO board);
	
	public void delete(Long bno);
	public void update(BoardVO board);
}
