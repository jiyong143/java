package DAY08;

public class MethodOverLoadingEx1 {

	
	// 매개변수의 개수 같고 자료형도 같으면 메서드 오버로딩이 안된다. (에러 발생)
	// 메서드 이름이 같아도 메서드 오버로딩을 이용하면 여러번 반복해서 사용할 수 있다.
	public static void main(String[] args) {
		System.out.println();
	}
	
	// 두 정수의 합을 알려주는 메서드
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
		
	}
	
	// 두 실수의 합을 알려주는 메서드
	public static double sum(double num1, double num2) {
		
		return num1 + num2;
		
	}
	// 첫번째와 겹침
	
	/*public static double sum(int num1, int num2) {
		return num1 + num2; 
	}*/
	
	// 세 정수의 합을 알려주는 메서드
	
	public static int sum(int num1 ,int num2 ,int num3) {
		return num1 + num2 + num3;
	}

}
