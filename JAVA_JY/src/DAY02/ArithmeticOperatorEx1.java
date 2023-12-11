package DAY02;

public class ArithmeticOperatorEx1 {
    //산술 연산자 예제
	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		System.out.println(num1 + " + "+ num2 + " = "+ (num1 + num2));
		
		
		System.out.println(num1 + " + "+ num2 + " = "+ (num1 + num2));
		System.out.println(num1 + " - "+ num2 + " = "+ (num1 - num2));
		System.out.println(num1 + " * "+ num2 + " = "+ (num1 * num2));
		System.out.println(num1 + " / "+ num2 + " = "+ (num1 / (double)num2));
		System.out.println(num1 + " / "+ num2 + " = "+ (num1 / num2));
		System.out.println(num1 + " % "+ num2 + " = "+ (num1 % num2));
		
		// /와 %는 0으로 나눌 수 없다. 그러나 예외가 발생할 수 있다
		
		num2 = 0;
		System.out.println(num1 + " / "+ num2 + " = "+ (num1 / num2));// 정수 / 0 은 예외 발생
		
		System.out.println(num1 + " / "+ num2 + " = "+ (num1 / (double)num2)); // 이것도 예외
		
		
	}

}

