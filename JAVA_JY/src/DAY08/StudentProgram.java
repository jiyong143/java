package DAY08;

import java.util.Scanner;

public class StudentProgram {

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
		
		
		
		// 학년, 이름은 생략하고 ,반은 1반으로 고정,
		// 번호는 각각 1번부터 5번으로 저장
		
		
		// 5명의 학생 정보를 저장할 수 있는 배열을 생성
		
		// 각 학생의 번호를 1부터 5까지 지정
		
		Student std = new Student();
		
        Student[] stds = new Student[5];
		
		for(int i =0;i<stds.length;i++) {
			stds[i]= new Student();
			stds[i].classNum = 1;
			stds[i].num = i+1;
		}
		
		/*int count =1; 
		 향상된 for 문으로 std를 다른 인스턴스로 교체하는 건 안되지만
		 * 멤버 변수 바꾸는 건 가능 */
		/* for(Student std : stds) {
			std.classNum = 1;
			std.num = count++;
			std.printInfo();
		} */
		
		
		
		
		int menu = 0;
		
		
		
		do {
			
			printMenu(); //메뉴 출력
			
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
					
		   
		
		   // 선택한 메뉴에 따른 기능 실행
			
			switch(menu) {
			case 1 :
				System.out.println(" 성적 수정 기능 구현 예정 ");
				
				updateScore(stds);
				
				break;
				
			case 2 :
				
				printScore(stds);
				
				break;
								
			case 3 :
				
				System.out.println(" 프로그램 종료 ");
				
				break;
				
			default :
				System.out.println(" 잘못된 메뉴 ");
			}			
			
		}while(menu!=3);
		System.out.println(" 프로그램을 종료합니다.");
		
	}
	
	// 메서드 정의 공간
	
	public static void printMenu() {
		System.out.println("================");		
		System.out.println("메뉴");
		System.out.println(" 1. 성적 수정 ");
		System.out.println(" 2. 성적 조회 ");
		System.out.println(" 3. 프로그램 종료 ");
		System.out.print(" 메뉴 선택 : ");		
	}
	
	
	/* 기능 : 학생 배열이 주어지면 정보를 입력받아 학생 성적을 출력하는 메서드
	 * 매개변수 :
	 * 리턴타입 : 
	 * 메서드명 : printScore */
	
	public static void printScore(Student [] stds) {
		
		System.out.println("---------");
		System.out.println("성적 조회");
		System.out.println("1. 과목 별 조회");
		System.out.println("2.학생 별 조회");
		System.out.println("----------");
		System.out.println("메뉴 선택 : ");
		
		Scanner scan = new Scanner(System.in);
		
		int menu = scan. nextInt();
		
		switch(menu) {
		case 1 :
			printScoreBySubject(stds);
			
			break;
			
		case 2 :
			printScoreByNum(stds);
			
			break;
			
		default :
			System.out.println("잘못된 메뉴 입니다.");
			
		}		
	}
	
	
	public static  void printScoreByNum(Student [] stds) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적을 조회할 학생 번호 입력 (1~5) : ");
		
	
		int num = scan.nextInt();
		
		for(Student std : stds) {
			if(std.num==num) {
				std.printScore();
				return;
			}
		}
		System.out.println("일치하는 학생 없음.");		
					
	}
	
	
	public static void printScoreBySubject(Student [] stds) {
		
		System.out.println(" 성적 조회할 과목을 선택 (국 1 , 영 2 , 수 3) : ");
		Scanner scan = new Scanner(System.in);
		
		int subject = scan.nextInt();
		
		for(Student std : stds) {
			switch(subject) {
			case 1 :
				System.out.println("번호 " + std.num + " , 국어 : " + std.kor);
				break;
				
			case 2:
				System.out.println("번호 " + std.num + " , 영어 : " + std.eng);
				break;
				
			case 3 :
				System.out.println("번호 " + std.num + " , 수학 : " + std.math);
			
			default :
				System.out.println("잘못된 과목입니다.");
			}
		}
		
		
		
	}
	
	
	public static void updateScore(Student []stds) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 수정 기능");
		System.out.println("과목 선택 (국 1 ,영2, 수3) : ");
		int subject = scan.nextInt();
		System.out.println("학생 번호 입력(1~5) : ");
		int num = scan.nextInt();
		System.out.println("수정할 성적 입력(1~100) : ");
		int score = scan.nextInt();
		
		for(Student std : stds) {
			if(std.num!=num) {
				continue;
			}
			switch(subject) {
			case 1 :
				std.setKor(score);
				break;
				
			case 2 :
				std.setEng(score);
				break;
				
			case 3:
				std.setMath(score);
				break;				
			}
		}
			
	}
}