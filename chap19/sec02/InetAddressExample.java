package chap19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.google.co.kr");
			for(InetAddress remote : iaArr) {
				System.out.println("www.google.co.kr IP 주소:" + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
