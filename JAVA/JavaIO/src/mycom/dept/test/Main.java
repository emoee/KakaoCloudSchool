package mycom.dept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=null;
		try {
			fileInputStream=new FileInputStream("Hello.txt");
			int ch=0;
			while((ch = fileInputStream.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} catch (IOException e) {   
			System.out.println("������ �������ϴ�.");
		} finally {
			if (fileInputStream != null) fileInputStream.close();
		}
	}
}