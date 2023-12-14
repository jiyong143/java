package DAY04;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		/* Up Down 게임을 구하세요
		 * 다음과 같은 메뉴를 가져야한다
		 * 1. 새게임 : 업다운 게임 시작 (랜덤으로 생성된 숫자 맞추는 게임)
		 * 2. 최고기록 확인 : 역대 게임 중 가장 적게 맞춘 횟수를 알려줌
		 * 3. 프로그램 종료 : 게임 종료 */
		
		Scanner scan = new Scanner(System.in);
		int menu=0;
		int count = 0 , record = -1;
		int r;
		int num;
		int min = 1, max = 100 ; 
		
		do {
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			menu = scan.nextInt();
			
			
			if(menu==1) {
				r = (int)(Math.random( )*(max-min+1)+min);
				num = min - 1;
				
				for(;num != r;) {
					System.out.println("정수 입력 하세요:");
					num = scan.nextInt();
					
					if(num>r) {
						System.out.println("Down!");
					}else if(num<r) {
						System.out.println("Up!");
					}else {
						System.out.println("정답입니다!!");
					}
					count = count +1;
					
				}if(count<record||record==-1) {
					record = count;
				}
				System.out.println();
				}
			else if(menu==2) {
					System.out.print("최고 기록 : " + record);
					System.out.println();
				}
			else {
				System.out.println("프로그램 종료");
			}
		}while(menu != 3);
		System.out.println("프로그램을 종료합니다.");
	}
}
			
			
			
			
			
			
			
			
		
	
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


