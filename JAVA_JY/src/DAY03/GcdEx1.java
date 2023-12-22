package DAY03;

public class GcdEx1 {

	public static void main(String[] args) {
		/* 정수의 약수를 출력하는 예제를 작성하시오
		 * 4의 약수는 : 1,2,4 */
		
		int num = 84;
		
		for(int i = 1; i<= num ; i = i +1) {
			if(num% i != 0) {
				continue;
			}
			
			System.out.print(i + " ");															
		}		
	}
}
