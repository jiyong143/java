package DAY02;

public class IfEx1 {
    //if 문 예제
	public static void main(String[] args) {
		
		//정수가 0이면 0이라고 출력하고, 정수가 0이 아니면 0이 아닙니다 라고 출력하는 예제
		/* ...이면 ~이다 : 조건문
		 * ... : 조건식
		 * ~ : 실행문
		 * if(조건식){
		 *        실행문;
		 * }
		 */
		
		int num = 14;
		
		if(num == 0) {
			System.out.println("0입니다.");;	
		}
		
		if (num != 0) {
			System.out.println("0이 아닙니다.");
		}
		
		
	//if else 문 예제
		
		if (num == 0) {
			System.out.println("0입니다.");
		} else { System.out.println("0이 아닙니다.");
		}
		
		
		// if 를 두번쓰면 무조건 2번 확인
	    // if else 는 num 이 0 이면 한 번만 확인
	
	
	//else if 문 예제
	
      
		
	// num이 0 이면 0, 양수면 양수, 음수면 음수라고 출력
	
	if(num == 0) {
		System.out.println(num + "는 0 입니다");
	} else if (num > 0) {
		System.out.println(num + "는 양수입니다");
	} else {
		System.out.println(num + "는 음수입니다.");
	}
	
	}}


