package DAY04;

import java.util.Scanner;

public class InfiniteLoopEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			System.out.println("정수 출력 : " + num);
		}
		
	}// 무한루프가 발생하는 코드 아래에 있는 코드는 에러 발생

}
