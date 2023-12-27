package DAY13;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		
		Random random = new Random();// seed 값을 입력하면 동일한 결과 출력
		
		int min =1, max =9;
		
		for(int i =0; i<10;i++) {
			System.out.println(random.nextInt(max-min+1)+min);
		}

	}

}
