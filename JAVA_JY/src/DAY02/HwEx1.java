package DAY02;

import java.util.Scanner;

public class HwEx1 {

	public static void main(String[] args) {
		/*성적을 입력받아서 성적에 맞는 학점을 출력하는 코드 작성
		 * 90이상 100이하 a
		 * 80이상 90미만 b
		 * 70이상 80미만 c
		 * 60이상 70미만 d
		 * 60미만 f
		 * 0보다 작거나 100보다 큰 경우 잘못된 점수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적을 입력하시오 :");
		
		int point = scan.nextInt();
		
		if(point < 0 || point >100) {
			System.out.println("잘못된 점수");
		}else if(point< 60) {
			System.out.println("학점:" + 'F');
		}else if(point < 70) {
			System.out.println("학점:" + 'D');
		}else if(point< 80) {
			System.out.println("학점:" + 'C');
		}else if(point< 90) {
			System.out.println("학점:" + 'B');
		}else {
			System.out.println("학점:" + 'A');
		}
		
		scan.close();
			
			
		}
		
		
	}


