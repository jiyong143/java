package DAY03;

import java.util.Scanner;

public class ForUpDownEx1 {

	public static void main(String[] args) {
		
		/* 숫자 업다운 게임을 작성하세요*/
		
		int min = 1, max = 100 ;
		
		int r = (int)(Math.random( )*(max-min+1)+min);
		
		Scanner scan = new Scanner(System.in);
		
		int num = min - 1;
		
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
		}
	}
}
			
			
			
			

		
		
		
		
		
		
		
		
		