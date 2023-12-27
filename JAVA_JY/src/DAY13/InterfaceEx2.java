package DAY13;

public class InterfaceEx2 {

	public static void main(String[] args) {
		print(new product());
		print(new Student());

	}
	
	public static void print(print p) {
		p.print();
	}

}

interface print{
	void print();
}

class product implements print{
	String name = "TV";
	String code = "TV001";


@Override

public void print() {
	System.out.println("제품명 : " + name);
	System.out.println("제품코드 : " + code);
}

}

class Student implements print{
	int grade =1, classNum= 1, num =1;
	String name = "홍길동";
	
	@Override
	public void print() {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
	}

}


