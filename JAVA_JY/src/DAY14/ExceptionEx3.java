package DAY14;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// throws 와 throw 를 이용한 예외 처리
		try {
		printDiv1(1,0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			printDiv2(1,0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	// 두 수를 입력 받으면 두 수를 나눈 후 결과 출력하는 메서드
	// throws  를 통해 예외를 발생시킴
	// 발생한 예외가 RuntimeException 의 자식 예외여서 throws를 생략
	public static void printDiv1(int num1, int num2) {
		if(num2==0) {
			throw new ArithmeticException("0으로 나눌 수 없다");
		}
		System.out.println(num1/(double)num2);
	}
	
	
	public static void printDiv2(int num1, int num2) throws Exception {
		if(num2==0) {
			throw new Exception("0으로 나눌 수 없다");
		}
		System.out.println(num1/(double)num2);
	}

}
