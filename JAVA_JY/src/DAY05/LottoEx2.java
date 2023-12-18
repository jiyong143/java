package DAY05;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		/* 로또 당첨 번호를 랜덤으로 생성한 후(당첨 번호 6자리 + 보너스 번호)
		 * 사용자가 로또번호를 입력하면(로또 번호 6자리) 당첨 등수를 출력하는 코드를 작성하시오 */
		
		// 7개짜리 배열을 만들어 로또 당첨 번호를 랜덤으로 생성 - 1번 배열
		
		// 위에서 생성한 배열 중 0번지부터 6개를 새로운 배열에 복사 - 2번 배열
		
		// 1번 배열 6번지에 있는 값을 보너스로 지정 - 보너스 번호
		
		// 2번 배열 정렬 후 출력
		
		// 사용자 번호를 입력(6개)해서 배열에 저장 - 3번 배열
		
		// 당첨 개수 확인(이중 반복문)
		
		// 당첨 개수에 따른 등수를 출력
		
		
		int arr1 [] = new int[7];
		
        int min = 1,max=45;
		
		int count = 0;
				
		while(count<arr1.length) {
			
			int r = (int)(Math.random( )*(max-min+1)+min);
			
			int i;
			for(i =0;i<count;i++) {
				if(arr1[i] == r) {
					break;
				}
			}
			
			if(i == count) {
				arr1[count++] = r;
				
			}
		}
		
		int bonusnum;
		
		int arr2 []=new int[6];
		System.arraycopy(arr1, 0, arr2, 0, 6);
		
		bonusnum = arr1[6];
		
		Arrays.sort(arr2);
		
		for(int i =0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print(" 1 부터 45 사이의 번호를 중복 없이 7개 입력 : ");
		
		int arr3[] = new int[7];
		
		for(int i =0; i<arr3.length;i++) {
			arr3[i] = scan.nextInt();
		}
		
		int num = 0;
		
		for(int i=0 ;i<arr2.length;i++ ) {
			for(int j =0;j<arr3.length;j++) {
				if(arr2[i]==arr3[j]) {
					num = num +1;
				}				
			}
		}
		for(int i = 0; i<=6;i++) {
			if(num==i) {
				System.out.println((7 - i) + "등 입니다. ");				
			}
		}
	}
}