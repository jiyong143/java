package DAY07;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램을 작성하세요. 메서드 이용
		 * 메뉴
		 * 1. 새 게임
		 * 2. 결과 조회
		 * 3. 프로그램 종료
		 * 메뉴 선택 :1
		 * -----------------
		 * 선택(홀 :1, 짝 :0) :1
		 * 3 홀수입니다
		 * 성공 !
		 * -----------------
		 * 메뉴 선택 :2
		 * 결과 : 1승 0패
		 * -----------------
		 * 메뉴 선택 : 3
		 * 프로그램 종료 */

		int menu=0;
		Scanner scan = new Scanner(System.in);
		int win=0;
		int lose =0;
			
		do {
						
			printMenu();
						
			menu=scan.nextInt();
			
			System.out.println("------------");
			
			switch(menu) {
			case 1 :
				
				boolean result = newGame();
								
				if(result) {
					System.out.println(" 승 ");
					win++;
				}else {
					System.out.println(" 패 ");
					lose++;
				}
				
				break;
				
			case 2 :
				
				printRecord(win,lose);
								
				break;
				
			case 3 :
				System.out.println(" 프로그램 종료 선택 ");
				
				break;
				
			default :
				System.out.println(" 잘못된 메뉴 선택 ");									
			}
						
		}while(menu!=3);
		System.out.println("프로그램을  종료합니다");
		
	}
			
	//새게임 메서드
	
	public static boolean newGame() {
		
		int r = random(1,100);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("선택(0은 짝, 1은 홀) : ");
		int user = scan.nextInt();
		System.out.println(r + " 는 " + (r%2==0 ? "짝 ": "홀") + " 수 입니다.");
		
		return r%2 ==user;		
	}
	
	// 메뉴 출력 메서드
	
	public static void printMenu() {
		System.out.println("=============");
		System.out.println("메뉴");
		System.out.println(" 1. 새 게임 ");
		System.out.println(" 2. 기록 확인 ");
		System.out.println(" 3. 프로그램 종료 ");
		System.out.print(" 메뉴 선택 : ");
		
	}
	
	// 기록 출력 메서드
	
	public static void printRecord(int win, int lose) {
		System.out.println(win + "승" + lose + "패");
	}
		
	// min 과 max 사이의 랜덤한 수를 생성하는 메서드	
		
	public static int random(int min, int max) {
		if(max<min) {
			int tmp = max;
			max=min;
			min=tmp;
		}
				
		return (int)(Math.random()*(max-min+1)+min);
	}	
	
}