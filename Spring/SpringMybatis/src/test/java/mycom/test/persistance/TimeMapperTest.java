package mycom.test.persistance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import mycom.test.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTest {

	@Setter(onMethod_ = {@Autowired})
	private TimeMapper timeMapper;
	
	@Test
	public void timeMapperTest() {
		log.info("***T***" + timeMapper.getTime());
		log.info("------------");
		log.info("***T***" + timeMapper.getTime2()); 
	}
}