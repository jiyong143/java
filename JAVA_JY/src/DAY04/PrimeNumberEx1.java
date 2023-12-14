package DAY04;

public class PrimeNumberEx1 {

	public static void main(String[] args) {
		/* 2부터 100사이의 모든 소수를 출력하는 예제
		 * 소수 판별 예제 이용 */
		
		int count = 0;
		int i,j;
		for(i=2;i<=100;i++) {
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count= count+1;				
				}
			}
			if(count==2) {
				System.out.print(i + " ");
			}
			count = 0; // 초기화 하는거 잊지말기
		}
	}
}