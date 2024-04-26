package chap13.sec02.exam02;

public interface Rentable<P> { //타입 파라미터 P 정의
	P rent(); //타입 파라미터P를 리턴 타입으로 사용

}
