package mycom.dept.control;

public class Control01 {

	public static void main(String[] args) {
		// if
		// "���� ������ �ýø� Ÿ�� ����, ���� ������ �ɾ��."
		boolean money = true;
		
		if (money) {
			System.out.println("taxi");
		} else {
			System.out.println("walk");
		}
		
		// "������ ���� ������ �ýø� Ÿ��, ������ ���� ������ ī�尡 ������ �ýø� Ÿ��, ���� ���� ī�嵵 ������ �ɾ��"
		boolean[] wallet = {false, true}; // money, card
		if (wallet[0] || wallet[1]) {
			System.out.println("taxi");
		} else {
			System.out.println("walk");
		}
	}
}