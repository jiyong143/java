package DAY17.socket2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerEx2 {

	public static void main(String[] args) {
		
        int port = 5001;
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		ServerSocket serverSocket = null;
		
		String fileName = "src/DAY17/socket1/chat.txt";	
		
		list = load(fileName);
		
		System.out.println(list);
		
		System.out.println("불러오기 성공");
		
		try {
			// 2. 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			// 3. 대기
			
			// 4. 요청 수락 후 소켓 객체 생성
			Socket socket = serverSocket.accept();
			
			System.out.println("[연결 성공]");
			// 클라이언트가 보낸 문자열을 읽어와서 콘솔에 출력하는 쓰레드
			
			Thread receiveThread = new Thread(()->{
				try {
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
					while(true) {
					String str = ois.readUTF();
					System.out.println(str);
				}
					
					
				}catch(IOException e) {
					e.printStackTrace();
				}
							
			});
			
			receiveThread.start();
			
			Thread sendThread = new Thread(()->{
				try(ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
					Scanner scan = new Scanner(System.in);
					while(true) {
						String str = scan.nextLine();						
						oos.writeUTF(str);
						oos.flush();
						if(str.equals("-1")) {
							break;
						}
						
						
					}
				}catch(IOException e) {
					e,printStackTrace();
					
				}
				System.out.println();
			});
			
			// 읽어온 채팅 내역을 클라이언트로 전송
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(list);
			oos.flush();
			
			InputStream is =socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			while(true) {
			String str = ois.readUTF();
			if(str.equals("-1")) {
				break;
			}
			System.out.println(str);
			list.add(str);
			}
			ois.close();
			is.close();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		save(list,fileName);
	}

	private static void save(ArrayList<String> list, String fileName) {
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(fileName))){
			list.stream().forEach(str->{
				try {
					oos.writeUTF(str);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			});
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	private static  ArrayList<String> load(String fileName){
		ArrayList<String> list = new ArrayList<String>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			
			while(true) {
				list.add(ois.readUTF());
			}
			
		
		} catch (IOException e) {
			return list;
			
		}

	}

}
