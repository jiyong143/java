package DAY05;

import java.util.Scanner;

public class ThirstyOneEx1 {

	public static void main(String[] args) {
		/* 사용자와 컴퓨터가 돌아가면서 최대 3개의 숫자를 부르고, 
		 * 31을 입력한 사용자 또는 컴퓨터가 지는 게임을 작성하세요
		 * 예
		 * computer : 1 2 3
		 * 정수 : 2
		 * user : 4 5
		 * computer : 6
		 * 정수 : 3
		 * user : 7 8 9 
		 * ...
		 * computer : 31  */
		
		int num;
		
		int currentnum = 0;
		
		for(; currentnum <31;) {
			int min = 1, max = 3;
			int r = (int)(Math.random()*(max-min+1)+min);
			if(currentnum+r>=31) {
				System.out.println(31);
				System.out.println("컴퓨터 패배");
			}else {
			
			
			
			currentnum= currentnum + r;
			
			
			System.out.println(currentnum);
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("정수 입력(1~3) :");
			
			num = scan.nextInt();
			
			currentnum=currentnum + num;
			
			System.out.println(currentnum);
			}
			
			if(currentnum>=31) {
				System.out.println(31);
				System.out.println("내가 짐");
			}
			
		}
	}
}