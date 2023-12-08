package mycom.dept.control;

public class Control03 {
	public static void main(String[] args) {
		// º° Âï±â
		System.out.println("º° 1");
		for (int i=0; i<4; i++) { // Çà ¹Ýº¹È½¼ö
			for (int j=0; j<5; j++) { // ¿­ ¹Ýº¹È½¼ö
				System.out.print("*");
			}
			System.out.println();
		}
		
		// º° Âï±â2
		System.out.println("º° 2");
		for (int i=1; i<6; i++) { // Çà ¹Ýº¹È½¼ö
			for (int j=0; j<i; j++) { // ¿­ ¹Ýº¹È½¼ö
				System.out.print("*");
			}
			System.out.println();
		}
		
		// º° Âï±â 3
		System.out.println("º° 3");
		for (int i=0; i<6; i++) { // Çà ¹Ýº¹È½¼ö
			for (int j=5; j>i; j--) { // ¿­ ¹Ýº¹È½¼ö
				System.out.print("*");
			}
			System.out.println();
		}
		
		// º° Âï±â 4
		System.out.println("º° 4");
		for (int i=0; i<5; i++) { // Çà ¹Ýº¹È½¼ö
			for (int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for (int j=5; j>i; j--) { // ¿­ ¹Ýº¹È½¼ö
				System.out.print("*");
			}
			System.out.println();
		}
		
		// º° Âï±â 5
		System.out.println("º° 5");
		for (int i=1; i<8; i=i+2) { // Çà ¹Ýº¹È½¼ö
			for (int k=7; k>i; k=k-2) {
				System.out.print(" ");
			}
			for (int j=1; j<i+1; j++) { // ¿­ ¹Ýº¹È½¼ö
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
