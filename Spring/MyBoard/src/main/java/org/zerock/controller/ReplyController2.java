package org.zerock.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample2")
@Log4j
public class ReplyController2 {

	@GetMapping(value="/getText", produces="text/plain; charset=UTF-8")
	public String getText() {
		return "Text test : <h1>일반 텍스트이므로 h1 태그 적용 안됨 text/html인 경우 적용</h1>";
	}

	@GetMapping(value="/getXmlOrJson", produces= {
			MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	public SampleVO getXmlOrJson() {
		SampleVO vo = new SampleVO(1, "플레이", "바오밥");
		return vo;
	}
}
   