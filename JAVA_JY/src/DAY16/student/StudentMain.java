package DAY16.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


import lombok.AllArgsConstructor;
import lombok.Data;

public class StudentMain {
	
	
	static Scanner scan = new Scanner(System.in);
	
	static List<Student> list = new ArrayList<Student>();
	

	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램을 만드세요
		 * - 학생 관리 프로그램
		 * -기능
		 * 1. 학생 추가
		 * 2. 학생 조회(전체)
		 * 3. 종료
		 * - 학생은 학년,반,번호,이름을 가진다
		 * - 저장 기능과 불러오기 기능을 통해 학생 정보들을 유지( 이것이 이전과는 다른 점)
		 */
		
		
		
		
		int menu=0;
		
		String fileName = "src/DAY16/student/list.txt";
		
		load(fileName);
		
		do {
			try {
			printMenu();
			
			 menu = scan.nextInt();
			
			runMenu(menu);			
			}catch(Exception e) {
				System.out.println("예외 발생");
			}
				
			
		}while(menu!=3);
		
		save(fileName);
		
		
		

	 
		
		
	}
	
	
	
	private static void save(String fileName) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(list);
		
		} catch (IOException e) {
			System.out.println("저장 실패");
			
		}
		
	}



	private static void load(String fileName) {
		
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (List<Student>)ois.readObject();
			System.out.println("학생 정보 불러옴");
			
		} catch (Exception e) {
			System.out.println("불러오기 실패");
			
		}
		
	}



	private static void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			insertStudent();
			
			
			
			
			break;
			
		case 2 :
			
			
			System.out.println("학생 조회");
			
			
			
			break;
			
		case 3 :
			
			System.out.println("프로그램 종료");
			
			break;	
			
		default :
			
			throw new RuntimeException();
			
			
			
			
		}
		
		
		
	}
	
	
	
	private static void insertStudent() {
		
		System.out.println("학생 추가");
		System.out.print("학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.print("반 : ");
		
		int classNum = scan.nextInt();
		
		System.out.print("번호 : ");
		
		int num = scan.nextInt();
		
		System.out.print("이름 : ");
		
		String name = scan.next();
		
		Student std = new Student(grade, classNum, num ,name);
		
		if(!list.contains(std)) {
			list.add(std);
			
			System.out.println("학생 추가");
			return;
			
		}
		
		System.out.println("등록된 학생");
		
	}



	private static void printMenu() {

		
		System.out.println("-------");
		System.out.println("메뉴");
		System.out.println("1.학생 추가");
		System.out.println("2.학생 조회");
		System.out.println("3.종료");
		System.out.println("-------");
		System.out.println("메뉴 선택 : ");
		
	}

	
	
	private static void printStudent() {
	
	list.stream().forEach(s->System.out.println(s));
	
	}
	
	
	
	
	
	
	
	

	
	
}



