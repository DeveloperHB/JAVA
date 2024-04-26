package chap13.sec06.exam02;

//제네릭 타입 선언
public class Container<T> {
private T t; //필드 선언

public T get() {
 return t;
}

public void set(T t) {
 this.t = t;
}
}