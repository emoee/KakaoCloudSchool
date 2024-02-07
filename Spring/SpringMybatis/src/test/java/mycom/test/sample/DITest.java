package mycom.test.sample;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DITest {
	
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		log.info("***TEST***");
		
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info(restaurant.getChef());
	}
	
	@Test
	public void sampleTest() {
		log.info("***TEST2***");
	}
	
	@Before
	public void beforeTest() {
		log.info("작성자 : @@@");
	}
	
	@After
	public void afterTest() {
		Date d = new Date();
		log.info(d + ": 테스트 완료");
	}
}
