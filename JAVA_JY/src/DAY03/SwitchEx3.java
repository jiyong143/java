package DAY03;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		
		/*월을 입력 받아서 월의 계절을 출력한다
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 그외: 잘못된 월
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하시오 :");
		
		int month = scan.nextInt();
		
		switch(month) {
		case 3,4,5 :
			System.out.println("봄");
		break;
		
		case 6,7,8 :
			System.out.println("여름");
		break;
		
		case 9,10,11 :
			System.out.println("가을");
		break;
		
		case 12,1,2 :
			System.out.println("겨울");
		break;
		
		default :
			System.out.println("잘못된 월");
		}
		
		scan.close();
				
	}

}
