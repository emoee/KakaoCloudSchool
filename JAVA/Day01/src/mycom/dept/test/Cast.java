package mycom.dept.test;

public class Cast {

	public static void main(String[] args) {
			int x = 10;
			
			System.out.println(x);
			
			//	cast
			float y = (float) 25.2;
			
			double d =25; // double  8byte (���� 4 + �Ǽ� 4) ���� ����
			int b = (int)23.413; // int 4byte (���� 4) ���� X cast �ʿ�
			
			int ch = 'A'; 
			System.out.println((char) ch);
	}
}