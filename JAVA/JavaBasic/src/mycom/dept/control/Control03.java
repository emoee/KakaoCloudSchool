package mycom.dept.control;

public class Control03 {
	public static void main(String[] args) {
		// �� ���
		System.out.println("�� 1");
		for (int i=0; i<4; i++) { // �� �ݺ�Ƚ��
			for (int j=0; j<5; j++) { // �� �ݺ�Ƚ��
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �� ���2
		System.out.println("�� 2");
		for (int i=1; i<6; i++) { // �� �ݺ�Ƚ��
			for (int j=0; j<i; j++) { // �� �ݺ�Ƚ��
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �� ��� 3
		System.out.println("�� 3");
		for (int i=0; i<6; i++) { // �� �ݺ�Ƚ��
			for (int j=5; j>i; j--) { // �� �ݺ�Ƚ��
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �� ��� 4
		System.out.println("�� 4");
		for (int i=0; i<5; i++) { // �� �ݺ�Ƚ��
			for (int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for (int j=5; j>i; j--) { // �� �ݺ�Ƚ��
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �� ��� 5
		System.out.println("�� 5");
		for (int i=1; i<8; i=i+2) { // �� �ݺ�Ƚ��
			for (int k=7; k>i; k=k-2) {
				System.out.print(" ");
			}
			for (int j=1; j<i+1; j++) { // �� �ݺ�Ƚ��
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=0; i<4; i++) {
			for (int k=0; k<3-i; k++) {
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
