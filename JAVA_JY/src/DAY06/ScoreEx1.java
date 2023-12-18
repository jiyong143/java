package DAY06;

import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 성적 관리 프로그램을 작성하시오
		 * - 1반의 성적을 관리
		 * - 학생은 30명이라 생각
		 * - 성적은 번호순으로 관리
		 * 성적은 국, 영 ,수
		 * 메뉴
		 * 1. 성적 수정
		 * 2. 성적 조회
		 * 3. 프로그램 종료
		 * 메뉴 선택 :
		 * 
		 * ----성적 수정-----
		 * 
		 * 1. 국어
		 * 2. 영어
		 * 3. 수학
		 * 
		 * 학생 선택은 번호 입력
		 * 
		 * -----성적 조회-----
		 * 
		 * 1. 과목별 조회
		 * 2. 학생별 조회 */
		
		
		
		int menu= 1;
		int maxstudent =30;
		Scanner scan = new Scanner(System.in);
		int [] kor = new int[maxstudent];
		int [] eng = new int[maxstudent];
		int [] math = new int[maxstudent];
		
		
		do {
			System.out.println("================");
			System.out.println("메뉴");
			System.out.println(" 1. 성적 수정 ");
			System.out.println(" 2. 성적 조회 ");
			System.out.println(" 3. 프로그램 종료 ");
			System.out.print("메뉴를 입력하세요 : ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
			
				System.out.println("============");
				System.out.println("성적수정 기능 입니다.");
				
				System.out.println(" 1. 국어 ");
				System.out.println(" 2. 영어 ");
				System.out.println(" 3. 수학 ");
				System.out.print("과목 선택 : ");
				
				int subject = scan.nextInt();
				
				System.out.print("학생 번호 입력(1~30) : ");
				
				int num = scan.nextInt();
				
				System.out.print("수정할 성적을 입력하시오 : ");
				
				int score = scan.nextInt();
				
				switch(subject) {
				case 1 :
					kor[num-1] = score;
					break;
				case 2 :
					eng[num-1] = score;
					break;
				case 3 :
					math[num-1] = score;
					break;				
				}
								
				break;
				
				default :
					System.out.print("다시 과목 선택 : ");
				
			case 2 :
				System.out.println("=============");
				System.out.println("성적 조회 기능 입니다.");
				System.out.println("1. 과목별 조회");
				System.out.println("2. 학생별 조회");
				System.out.print("조회 방법 선택 : ");
				
				int submenu = scan.nextInt();
				
				switch(submenu) {
				case 1 :
					
					System.out.println("============");
					System.out.println("과목 별 조회");					
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.print("과목 선택 : ");
					
					int subsubject = scan.nextInt();
					
					switch(subsubject) {
					case 1 :
						for(int i =0;i<kor.length;i++) {
							System.out.print(kor[i]);
						}
						break;
					case 2 :
						for(int i =0;i<eng.length;i++) {
						System.out.print(eng[i]);
					}
						break;
						
					case 3 :
						for(int i =0;i<math.length;i++) {
							System.out.print(math[i]);
						}
						break;
						
					default :
						System.out.print("과목 다시 선택 : ");
					}
					
					break;
					
				case 2 :
					System.out.println("==========");
					System.out.println("학생별 조회");
					System.out.print("학생 선택(1~30) : ");
					
					int subnum = scan.nextInt();
					
					if(subnum > 30) {
						System.out.println("잘못된 번호 입력");
					}
					
					System.out.println(subnum + "번 학생의 성적 ");
					System.out.print("국어 : " + kor[subnum-1] + " 영어 : " + eng[subnum -1] + " 수학 : " + math[subnum -1]);
					
					break;
				}
				
			case 3 :
				System.out.println("==============");
				System.out.println("프로그램 종료 기능 입니다");
			}
		}while(menu!=3);
		System.out.println("프로그램을 종료합니다. ");
	}
}