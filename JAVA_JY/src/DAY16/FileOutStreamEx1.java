package DAY16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamEx1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		String filename = "sec/DAY16/fileEx2.txt";
		
		try {
		
		fos= new FileOutputStream(filename);
		
		for(int i =0;i<26;i++) {
			fos.write((char)('A'+i));
		}
		}catch(FileNotFoundException e) {
			System.out.println(filename + "을 찾을 수 없다");
		}catch(IOException e) {
			System.out.println("파일을 닫을 수 없다");
			
		}
		
		

	}

}
