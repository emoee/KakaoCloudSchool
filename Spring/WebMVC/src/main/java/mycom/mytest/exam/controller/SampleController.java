package mycom.mytest.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;
import mycom.mytest.exam.model.SampleVO;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping("")
	public void sample() {
		log.info("sampleController:sample()..");
	}
	
	@RequestMapping("/test")
	public void sample2() {
		log.info("sampleController:sample2()..");
	}
	
	@RequestMapping("/test2")
	public String sample3() {
		log.info("sampleController:sample3()..");
		return "sample/test2";
	}
	
	@RequestMapping("/requestparam")
	public void sample4(@RequestParam("name") String name, 
			@RequestParam("age") int age) {
		log.info("test4: name= " + name);
		log.info("test4: age= " + age);
	}
	
	@RequestMapping("/samplevo")
	public void sample5(SampleVO vo) {
		log.info("test5: vo= " + vo);
		log.info("test5: name= " + vo.getName()) ;
		log.info("test5: age= " + vo.getAge());
	}
}
