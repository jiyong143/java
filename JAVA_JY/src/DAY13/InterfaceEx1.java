package DAY13;

public class InterfaceEx1 {

	public static void main(String[] args) {
		System.out.println(KiaCar.brand);
		printer.print();

	}

}

class KiaCar{
	public static String brand = "기아";
	
}

interface printer{
	
	// static 붙은 메서드는 반드시 구현해야 함
	static void print() {
		System.out.println("프린터입니다.");
	}
	
	void test();
	
	default void test2() {}
	
}

