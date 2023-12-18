package DAY05;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		/* 1 에서 9 사이의 정수를 5개 입력받아 각 숫자가 몇개씩 입력됐는지 출력하는 코드 작성 */
		
		int arr[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1에서 9 사이의 정수를 5개 입력 :");
		
		for(int i = 0 ; i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		
		int count=0;
		
		for(int i =1;i<=9;i++) {
			for(int j =0;j<arr.length;j++) {
				if(i==arr[j]) {
					count = count +1;
										
				}
			}System.out.print(i + " : " + count + " 개 " + " ");
			count = 0;					
		}
	}
}
