package DAY08;

/* 학생의 국,영,수 성적을 관리하기 위한 프로그램 작성하려 한다.
 * 이때 필요한 학생 클래스를 생성하기 */


public class Student {
	
	/* 멤버 변수 :
	 * 학생 번호 , 학년, 반 , 이름,  학생의 수,  국어 성적 ,영어 성적, 수학 성적 */
	
	int kor, eng, math;
	int grade,classNum,num;
	String name;
	
	  
	 /* 메서드 : 
	 * 메뉴 출력 메서드
	 * 학생 정보 확인 메서드
	 * 학생 성적 확인
	 * 국어 성적 수정
	 * 영어 성적 수정
	 * 수학 성적 수정
	 * 프로그램 종료 메서드 */ 
	
	// 메서드1 : 학생 정보(학년, 반 ,번호, 이름)을 콘솔에 출력
	
	public void printInfo() {
		System.out.println("--------------");
		System.out.println(" 학년 :" + grade);
		System.out.println(" 반 : " + classNum);
		System.out.println(" 번호 : " + num);
		System.out.println(" 이름 : " + name);
	}
	
	
	
	
	
	// 메서드 2 : 학생 성적(학년, 반, 번호, 이름, 국,영,수)을 콘솔에 출력
	
	public void printScore() {
		printInfo();		
		System.out.println(" 국어 : " + kor);
		System.out.println(" 영어 : " + eng);
		System.out.println(" 수학 : " + math);
		
	}
	
	
	
	
	// 메서드 3 : 국어 성적을 수정
	
	public void setKor(int korScore) {
		kor = korScore;				
	}
	
	
	
	
	// 메서드 4 : 영어 성적을 수정
	
	public void setEng(int engScore) {
		eng = engScore;				
	}
	
	
	
	
	
	
	// 메서드 5 : 수학 성적을 수정
	
	public void setMath(int mathScore) {
		math = mathScore;				
	}
	
	
	
	
	
	
	
	
		 
		 
	
	

}
