package mycom.dept.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=null;
		InputStreamReader inputStreamReader=null;
		BufferedReader bufferedReader=null;
		BufferedReader bufferedReader2=null;
		
		try {
			// 데코레이션
			fileInputStream=new FileInputStream("Hello.txt");
			inputStreamReader=new InputStreamReader(fileInputStream); // 바이트 -> 문자기반
			bufferedReader=new BufferedReader(inputStreamReader); // 문자기반 -> 버퍼링
			
			// 한줄코드
			bufferedReader2=new BufferedReader(new InputStreamReader(new FileInputStream("Hello.txt")));
			
			String str="";
			
			while((str=bufferedReader.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {   
			System.out.println("파일이 끝났습니다.");
		} finally {
			if (bufferedReader != null) bufferedReader.close();
			if (inputStreamReader != null) inputStreamReader.close();
			if (fileInputStream != null) fileInputStream.close();
			
			if (bufferedReader2 != null) bufferedReader2.close();
		}
	}
}