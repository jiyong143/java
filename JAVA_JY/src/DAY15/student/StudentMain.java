package DAY15.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
import lombok.AllArgsConstructor;
import lombok.Data;

public class StudentMain {	
	// 13일차 ConsoleProgram 이용
	
	
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		/* 학생 국어 ,영어, 수학, 성적 관리 프로그램 작성
		 * - Program 인터페이스를 생성해서 활용
		 * - void run()
		 * - void printMenu()
		 * - void runMenu(int menu)
		 * - Program 인터페이스를 구현한 구현 클래스 StudentProgram을 생성해서 활용
		 * - 학생 정보를 Student 클래스 생성해서 활용
		 * - 학년, 반, 번호, 이름, 국 영 수 
		 * - 리스트를 활용
		 * - 기능
		 * 
		 * - 학생 관리
		 *  - 학생 추가
		 *  - 학생 수정
		 *  - 학생 삭제
		 *  
		 * - 성적 관리
		 *  
		 *  -성적 삭제
		 *  
		 * -조회
		 *  -학생 조회
		 *   - 전체
		 *   - 학년
		 *   - 반
		 *   - 학생(학년,반,번호)
		 *   
		 *  - 성적 조회
		 *   - 국어
		 *   - 영어
		 *   - 수학
		 *   
		 */

		StudentProgram sp = new StudentProgram();
		
		sp.run();
		
	}
	
}
			