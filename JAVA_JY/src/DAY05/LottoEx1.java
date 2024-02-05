package DAY05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1~45 사이의 랜덤한 수 6개를 생성하여 출력하는 예제를 작성(중복 되지 않는)
		 * 단, 정렬이 되도록 */
		
		int min = 1,max=45;
		
		int count = 0;
		
		int arr [] = new int[6];
		
		while(count<arr.length) {
			
			int r = (int)(Math.random( )*(max-min+1)+min);
			
			int i;
			for(i =0;i<count;i++) {
				if(arr[i] == r) {
					break;
				}
			}
			
			if(i == count) {
				arr[count++] = r;
				
			}
		}
		
		
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
