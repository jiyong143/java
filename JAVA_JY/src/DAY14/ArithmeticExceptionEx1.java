package DAY14;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx1 {

	
	
	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 산술연산하는 코드 작성
		// 단, 0으로 나눌때 예외처리 적용
		
		
		
		System.out.print("두 정수와 산술 연산자를 입력하세요(예 1+2) : ");
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		int num1=scan.nextInt();
		char opt = scan.next().charAt(0);
		int num2 =scan.nextInt();
		double res =0;
				
		
		switch(opt) {
		case '+' :
			
			res=num1+num2;
			
			break;
			
		case '-' :
			
			res=num1-num2;
			
			break;
			
		case '*' :
			res=num1*num2;
			
			break;
			
		case '/' :
			res=num1/num2;
			break;
			
		case '%' :
			res=num1%num2;
			break;
		}
		String pattern = "{0} {1} {2} = {3}";
		System.out.println(MessageFormat.format(pattern, num1,opt,num2,res));
		
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(InputMismatchException e) {
			System.out.println("입력을 잘못했습니다");
		}		
		
	}

}
