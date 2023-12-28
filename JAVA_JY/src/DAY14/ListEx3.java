package DAY14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {
		
		
		// 속담을 입력받아 저장하고, 출력하는 코드 작성
				
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		String str;
		
		while(true) {
			
			
		System.out.print("속담을 입력하세요(종료하려면 -1) : ");
		str = scan.nextLine();
		// 종료하기 위해 -1 입력했으면 반복문 종료
		if(!str.equals("-1")) {
			break;
		}
		list.add(str);
		}
		
		for(String tmp : list) {
			System.out.println(tmp);
		}
	}
	
}