package mycom.dept.test;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			MyClient myClient = new MyClient();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
