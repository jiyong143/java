package DAY05;

import java.util.Scanner;

public class ArrayScoreEx1 {

	public static void main(String[] args) {
		/* 학생 5명의 국어 성적을 입력 받고, 총점과 평균을 구하는 코드 작성 */
		
		int sum =0;
		double avg;
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 5명의 국어 성적을 입력하시오 : ");
		
		
		
		int [] korScores = new int[5];
		
		korScores[0] = scan.nextInt();
		korScores[1] = scan.nextInt();
		korScores[2] = scan.nextInt();
		korScores[3] = scan.nextInt();
		korScores[4] = scan.nextInt();
		
		
		
		
		for(i=0;i<5;i++) {
			sum = sum + korScores[i];			
		}
		System.out.println(" 총합 : " + sum + " , " + " 평균 : " + (double)sum /5);
		
		scan.close();		
	}
}
