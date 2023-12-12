package DAY03;

public class SwitchEx1 {

	//switch 문 예제
	public static void main(String[] args) {
		
		/* 정수가 0 인지 아닌지 판별하는 예제 */
		int num = 0;
		
		switch(num) {
		case 0:
			System.out.println("0 입니다.");
			break;
			
		default:
			System.out.println(num + "는 0이 아닙니다.");			
		}
		
	}
}
