package mycom.dept.test;

public class MyService {
	
	@PrintAnnotation(value = "*", number = 2)
	public void printTest() {
		System.out.println("�μ� ���� ");
	}
	
	@PrintAnnotation(number = 10)
	public void printTest2() {
		System.out.println("�μ� ���� 2");
	}

}
