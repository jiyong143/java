package DAY10;

public class StaticEx2 {

	public static void main(String[] args) {
		
		System.out.println(sum1(1,2));
		StaticEx2 ex = new StaticEx2(); // 인스턴스를 만든다
		
		
		System.out.println(ex.sum2(1,2)); // 에러 발생
		

	}
	public static int sum1(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sum2(int num1 ,int num2) {
		return num1 + num2;
	}
	
	
	// 인스턴스 메서드 : static이 없어서
	public void test() {
		System.out.println(sum1(1,2));
		System.out.println(sum2(1,2));
	}

}
