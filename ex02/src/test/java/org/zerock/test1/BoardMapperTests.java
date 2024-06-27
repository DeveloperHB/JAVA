package org.zerock.test1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@Test
	public void testGetList() {
		
		log.info("-------------");
		log.info(boardMapper);
		boardMapper.getList();
	}
	
	/*@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
	    board.setContent("새로 작성하는 내용");
	    board.setWriter("new작성자");
	    
	    boardMapper.insert(board);
	    
	    log.info(board);
	   		
		
	}
	
	@Test
	
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		
		board.setBno(11);
		board.setTitle("7교시");
	    board.setContent("보드맵퍼의 이용");
	    board.setWriter("아무개");
	    
	    int count = boardMapper.update(board);
	    log.info("UPDATE COUNT : " + count);
	       
	   
	}
	@Test
	public void testdelete() {
			
		log.info("DELETE COUNT: " + boardMapper.delete(10));
		
		}
	@Test
	public void testRead() { 
		
		BoardVO board = boardMapper.read(1);
		
		log.info(board);
	}
	*/
	@Test
	public void testList2() {
		
		boardMapper.getList2();
		log.info(boardMapper);
	}
		
 }
