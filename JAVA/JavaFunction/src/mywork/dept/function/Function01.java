package mywork.dept.function;

public class Function01 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int max = getMax(a, b);
		
		System.out.println(max);
		
		a = -110;
		b = -220;
		max = getMax(a, b);
		
		System.out.println(max);
	}
	
	static int getMax(int x, int y) {
		int  max = x;
		if (y > max) {
			max = y;
		}
		return max;
	}
} 