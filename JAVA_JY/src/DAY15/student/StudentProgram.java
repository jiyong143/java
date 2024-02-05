package DAY15.student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;



public class StudentProgram implements Program {
	
	
	private Scanner scan = new Scanner(System.in);
	
	private final int EXIT =4;
		
	private List<Student> list = new ArrayList<Student>();
	

	
	
	
	
	


	@Override
	
	public void run() {
		
		int menu=0;
		
		do {
			
			printMenu();
			
			try {
			menu = scan.nextInt();
			
			runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다");
				scan.nextLine();
			}
						
		}while(menu !=EXIT);
	}
	
	
	
	@Override
	
	public void printMenu() {
		System.out.println("----메뉴------");
		System.out.println(" 1. 학생 관리 ");
		System.out.println(" 2. 성적 관리 ");
		System.out.println(" 3. 조회 ");
		System.out.println(" 4. 종료 ");
		System.out.println("----------");
		System.out.println(" 메뉴 입력 : ");
	}
	
	
	@Override
	
	public void runMenu(int menu) {
		switch(menu) {
		
		case 1 :
			
			studentManager();
			
			break;
			
		case 2 :
			
			scoreManager();
			
			break;
			
		case 3 :
			
			printManager();
			
			break;
			
		case 4 :
			System.out.println("프로그램 종료");
			break;
			
		default :
			
				
			throw new InputMismatchException();
			
			
		}
	}


	private void printManager() {
		
		System.out.println("--학생 조회 --");
		System.out.println(" 1. 전체 ");
		System.out.println(" 2. 학년 ");
		System.out.println(" 3. 반 ");
		System.out.println(" 4. 학생 ");
		System.out.println("--과목 조회--");
		System.out.println(" 5. 국어 ");
		System.out.println(" 6. 영어 ");
		System.out.println(" 7. 수학 ");
		System.out.println(" 메뉴 선택 : ");
		
		int menu = scan.nextInt();
		
		int grade,classNum,num;
		switch(menu) {
		
		case 1 :
			printStudent(s->true);
			break;
			
			
		case 2 :
			System.out.println("학년 : ");
			grade = scan.nextInt();
			printStudent(s->s.getGrade()==grade);
			break;
			
		case 3 :
			
			System.out.println("학년 : ");
			
			grade = scan.nextInt();
			System.out.println(" 반 : ");
			
			classNum = scan.nextInt();
			
			printStudent(s->s.getGrade()==grade && s.getClassNum()==classNum);
			break;
			
		case 4 :
			
			System.out.println("학년 : ");
			grade = scan.nextInt();
			
			System.out.println(" 반 : ");
			classNum=scan.nextInt();
			
			System.out.println(" 번호 : ");
			
			num =scan.nextInt();
			
			Student std = new Student(grade, classNum,num,"");
			printStudent(s->s.equals(std));
			break;
			
		case 5 :
			
			System.out.println("국어");
			printSubject(s->s.getKor());
			break;
			
		case 6 :
			
			System.out.println("영어");
			printSubject(s->s.getEng());
			break;
			
		case 7 :
			
			System.out.println("수학");
			printSubject(s->s.getMath());
			break;
			
		default :
			
			throw new InputMismatchException();
			
			
		}
		
	}
		
		
	
	private void printStudent(Predicate <Student> p) {
		
		for(Student std : list) {
			if(p.test(std)) {
				System.out.println(std);
			}
		}
		
	}
	
	
	
	private void printSubject(Function<Student,Integer>f) {
		
		for(Student std : list) {
			System.out.println(std.getName() + " : " + f.apply(std));
		}
		
	}
	
	

	private void scoreManager() {
		
		
		// 과목 출력 : 수정할 과목 선택
		
		System.out.println(" 1. 국어 ");
		System.out.println(" 2. 영어 ");
		System.out.println(" 3. 수학 ");
		System.out.println(" 과목 선택 : ");
		
		int subject = scan.nextInt();
		
        System.out.println(" 학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.println(" 반 : ");
		
		int classNum = scan.nextInt();
					
		System.out.println(" 번호 : ");
		
		int num = scan.nextInt();
		
		System.out.println(" 성적 : ");
		
		int score = scan.nextInt();
		
		Student std = new Student(grade,classNum,num, "");
		
		int index = list.indexOf(std);
		
		if(index==-1) {
			System.out.println("등록되지 않은 학생입니다.");
			return;
		}
		
		switch(subject) {
		
		case 1 :
			
			list.get(index).setKor(score);
			break;
		case 2 : 
			
			list.get(index).setEng(score); 
			break;
			
		case 3 :
			
			list.get(index).setMath(score); 
			break;
			
		default :
			
			throw new InputMismatchException();
			
		}
		
		System.out.println("성적 수정 완료");
		
		// System.out.println(list.get(index)); // 수정 확인용
	}
		
		
	

	private void studentManager() {
		
		printStudentMenu();
		
		int menu = scan.nextInt();
		
		runStudentMenu(menu);
		
		
	}
	

	private void runStudentMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			insertStudent();
			
			break;
			
		case 2 :
			
			updateStudent();
			
			
			break;
			
		case 3 :
			
			deleteStudent();
			
			break;
			
		default :
			
			throw new InputMismatchException();
			
		}
		
	}



	private void deleteStudent() {
		
        System.out.println(" 학생 추가 ");
        
		
		System.out.println(" 학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.println(" 반 : ");
		
		int classNum = scan.nextInt();
					
		System.out.println(" 번호 : ");
		
		int num = scan.nextInt();
		
		Student std = new Student(grade,classNum,num,"");
		
		if(list.remove(std)) {
			System.out.println("학생 정보 삭제 완료");
			
		}else {
			System.out.println("등록되지 않은 학생 정보");
		}		
		
	}


	private void updateStudent() {
		
		
        System.out.println(" 학생 추가 ");
		
		System.out.println(" 학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.println(" 반 : ");
		
		int classNum = scan.nextInt();
					
		System.out.println(" 번호 : ");
		
		int num = scan.nextInt();
				
		
		Student std = new Student(grade,classNum,num,"");
		
		int index = list.indexOf(std);
		
		if(index==-1) {
			System.out.println("등록되지 않은 학생입니다");
			return;
			
		}
		
		std = list.get(index);
		
        System.out.println("  수정할 학년 : ");
		
		 grade = scan.nextInt();
		
		System.out.println("  수정할 반 : ");
		
		 classNum = scan.nextInt();
					
		System.out.println(" 수정할 번호 : ");
		
		 num = scan.nextInt();
		
		System.out.println("  수정할 이름 : ");
		
		scan.nextLine();
		
		 String name = scan.nextLine();
		 
		 Student newStd = new Student(grade,classNum,num,name);
		 
		 if(list.contains(newStd)) {
			 System.out.println("이미 등록된 학생 정보여서 수정 불가능");
			 return;
		 }
		 
		 newStd.setKor(std.getKor());
		 newStd.setEng(std.getEng());
		 newStd.setMath(std.getMath());
		 
		 
		 list.remove(index);
		 
		 list.add(newStd);
		 
		 sort();
		 		 
		 System.out.println(" 학생 정보 수정");
		 
		 System.out.println(list);
		 
		 list.sort((o1,o2)->{
			 if(o1.getGrade()!=o2.getGrade()) {
				 return o1.getGrade()-o2.getGrade();
			 }
			 if(o1.getClassNum()!=o2.getClassNum()) {
				 return o1.getClassNum()-o2.getClassNum();
			 }
			 
			 return o1.getNum()-o2.getNum();
		 });
		 
		 System.out.println("학생 정보가 수정");
		 
	}
		 
		

	private void sort() {
		list.sort((o1,o2)->{
			 if(o1.getGrade()!=o2.getGrade()) {
				 return o1.getGrade()-o2.getGrade();
			 }
			 if(o1.getClassNum()!=o2.getClassNum()) {
				 return o1.getClassNum()-o2.getClassNum();
			 }
			 
			 return o1.getNum()-o2.getNum();
		 });
		
	}
		 

	private void insertStudent() {
		
		
		System.out.println(" 학생 추가 ");
		
		System.out.println(" 학년 : ");
		
		int grade = scan.nextInt();
		
		System.out.println(" 반 : ");
		
		int classNum = scan.nextInt();
					
		System.out.println(" 번호 : ");
		
		int num = scan.nextInt();
		
		System.out.println(" 이름 : ");
		
		scan.nextLine();
		
		String name = scan.nextLine();
				
		Student std = new Student(grade, classNum, num ,name);
		
		if(!list.contains(std)) {
			
			list.add(std);
			System.out.println("학생을 등록했습니다.");
			return;
			
		}
		
		System.out.println("이미 등록된 학생입니다.");		
		
	}
		
	private void printStudentMenu() {
		
		System.out.println("--- 학생 관리-----");
		System.out.println(" 1. 학생 추가 ");
		System.out.println(" 1. 학생 수정 ");
		System.out.println(" 1. 학생 삭제 ");
		System.out.println("----------------");
		System.out.println(" 메뉴 선택 : ");
		
	}

}
