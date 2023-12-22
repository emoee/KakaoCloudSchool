package mycom.dept.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	
	String ipAddress = "172.16.0.61";
	int portNumber = 5000;
	
	Socket connS;
	BufferedReader br;
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String receiveData;
	InputStream is;
	ObjectInputStream ois;
	
	public MyClient() throws IOException {
		System.out.println("-! 클라이언트 실행 !-");
		try {
			// Connection 요청하기 -- 서버와 연결되면: session
			connS=new Socket(ipAddress, portNumber);
			
			// 키보드로부터 전송시킬 데이터 입력 받아놓기
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력 -> ");
			
			// 데이터 전송
			String sendData="";
			os = connS.getOutputStream(); // 서버와 연결된 소켓에서 출력스트림 얻어옴
			oos = new ObjectOutputStream(os); // 보조스트림에 연결해 직렬화를 위한 준비
			
			while((sendData=br.readLine())!=null) {
				oos.writeObject(sendData); // 직렬화, 스트림에 연결된 버퍼에 쓰기(저장)
				// 보통 하나씩 보내기 보다 출력 버퍼를 사용해 모아서 보낸다.
				oos.flush(); // 버퍼에서 보낼때는 버퍼를 비워야한다. 밀어내기하면됨
				if (sendData.equals("quit")) break;
			}
			
			// 에코서버에서 전송받은 메세지 출력
			is = connS.getInputStream();
			ois = new ObjectInputStream(is);
			receiveData = (String) ois.readObject();
			System.out.println(connS.getInetAddress() + "메세지: " + receiveData);
			
			// 커넥션해제
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("문자열로 변환할 수 없습니다.");
		} finally {
			if (br!=null) br.close();
			if (oos!=null) oos.close();
			if (os!=null) os.close();
			if (ois!=null) ois.close();
			if (is!=null) ois.close();
		}
	}
}
