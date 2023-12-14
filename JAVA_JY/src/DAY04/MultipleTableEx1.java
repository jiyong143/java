package DAY04;

public class MultipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단부터 9단까지 출력하는 코드 작성
		 * 먼저 2단 부터.. */
		
		int k;
		for(k=1;k<=9;k++) {
		}// 2단만 출력
			System.out.println(2 + " X " + k + " = " + (2*k));
		
		int i,j;
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}// 이중 for 문 이용해서 전부 다 출력
	}
}
