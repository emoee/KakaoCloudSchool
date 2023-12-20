package mycom.dept.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // 실행 시 까지 유지
public @interface PrintAnnotation {

	String value() default "-";
	int number() default 15;
}
