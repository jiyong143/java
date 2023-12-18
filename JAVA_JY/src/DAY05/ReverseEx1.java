package DAY05;

import java.util.Scanner;

public class ReverseEx1 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를  작성
		 * 예
		 * 입력 : 1234
		 * 출력 : 4321 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		
		int num = scan.nextInt();
		
		// tmp 에 num 을 복사
		
		int tmp = num;
		
		// 넉넉히 10개 짜리 배열 arr 을  선언
		
		int arr[] = new int[10];
		
		// 추출되어 저장된 개수를 의미하는 count 변수를 선언
		
		int count = 0;
		
		//반복문(tmp가 0이 아닐 때까지)
		
		while(tmp != 0) {
			arr[count] = tmp %10;
			count++;
			tmp /= 10; // tmp = tmp /10			
		}
		System.out.print("결과 : ");
		for(int i =0;i<count;i++) {
			System.out.print(arr[i]);			
		}
		scan.close();
	}
}