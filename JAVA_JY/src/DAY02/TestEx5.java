package DAY02;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		
		/*월을 입력 받아서 월의 계절을 출력한다
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 그외: 잘못된 월
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		
		int month = scan.nextInt();
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		}else if(month == 6 || month == 7 || month ==8) {
			System.out.println("여름");
		}else if(month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		}else if(month==12 || month ==1 || month ==2) {
			System.out.println("겨울");
		}else {System.out.println("잘못된 월");
		}
		
		scan.close();
		}
			
	}


