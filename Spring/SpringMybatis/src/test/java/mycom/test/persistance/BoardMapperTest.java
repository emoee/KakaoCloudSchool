package mycom.test.persistance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import mycom.test.domain.BoardVO;
import mycom.test.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void insertTest() {
		BoardVO bvo= new BoardVO();
		bvo.setTitle("Å×½ºÆ®..");
		bvo.setContent("@@!!");
		bvo.setWriter("ºäºä•m");
		bvo.setBno(1L);
		
		//mapper.insert(bvo);
		mapper.getList();
		mapper.delete(3L);
		mapper.update(bvo);
		mapper.getList();
	}
}
