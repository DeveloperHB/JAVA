package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Component
@RequestMapping("/sample/")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic 메소드 실행......");
	}
	
	@GetMapping("/basicGet")
	public void basicGet() {
		log.info("basicGet() 메소드 실행 ...............");
	}
	
	@GetMapping("/ex01")
	public void ex01(SampleDTO dto) {
		log.info(dto);
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name")  String name, @RequestParam("age")  int age) {
		log.info("name : " +name);
		log.info("age : " +age);
		
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids : " + ids);
		log.info("ids : " + ids.get(0));
		
		return "ex02List";
	}
	
	@GetMapping("/lhb")
	public String lhb(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name : " +name);
		log.info("age : " +age);
		
		return "lhb";
	}

}
