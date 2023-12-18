package DAY06;

import java.util.Scanner;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		/* 랜덤으로 산수(+,-,*) 문제를 생성하여 맞추는 게임 
		 * 단, 숫자 범위는 1~99, 연산자는 + ,- , */
		
		
		int num1, num2, num3 ;
		
		int min =1, max = 99;
		num1 = (int)(Math.random()*(max-min+1)+min);
		num2 = (int)(Math.random()*(max-min+1)+min);
		num3 = (int)(Math.random()*3+1);
				
		Scanner scan = new Scanner(System.in);
		
		if(num3==1) { 
			
			System.out.print(num1 + " + " + num2 + " = ");
		    int answer = scan.nextInt();
		    
		    if(num1+num2==answer) {
		    	System.out.println("정답");
		    }else {
		    	System.out.println("오답");
		    }			
		}
		
		if(num3==2) {
			 System.out.print(num1 + " - " + num2 + " = ");
			    int answer = scan.nextInt();
			    
			    if(num1-num2==answer) {
			    	System.out.println("정답");
			    }else {
			    	System.out.println("오답");
			    }			
		}
		
		if(num3==3) {
			 System.out.print(num1 + " * " + num2 + " = ");
			    int answer = scan.nextInt();
			    
			    if(num1*num2==answer) {
			    	System.out.println("정답");
			    }else {
			    	System.out.println("오답");
			    }
		}
	}
}