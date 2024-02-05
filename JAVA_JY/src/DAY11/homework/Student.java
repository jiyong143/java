package DAY11.homework;

public class Student {
	// 학년, 반, 번호, 이름
	private int grade, classNum, num;
	private String name;
	//성적들
	
	private Subject[] subjects;
	private int count=0;// 등록된 과목수
	
	// getter setter 

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCalssNum() {
		return classNum;
	}

	public void setCalssNum(int calssNum) {
		this.classNum = calssNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject[] getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
	
	
	// 과목 추가하는 메서드
		public boolean insertSubject(String title, int score) {
			for(Subject tmp : subjects) {
				if(tmp!=null && tmp.equals(title)) {
					return false;
				}
			}
			subjects[count]=new Subject(title,score);
			count++;
			expandSubject();
			
			return true;
		}

	private void expandSubject() {
		
		if(subjects.length >count) {
			return;
		}
		
		Subject [] tmpList = new Subject[subjects.length +5];
		System.arraycopy(subjects,0,tmpList,0,subjects.length);
		subjects=tmpList;
		
	}
		
		
		// 과목 삭제하는 메서드
	
	public boolean deleteSubject(String title) {
		int index= -1;
		for(int i =0; i<count;i++) {
			if(subjects[i].equals(title)) {
				index=i;
			}
		}
		//없으면
		if(index==-1) {
			return false;
		}
		//있으면 삭제될 예정이여서 하나뺌
		count--;
		
		if(index==count) {
			//추가할 때 향상된 for문을 이용해서 삭제된 항목을 null로 수정해야함
			subjects[index]=null;
			return true;
		}
		Subject[] tmpList = new Subject[subjects.length];
		//기존 과목 전체 복사
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
		//앞으로 당겨주는 작업
		System.arraycopy(tmpList, index+1, subjects, index, count-index);
		subjects[index]=null;
		return true;
		
		
	}
	
	
	
		
		
		// 성적 수정하는 메서드
	
	
	
	public boolean updateSubject(String title, int score) {
		for(Subject tmp : subjects) {
			if(tmp!= null && tmp.equals(title)) {
				tmp.updateScore(score);;
				return true;
			}
		}
		return false;
	}
		
		
		
		// 학생 정보 출력하는 메서드
	
	
	public void print() {
		System.out.println(grade + "학년" + classNum + "반" + num + "번" + name);
		for(Subject tmp : subjects) {
			if(tmp!=null) {
				tmp.print();
			}
		}
	}
	
	
	

		public Student(int grade, int calssNum, int num, String name) {
			
			this.grade = grade;
			this.classNum = calssNum;
			this.num = num;
			this.name = name;
			subjects= new Subject[5];
		}
	
	
	
		
	
	
	
	
	
	

}
