package DAY03;


public class ForPrimeNumberEx1 {

	public static void main(String[] args) {
		/* 소수 판별 예제 
		 * 입력한 정수가 소수인지 아닌지 판별하는 코드 작성 */
		
			
		int num = 4524;
		
		int count = 0;
		
		int i;
		
		for(i=1; i<=num ; i = i +1) {
			if(num % i ==0) {
				
				count = count +1;
			}
										
			}
		if(count == 2) {
			System.out.println(num + "는 소수입니다.");
		}else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
		
	}
	
}
			
			
		
		
		
		
		
		
	


