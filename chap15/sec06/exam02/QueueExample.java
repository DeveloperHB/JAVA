package chap15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//Queue 컬렉션 생성(FIFO 구조)
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메시지를 큐에 넣기: offer() 메소드 이용
		messageQueue.offer(new Message("sendMail","하이머딩거"));
		messageQueue.offer(new Message("sendSMS","리신"));
		messageQueue.offer(new Message("sendKakaotalk","비에고"));
		
		//메시지를 하나씩 꺼내어 처리함 : poll() 메소드 이용
		while(!messageQueue.isEmpty()) { //큐가 비어있지 않다면 while 문 반복
			Message message = messageQueue.poll(); //Message 객체를 하나 꺼내옴
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to +"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
			System.out.println(message.to + "님에게 SMS를 보냅니다.");
			    break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}

}
