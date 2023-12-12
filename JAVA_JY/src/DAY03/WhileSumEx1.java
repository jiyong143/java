package DAY03;

public class WhileSumEx1 {

	public static void main(String[] args) {
		/* 1부터 5 까지의 합을 구하는 코드 작성
		 */
		
		int sum = 0;
		int i = 1;
		int count =100;
		while(i <=count) {
			sum = sum + i;
			++i;			
		}
		System.out.println(sum);		
		}
	}


