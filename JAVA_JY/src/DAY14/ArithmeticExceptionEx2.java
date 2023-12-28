package DAY14;

import java.text.MessageFormat;
import java.util.Scanner;

public class ArithmeticExceptionEx2 {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력받아 결과를 출력하는 메서드를 구현하자
		// 단, 메서드를 이용하고, throws 와 throw 이용하기
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("두 정수와 산술 연산자 입력 :  ");
				
		try {
		
		int num1 = scan.nextInt();
		
		char opt = scan.next().charAt(0);
		
		int num2 = scan.nextInt();
		
		double res= Calculate(num1,opt,num2);
		
		String pattern = "{0} {1} {2} = {3}";
		System.out.println(MessageFormat.format(pattern, num1,opt,num2,res));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
			
	public static double Calculate(int num1, char opt, int num2) throws RuntimeException{
		
		
		
		switch(opt) {
		
		case '+' :
			return num1 + num2;
			
		case '-' :
		
		    return num1-num2;
		    
		case '*' :
			return num1*num2;
			
		case '%' :
			
			if(num2==0) {
				throw new ArithmeticException("0으로 나눌 수 없다");
			}
			return num1%num2;
			
		case '/' :
			if(num2==0) {
				throw new ArithmeticException("0으로 나눌 수 없다");
			}
			
			
			return num1/(double)num2;
			
		default :
			throw new RuntimeException(opt + "는 산술 연산자가 아닙니다.");
			
		}
	}
}
		
		
		
		
	
			
		
		
		
		
	
		
		
	
	
	
	
	
	


