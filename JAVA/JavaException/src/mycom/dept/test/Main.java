package mycom.dept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		try { 
			
			FileInputStream fileInputStream = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("¿¹¿Ü");
			
		}
		
	}
}
