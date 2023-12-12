package DAY03;

import java.util.Scanner;

public class SwitchEx2 {

	//Switch문 예제
	public static void main(String[] args) {
		//정수를 입력받아 입력받은 정수의 홀짝을 판별하는 예제를 switch문을 이용하여 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		
		int num = scan.nextInt();
		
		switch(num % 2) {
		case 0 :
			System.out.println(num + "는 짝수");
			break;
			
		default :
			System.out.println(num + "는 홀수");					
		}		
		scan.close();						
	}
}
