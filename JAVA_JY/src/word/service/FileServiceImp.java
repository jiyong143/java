/*package word.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import DAY10.word.Word;

public class FileServiceImp implements FileService {

	
	@Override
	public boolean save() {
		
		try(ObjectOutputStream oos=
			new ObjectOutputStream(new FileOutputStream(fileName))){
			oos.writeObject(list);
			return true;
			
		}catch(Exception e) {
			
		}
		return false;
	}

	@Override
	public List<Word> load(String fileName) {
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(fileName))){
				return (List<Word>) ois.readObject();
			} catch (Exception e) {
			}
		return null;
	}
	
	
}*/
