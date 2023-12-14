package DAY04;

public class LcmEx1 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드 작성 */
		
		int i;
		int num1 = 10, num2 = 15;
		int num;
		
		num = Math.max(num1, num2);
		
		
		for(i = num ;;i=i+1) {
			if(i % num1 ==0 && i % num2 == 0) {
				System.out.println(num1 + " 과 " + num2 + "의 Lcm은 : " + i );
				break;			
			}
		}
	}
}
