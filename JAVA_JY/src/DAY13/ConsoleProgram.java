package DAY13;

import java.util.Scanner;


    //Program 인터페이스를 구현한 구현 클래스

	public class ConsoleProgram implements Program{
		
		private Scanner scan = new Scanner(System.in);
	
	
	
		@Override
		public void printMenu() {
			System.out.println("--------메뉴-------");
			System.out.println(" 1. 기능 1 ");
			System.out.println(" 2. 기능 2 ");
			System.out.println(" 3. 기능 3 ");
			System.out.println(" 4. 종료 ");
			System.out.println("------------------- ");
			System.out.print(" 메뉴 선택 : ");
			
			
		}

		@Override
		public void runMenu(int menu) {
			switch(menu) {
			case 1 :
				System.out.println(" 기능 1 실행 ");
				break;
				
			case 2 : 
				System.out.println(" 기능 2 실행 ");
				
				break;
				
			case 3 :
				System.out.println(" 기능 3 실행 ");
				break;
				
			case 4 :
				
				break;
				
			default :
				System.out.println(" 잘못된 메뉴 ");
				
			}
			
		}

		@Override
		public void printExit() {
			
			System.out.println(" --------------- ");
			System.out.println(" 프로그램 종료합니다. ");
			System.out.println(" --------------- ");
			
		}

		@Override
		public void run() {
			System.out.println("----------");
			System.out.println("프로그램 실행");
			System.out.println("----------");
			
			int menu;
			
			do {
				// 메뉴 출력
				printMenu();
				
				// 메뉴 입력
				
				menu = scan.nextInt();
				// 메뉴 실행
				runMenu(menu);
			
		}while(menu!=4);
			printExit();
		
		
		
		
	}

}
