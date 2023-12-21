package mycom.dept.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	
	String ipAddress = "192.168.200.82";
	int portNumber = 5000;
	
	Socket socket=null;
	BufferedReader br=null;
	
	OutputStream os=null;
	ObjectOutputStream oos=null;
	
	public MyClient() throws IOException {
		System.out.println("-! 클라이언트 실행 !-");
		try {
			socket=new Socket(ipAddress, portNumber);
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력");
			
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			String sendData="";
			while((sendData=br.readLine())!=null) {
				oos.writeObject(sendData); // 스트림에 연결된 버퍼에 쓰기(저장)
				oos.flush(); // 버퍼에서 보낼때는 버퍼를 비워야한다. 밀어내기하면됨
				if (sendData.equals("quit")) break;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br!=null) br.close();
			if (oos!=null) oos.close();
			if (os!=null) os.close();
		}
	}
}
