package DAY08;

public class StudentMain {

	public static void main(String[] args) {
		
		
		// 학생 1명의 정보를 저장하소 출력하기
		Student std = new Student();
		
		std.grade = 1;
		std.classNum = 1;
		std.num = 1;
		std.name = "홍길동";
		
		std.printInfo();
		
		
		// 국어 90 ,영어 100, 수학 80 으로 수정 후 출력
		
		std.setKor(90);
		std.setEng(100);
		std.setMath(80);
		
		std.printScore();
		

	}

}
