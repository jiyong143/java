package DAY16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) {
		
		String fileName = "src/DAY16/charStreamEx1.txt";
		
		try(FileWriter fw = new FileWriter(fileName)){
			String str = "안녕하세요";
			
			for(int i=0; i<str.length();i++) {
				fw.write(str.charAt(i));
				
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}catch(IOException e) {
			System.out.println("파일 작업 중 예외 발생");
		}
		
		try(FileReader fr = new FileReader(fileName)){
			while(true) {
				char ch = (char)fr.read();
				System.out.println(ch);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없다");
		}catch(IOException e) {
			System.out.println("파일 읽기 종료");
		}

	}

}
