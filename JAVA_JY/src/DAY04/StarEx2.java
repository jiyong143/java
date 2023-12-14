package DAY04;

public class StarEx2 {

	public static void main(String[] args) {
		/* *
		 * **
		 * ***
		 * ****
		 * ***** 
		 * 위와 같이 출력하기 */
		
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}