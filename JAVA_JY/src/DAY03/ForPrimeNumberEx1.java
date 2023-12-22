package DAY03;

import java.util.Scanner;

public class ForPrimeNumberEx1 {

	public static void main(String[] args) {
		/* 소수 판별 예제 
		 * 입력한 정수가 소수인지 아닌지 판별하는 코드 작성 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int num = scan.nextInt();
			
		int count = 0;
		
		int i ;
		
		for(i=1; i<=num ; i = i +1) {
			if(num % i ==0) {
				
				count = count +1; // count 는 num 의 약수 개수
			}
										
			}
		if(count == 2) {
			System.out.println(num + "는 소수입니다.");
		}else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
		
	}
	
}
						
		
		
		
		
		
		
	


