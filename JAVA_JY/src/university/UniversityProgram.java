package university;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniversityProgram implements Program {
	
	static Scanner scan= new Scanner(System.in);
	
	static final int EXIT=4;
	

	// 전체 실행 메서드
	@Override
	public void run() {
		System.out.println("kh대학교 프로그램을 실행합니다.");
		printPositionMenu();
		try {
		int menu=scan.nextInt();
		runMenu(menu);
		}catch(InputMismatchException e) {
			System.out.println("잘못된 메뉴를 입력했습니다.");
		}
	}

	private void printPositionMenu() {
		// TODO Auto-generated method stub
		
	}

	// 주메뉴 실행 메서드
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1 :
			manager(); // 최지용
			
			break;
			
		case 2 :
			professor(); // 최병호
			
			break;
			
		case 3 :
			
			student(); //조민석
			
			break;
			
		case 4 :
			return;
			
		default :
			throw new InputMismatchException();
		}
		
	}

	// 학생 신분 선택시 실행 메서드
	private void student() {
		// TODO Auto-generated method stub
		
	}

	private void professor() {
		// TODO Auto-generated method stub
		
	}

	private void manager() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	

}
