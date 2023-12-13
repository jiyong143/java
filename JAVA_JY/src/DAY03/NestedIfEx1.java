package DAY03;

public class NestedIfEx1 {

	public static void main(String[] args) {
		//2의 배수면 2의 배수라 출력, 6의 배수이면 6의 배수라고 출력
		//2,6의 배수가 아니면 2,6의 배수가 아니라고 출력하는 예제
		
		
		//중첩 if를 사용하는 경우
		
		int num = 6;
		
		if(num % 2 == 0) {
			
			if(num % 3 == 0) {
				System.out.println(num + "은 6의 배수");
			}else {
				System.out.println("2, 6의 배수가 아님");
			}
			
		}
			
	}
	
}