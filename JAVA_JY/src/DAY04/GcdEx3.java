package DAY04;

public class GcdEx3 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수 구하는 코드 작성 */
		
		int i;
		int num1 = 15;
		int num2 = 20;
		int num;
		
		num = Math.min(num1, num2);
		
		for(i =num1;i>=1;i--) {
			if(num1 % i ==0 && num2 % i ==0) {
				System.out.println(num1 + "과 " + num2 + "의 Gcd : " + i);
				break;
			}
		}		
	}
}
