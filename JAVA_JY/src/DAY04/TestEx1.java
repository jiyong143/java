package DAY04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* Scanner를 이용하여 국,영,수 성적을 입력받고,
		 * 총점과 평균을 구하는 코드를 작성 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적 입력 (국, 영 , 수 순) : ");
		

		int kor =scan.nextInt();
		
		int eng =scan.nextInt();
		
		int math =scan.nextInt();
		
		
		int sum = kor + eng + math;
		
		double avg = (double)sum / 3;
		
		System.out.println("총점 : " +  sum + " , " + "평균 : " + avg);
	}

}