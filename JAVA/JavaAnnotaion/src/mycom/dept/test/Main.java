package mycom.dept.test;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Method[] declared= MyService.class.getDeclaredMethods();
		
		for (Method method : declared) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			System.out.println(printAnnotation.number());
		}
	}
}