package DAY02;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력 받아서
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하시오
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("산술연산자를 입력하시오.");
		
		char opt = scan.next().charAt(0);
		
		System.out.println("첫 번째 정수를 입력하시오.");
		
		int num1 = scan.nextInt();
		
		System.out.println("두 번째 정수를 입력하시오.");
		
		int num2 = scan.nextInt();
		
		
		if(!(opt == '+' || opt == '-' || opt == '%' || opt == '/' || opt == '*')){
			System.out.println("잘못된 연산자");
		}else if(opt == '+') {
			System.out.println(num1 + " " + opt + " " + num2 + " = " + (num1 +num2));
		}else if(opt == '-') {
			System.out.println(num1 + " " + opt + " " + num2 + " = " + (num1-num2));
		}else if(opt == '%') {
			System.out.println(num1 + " " + opt + " " + num2 + " = " + (num1%num2));
		}else if(opt == '/') {
			System.out.println(num1 + " " + opt + " " + num2 + " = " + (num1/num2));
		}else if(opt == '*') {
			System.out.println(num1 + " " + opt + " " + num2 + " = " + (num1*num2));
		}
			
			
		}
			
		}
		
		
		
		 



