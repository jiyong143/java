package DAY05;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int kor1, kor2, kor3, kor4, kor5; // 배열을 사용하는 경우는 반복문 사용불가
		kor1 = scan.nextInt();
		
		// 학생 5명의 국어 성적을 저장하기 위한 배열 사용 : 똑같이 5줄이지만, 반복문 사용 편이
		
		int [] korScores = new int[5];
		
		korScores[0] = scan.nextInt();
		korScores[1] = scan.nextInt();
		korScores[2] = scan.nextInt();
		korScores[3] = scan.nextInt();
		korScores[4] = scan.nextInt();
		
		for(int i =0;i<=4;i++) {
			System.out.print("학생" + (i+1) + " 성적 : ");
			korScores[i] = scan.nextInt();
		}
		
		for(int i = 0; i<=4;i++) {
			System.out.println("학생" + (i+1) + "성적 : " + korScores[i]);
		}
		
		scan.close();
	}

}
