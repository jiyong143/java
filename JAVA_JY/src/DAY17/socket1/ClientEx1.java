package DAY17.socket1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientEx1 {

	public static void main(String[] args) {
		// 서버의 ip, port 번호 설정
		String ip = "192.168.30.194";
		int port =5001;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> list = null;
		// 1. ip와 port를 이용해 소켓 생성
		try(Socket socket = new Socket(ip,port)){
			// 2. 연결 요청
			
			System.out.println("연결 성공");
			
			Thread receiveThread ois =new ObjectInputStream()
			
			
			
			
			
			
			
			
		}catch (UnknownHostException e) {
			System.out.println("연결할 수 없다");
			
		} catch (IOException e) {
			
			System.out.println("예외 발생");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
