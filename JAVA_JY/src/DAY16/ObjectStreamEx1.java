package DAY16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ObjectStreamEx1 {

	public static void main(String[] args) {
		// 직렬화 역직렬화를 이용해서 객체를 쓰고 읽는 예제
		
		Board board = new Board(1,"제목","내용","테스트");
		
		String fileName = "src/DAY16/objectStreamEx1.txt";
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
				
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(board);
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없다");
		}catch(IOException e) {
			System.out.println("파일을 쓰는 도중에 문제 발생");
		}
		
		
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Board tmp = (Board)ois.readObject();
			System.out.println(tmp);
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없다");
		}catch(IOException e) {
			System.out.println("파일 읽는 도중 문제 발생");
		} catch (ClassNotFoundException e) {
			
			System.out.println("클래스 찾을 수 없다");
		}
		
		
		

	}

}


@Data
@AllArgsConstructor
class Board implements Serializable{
	
	private static final long serialVersionUID = -20041244613227781L;
	
	int num;
	String title, contents;
	
	transient String test;
	
	
}