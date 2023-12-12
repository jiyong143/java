package DAY03;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("산술연산자 입력 : ");
		
		char opt = scan.next().charAt(0);
		
		System.out.println("첫 번째 정수를 입력하시오");
		
		int num1 = scan.nextInt();
		
		System.out.println("두 번째 정수를 입력하시오");
		
		int num2 = scan.nextInt();
		
		
		switch(opt) {
		
		case '+' :
			System.out.println(num1 + " " + opt + " " + num2 + " " + " = " + (num1 + num2));
		break;
		
		case '-' :
			System.out.println(num1 + " " + opt + " " + num2 + " " + " = " + (num1 - num2));
		break;
		
		case '*' :
			System.out.println(num1 + " " + opt + " " + num2 + " " + " = " + (num1 * num2));
		break;
		
		case '/' :
			System.out.println(num1 + " " + opt + " " + num2 + " " + " = " + (num1 /(double) num2));
		break;
		
		case '%' :
			System.out.println(num1 + " " + opt + " " + num2 + " " + " = " + (num1 % num2));
		break;
		
		default :
			System.out.println("잘못된 연산자 입력");
			
		}
		
		scan.close();		
						
	}

}
