package DAY03;

public class WhileTestEx3 {

	public static void main(String[] args) {
		/* 1에서 10 사이의 모든 짝수를 순서대로 출력하는 코드 작성
		 */
		
		int n = 10;
			
		int i = 2;

		while(i<=n) {
			System.out.println(i);
			i +=2;			
		}
		
		int a = 1;
		int b = 10;
		
		while(a<=b) {
			if(a % 2 ==0) {
				System.out.println(a);
			}++a;
			}
			
			
		}
	}

