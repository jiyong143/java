package DAY08;

public class StudentMain2 {

	public static void main(String[] args) {
		// 5명의 학생을 저장하기 위한 배열을 생성
		
		Student[] stds = new Student[5];
		
		for(int i =0;i<5;i++) {
			stds[i]=new Student(); // 이것이 중요
			stds[i].printInfo();
		}
	}

}
