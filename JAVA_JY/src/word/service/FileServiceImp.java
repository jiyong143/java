package word.service;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import DAY10.word.Word;

public class FileServiceImp implements FileService {

	
	
	public boolean save(String fileName , List<Word> list) {
		
		try(ObjectOutputStream oos=
			new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(list);
			return true;
			
		}catch(Exception e) {
			
		}
		return false;
	}
	
	
}
