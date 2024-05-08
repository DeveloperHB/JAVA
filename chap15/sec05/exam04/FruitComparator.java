package chap15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	//FruitComparator를 비교자로 사용해서 가격 기준으로 Fruit 객체를 정렬
	//비교자는 Comparator 인터페이스를 구현한 객체
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return -1; //o1이 o2보다 앞에오면 (작으면) 음수(1) 리턴
		else if(o1.price == o2.price) return 0;
		else return 1; //o1이 o2보다 뒤에오면(크면) 양수(1) 리턴
	}

}
