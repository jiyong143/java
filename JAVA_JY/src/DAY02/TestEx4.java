package DAY02;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		// 성인 판별 예제
		
		/*나이를 입력받아 나이가 20세 이상아면 성인으로 출력
		 * 미만이면 미성년자 출력
		 */
		
		
		System.out.println("나이를 입력하세요 : ");
		
		int age = scan.nextInt();
		if(age>=20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
		}
	}