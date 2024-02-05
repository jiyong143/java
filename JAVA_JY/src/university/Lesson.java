package university;

import java.util.List;
  //최병호
public class Lesson {
	 
	private String subject; // 수업 이름
	private String professor; // 교수
	private String dayOfWeek; // 요일
	private int startTime; // 수업 시작 시간
	private int endTime; // 수업 끝나는 시간
	private int classroom; // 강의실
	List<Score> scoreList; // 수강 인원정보, 수(리스트와 리스트사이즈가 현 인원수)
	int max=30; // 최대 정원
	
}
