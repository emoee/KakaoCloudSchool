package mycom.dept.control;

public class Control01 {

	public static void main(String[] args) {
		// if
		// "돈이 있으면 택시를 타고 가고, 돈이 없으면 걸어간다."
		boolean money = true;
		
		if (money) {
			System.out.println("taxi");
		} else {
			System.out.println("walk");
		}
		
		// "지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라"
		boolean[] wallet = {false, true}; // money, card
		if (wallet[0] || wallet[1]) {
			System.out.println("taxi");
		} else {
			System.out.println("walk");
		}
	}
}