package DAY15;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapEx2 {
	
	
	static Scanner scan = new Scanner(System.in);
	
	static Map<String,String>map= new HashMap<String,String>();

	public static void main(String[] args) {
		/* 회원을 관리하는 프로그램 작성
		 * 메뉴
		 * 1. 회원 가입
		 *  - 아이디와 비번만 입력
		 *  - 이미 가입된 회원인지 체크(containsKey)
		 * 2. 회원 검색
		 * - 아이디를 입력해서 회원 정보를 조회
		 * 3. 종료
		 */
		
		int menu=0;
		
		do {
			
			printMenu();
			
			try {
				
			
			menu = scan.nextInt();
			
			runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴 입니다.");
				scan.nextLine(); // 잘못 입력된 값을 문자열로 가져와서 버림
			}
			
				
		}while(menu!=3);
				
	}

	
	public static void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			signUp();
			
			break;
			
		case 2 :
			
			searchMember();
			
			break;
			
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default :
			throw new InputMismatchException();
				
										
		}		
	}


	// 회원 검색 메서드
	
	private static void searchMember() {
		
		System.out.println("아이디 입력 : ");
		
		String id =scan.next();
		
		String pw=map.get(id);
		
		if(pw==null) {
			System.out.println("등록되지 않은 아이디입니다");
			return;
		}
		
		System.out.println("아이디 : " + id + ", 비번 : " + pw);		
	}

	
	// 회원 가입 메서드

	public static void signUp() {
				
		System.out.println("아이디 : ");
		
		
		String id = scan.next();
		
		if(map.containsKey(id)) { // if(map.get(id)!=null)
			System.out.println("이미 가입된 아이디입니다.");
			return;
		}
		
		System.out.println("비번 : ");
				
		String pw = scan.next();
		
		map.put(id, pw);
					
	}

	// 메뉴 출력 메서드

	public static void printMenu() {
		
		System.out.println("-------");
		System.out.println(" 메뉴 ");
		System.out.println(" 1. 회원 가입 ");
		System.out.println(" 2. 회원 검색 ");
		System.out.println(" 3. 종료 ");
		System.out.println("-------");
		System.out.print(" 메뉴 선택 : ");
		
	}
}
