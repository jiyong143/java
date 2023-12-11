package DAY02;

public class LogicalOperatorEx1 {
    //논리 연산자 예제
	public static void main(String[] args) {
		
		/* && : ~gkrh, ~이고
		 * A && B : 여기서 A,B는 참과 거짓을 판별 가능한 식 또는 변수
		 * 성적이 100 이하리고, 성적이 90 이상이면 A ,성적이 95 > TRUE
		 * 하나라도 거직이면 거짓
		 * 
		 * || : ~이거나, ~하거나
		 * A || B
		 * 하나만 참이여도 참
		 * 
		 * ! :~아닌, 반대
		 * !A
		 * T>F, F>T
		 */
		
		
	// 0 이상 100 이하면 올바른 성적이라고 하자
		int score = 101; //성적
		
		System.out.println(score + "점은 올바른 성적인가?" + ((score>=0)&&(score<=100)));
		
		System.out.println(score + "점은 올바른 성적이 아닌가?" + !((score>=0)&&(score<=100)));
		
		System.out.println(score + "점은 올바른 성적이 아닌가?" + ((score<0)||(score>100)));
		
		System.out.println(score + "점은 올바른 성적이 아닌가?" + !(score>=0&&score<=100));
		
		System.out.println(score + "점은 올바른 성적이 아닌가?" + (score<0||score>100));
		
		
		//단락회로평가: 뒤에 걸 굳이 안봐도 되는 경우
			}

}
