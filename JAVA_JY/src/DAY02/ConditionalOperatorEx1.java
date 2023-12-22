package DAY02;

public class ConditionalOperatorEx1 {
    //조건 선책 연산자
	public static void main(String[] args) {
		/*성적이 A인지 아닌지를 판별하는 예제
		 * 성적이 100이하이고 90이상이면 A, 아니면 A가 아님
		 */
		
		int score = 101;
		
		String result = "";
		
		result = score <= 100 && score >= 90 ? "A학점이 아닙니다.": "A학점이 아닙니다.";
		System.out.println(score + "점은" + result);
	}

}

//  비트 연산자랑 비트 이동 연산자 잠깐 보고 이동


