package DAY13;

import java.util.Scanner;

public class StringEx2 {
	
	
	static Scanner scan = new Scanner(System.in);
	
	static String [] list = new String [30];
	
	static int count = 0; // 현재 문장의 개수

	public static void main(String[] args) {
		/* 문장들을 입력받아 배열에 저장하고, 특정 단어가 들어가 있는 문장들을
		 * 출력하는 프로그램을 작성
		 * 메뉴
		 * 1. 문장 추가
		 * 2. 검색
		 * 3. 종료
		 */
		
		/* 안녕하세요
		 * 테스트
		 * 만나서 반갑습니다.
		 * 나는 홍길동입니다.
		 * 
		 * 나로 검색
		 * 
		 * 만나서 반갑습니다.
		 * 나는 홍길동입니다.
		 */
		
		int menu;
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu);			
			
		}while(menu!=3);
		System.out.println("프로그램을 종료합니다");
				
	}


	public static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			insertString();
			
			break;
			
		case 2 :
			searchSting();
			
			break;
			
		case 3 :
			System.out.println("프로그램 종료");
			break;
			
		default :
			System.out.println("잘못된 메뉴 입력");
			
			
		}
		
	}


	public static void searchSting() {
		
		System.out.println("단어 입력 : ");
		String str = scan.next();
		
		for(String tmp : list) {
			if(tmp!=null && tmp.contains(str)) {
				System.out.println(tmp);
			}
			if(tmp!=null && tmp.indexOf(str)>=0) {
				System.out.println(tmp);
			}
		}
		
	}
		
	public static void insertString() {
		System.out.println("문장 추가");
		System.out.print(" 문장 입력 : ");
		scan.nextLine();
		String str = scan.nextLine();
		
		list[count]=str;
		count++;
		
	}

	public static void printMenu() {
		System.out.println("---------");
		System.out.println(" 메뉴 ");
		System.out.println(" 1. 문장 추가 ");
		System.out.println(" 2. 검색 ");
		System.out.println(" 3.  종료 ");
		System.out.println("---------");
		System.out.print(" 메뉴 선택 : ");		
	}	

}



