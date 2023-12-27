package DAY13;

public interface Program {
	//int num1=10; // 변수 앞에 final static 자동으로 추가
	//final static int num2 =20;
	// 메서드 앞에 public abstract 가 자동으로 추가
	
	void printMenu();
	public void runMenu(int menu);
	public abstract void printExit();
	void run();
	default void test() {}
}




abstract class  TestA{
	// 클래스에서는 final static 을 생략하면 멤버변수, 붙여주면 상수
	int num1 =10;

	final static int num2=20;
	
	public abstract void printMenu();
	// 클래스에서는 추상 메서드에 abstract 자동 추가 안됨
	
	
}


