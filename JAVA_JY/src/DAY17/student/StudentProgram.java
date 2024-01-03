package DAY17.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentProgram implements Program {
	
	private StudentManager sm = new StudentManager();
	
	static Scanner scan = new Scanner(System.in);
	
	private final int EXIT = 3;

	@Override
	public void run() {
		int menu=0;
		
		String fileName="src/DAT17/student/student.txt";
		// 불러오기
		load(fileName);
		
		do {
						
			printMenu();
			try {
			menu = scan.nextInt();
			
			runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴 입력");
				scan.nextLine();
			}
			
			
		}while(menu!=EXIT);
		
		save(fileName);// 저장
	}

	private void save(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(sm.getList());
			System.out.println("저장하기 성공");
		} catch (FileNotFoundException e) {
			System.out.println("지정된 위치에 파일을 찾을 수 없습니다");
			
		} catch (IOException e) {
			System.out.println("저장에 실패 했습니다");
			
		}
		
	}

	private void load(String fileName) {
		
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
				sm.setList((ArrayList<Student>)ois.readObject());
				
				System.out.println("불러오기 성공");
			} catch (FileNotFoundException e) {
				System.out.println("지정된 위치에 파일을 찾을 수 없습니다");
				
			} catch (IOException e) {
				System.out.println("불러오기에 실패 했습니다");				
			}
	}
		
	
	@Override
	public void runMenu(int menu) {
		
		switch(menu) {
		case 1 :
			insertStudent();
			break;
			
		case 2 : 
			sm.printAll();
			
			break;
			
		case 3 :
			System.out.println("프로그램을 종료합니다");
			break;
			
		default :
			
			throw new InputMismatchException();			
		}		
		
	}

	
	
	private void insertStudent() {
		// 학생 정보 입력
		System.out.println("학년 : ");
		int grade = scan.nextInt();
		System.out.println("반 : ");
		int classNum = scan.nextInt();
		System.out.println("번호 : ");
		int num = scan.nextInt();
		System.out.println("이름 : ");
		String name = scan.next();
		// 학생 객체 생성
		
		Student std = new Student(grade,classNum,num,name);
		
		if(sm.insertStudent(std)) {
			System.out.println("학생을 추가 했습니다.");
			return;
		}
		
		System.out.println("이미 등록된 학생입니다");
		
	
		// 추가를 해서 성공하면 성공 알림, 실패하면 실패 알림	
	}

	@Override
	public void printMenu() {
		System.out.println("-------");
		System.out.println("메뉴");
		System.out.println("1.학생 추가");
		System.out.println("2.학생 조회[전체]");
		System.out.println("3.종료");
		System.out.println("-------");
		System.out.println("메뉴 선택 : ");
		
	}

	
	
	
	
}
