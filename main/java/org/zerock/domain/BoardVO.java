package org.zerock.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int bno;
	private String writer;
	private String title;
	private String content;
	private Date writeDate;
	private Date updateDate;

}

