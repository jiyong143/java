package DAY03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		
		/*구구단 2단을 출력하는 코드를 작성하시오
		 */
		int num = 3;
		int i = 1;
		int count = 9;
		while(i <= count) {
			System.out.println(num + " " + " X " + " " +  i + " " + " = " + (num * i) );
			++i;
		}		
	}
}
