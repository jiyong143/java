package DAY04;

public class GcdEx2 {

	public static void main(String[] args) {
		/* 두 정수의 공약수를 출력하는 코드 작성 */
				
		int i;
		int num;
		int num1 = 12; 
		int num2 = 36; 
		
	    num = Math.min(num1, num2);
	    
	    System.out.println(num1 + " 과 " + num2 + "의 공약수 : ");
				
		for(i= 1; i <= num ; ++i) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
			}
			}		
		}
	}