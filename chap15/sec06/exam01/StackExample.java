package chap15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//Stack 컬렉션 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기(push() 메소드 이용)
		coinBox.push(new Coin(100)); //1
		coinBox.push(new Coin(50));  //2
		coinBox.push(new Coin(500)); //3
		coinBox.push(new Coin(10));  //4
		
		//동전을 하나씩 꺼내기(pop()메소드 이용)
		while(!coinBox.isEmpty()) { //비어있지 않다면 while 문을 반복함
			Coin coin = coinBox.pop(); //pop()은 스택에서 객체하나 꺼내오기
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
		

	}

}
