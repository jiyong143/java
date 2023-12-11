package DAY02;

import java.util.Scanner;

public class IfMultiple {

	public static void main(String[] args) {
		
		
	//정수를 입력받아 3의 배수인지 아닌지 판별하는 코드 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int num = scan.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num + "는 3의 배수이다.");
		}else {System.out.println(num + "는 3의 배수가 아니다.");
		}
		
		}
		
		
		
		
	}


