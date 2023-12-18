package DAY05;

import java.util.Scanner;
//ThirtyOneEx 풀이
public class ThirtyOneEx3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int user;
		int count = 0;
		int min = 1, max =3;
		
		while(count<31) {
			int com = (int)(Math.random()*(max-min+1)+min);
			int end = count + com;
			
			end = end >=31 ? 31 : end;
			
			System.out.print("com : ");
			for(int i =count +1;i<=end;i++) {
				System.out.println(i + " ");
			}
			System.out.println();
			count = end;
			if(count==31) {
				System.out.println("유저 승 ! ");
				break;
			}
			
			System.out.print(" 정수 : ");
			user = scan.nextInt();
			
			end = count + user;
			end = end >= 31 ? 31 : end;
			
			System.out.print("user : ");
			for(int i = count +1;i<=end;i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			count = end;
			if(count==31) {
				System.out.println("컴퓨터 승!");
			}
		}
	}
}