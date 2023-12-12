package DAY03;

public class ForEx2 {

	public static void main(String[] args) {
		/*1에서 10 사이의 짝수들의 합을 수하는 코드를 작성하시오*/
		
		int i;
		int sum = 0;
		for(i = 1 ; i <=10 ; i = i + 1) {
			if(i %2 ==0) {
				sum = sum+i;			
			}
		}
		System.out.println(sum);
	}
}
// for 문에서는 초기화 부분에 있는 변수가 밖에서는 사용 불가능하다.

