package chap18.sec10;

import java.io.Serializable;

public class Product implements Serializable {
	//private static final long seralVersionUID = -622284561026719240L;
    private String id;
	private int score;
	
	public Product(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public String toString() {return id + " : " + score;}
	}


