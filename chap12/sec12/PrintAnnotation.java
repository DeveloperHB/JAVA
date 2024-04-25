package chap12.sec12;

import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD})
//ElementType.METHOD:어노테이션 적용대상을 METHOD로 지정함
@Retention(RetentionPolicy.RUNTIME)
//RetentionPolicy.RUNTIME: 어노테이션 유지정책을 RUNTIME으로 지정
//==> RUNTIME 은 실행할 때 적용, 계속 유지됨

public @interface PrintAnnotation {
	String value() default "-"; //value 속성 : 선의 종류(-)
	int number() default 15; //number 속성 : 출력횟수

}
