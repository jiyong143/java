package DAY05;

import java.util.Scanner;

public class CountEx2 {
    // CountEx1 풀이
	public static void main(String[] args) {
		
		int user[] = new int[5];
		int count[] = new int[10];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 5개를 입력하세요(1~9) : ");
		for(int i =0;i<user.length;i++) {
			user[i] = scan.nextInt();
			count[user[i]]++;
			
		}
		for(int i =1;i<count.length;i++) {
			System.out.println(i + " : " + count[i] + " 개 ");
		}
	}
}	
		
		

	


