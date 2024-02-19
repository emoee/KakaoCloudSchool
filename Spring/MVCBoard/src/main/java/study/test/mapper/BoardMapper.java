package study.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import study.test.domain.BoardVO;

public interface BoardMapper {
	// @Select("select * from tbl_board where bno > 0") xml로 작성했으므로 주석처리
	public List<BoardVO> getList();
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	public BoardVO read(Long bno);
	public int delete(Long bno);
	public int update(BoardVO board);
}
