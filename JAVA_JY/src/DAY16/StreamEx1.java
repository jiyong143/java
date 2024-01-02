package DAY16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class StreamEx1 {

	public static void main(String[] args) {
		
		List <Student> list = Arrays.asList(new Student(1,1,1,"홍길동",100,100,100),
				                            new Student(1,1,2,"임꺽정",95,85,55),
				                            new Student(2,1,1,"고길동",50,10,20)
				                            );
		Stream<Student> stream = list.stream();
		
		// 학생들 중 1학년 학생들만 선택해서 학생 정보를 출력
		
		stream.filter(s->s.getGrade()==1).forEach(s-> System.out.println(s));
		
		stream = list.stream();
		
		// 학생 정보에서 국어 성적을 추출해서 점수를 출력
		
		stream.map(s->s.getKor()).forEach(k->System.out.println("국어 :" + k ));

		
		stream = list.stream();
		
		// 학생들의 국어 성적 평균을 계산
		// map : A 에서 B 로 변환시킴
		// mapToInt : A에서 Integer로 변환 시킴
		double avg = stream.mapToInt(Student::getKor).average().orElse(0.0);
		
		System.out.println("국어 성적 평균 : " + avg);
		
		stream = list.stream();
		
		// 국어 성적에 2를 곱한 뒤 합을 구함
		
		Integer res = stream.mapToInt(Student::getKor).reduce(0,(sum,kor)->{
			return sum+2*kor;});
		System.out.println("2배 총합 : " + res);
		
		
		Student arr [] = new Student[] {
				new Student(1,1,1,"홍길동",100,100,100),
				new Student(1,1,2,"임꺽정",95,85,55),
				new Student(2,1,1,"고길동",50,10,20)
				
		};
		
		Stream<Student> stream2 = Arrays.stream(arr);
		
		stream2.filter(s->s.getGrade()==1).forEach(s->System.out.println(s));
				
				
						
				
		
		
		
		
		
		}
		
		
		
		
	}



@Data
@RequiredArgsConstructor


class Student{
	@NonNull
	Integer grade, classNum, num;
	
	@NonNull
	String name;
	
	@NonNull
	Integer kor,eng,math;
	
	
}