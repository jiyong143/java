package DAY04;

import java.util.Scanner;

public class RockPaperScissorEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위 바위 보 게임 프로그램을 작성하시오
		 * 1. 새게임 : 컴퓨터와 게임 해서 이기면 승, 지면 패, 비기면 무 로 기록함
		 * 2. 기록 : 승 무 패 순서대로 출력
		 * 3. 프로그램 종료 */
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		int win =0,lose =0,same=0;
		int min =1, max =5;
		int r1;
		char r;
		char my;
		
		
		
		
		do {
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록");
			System.out.println("3. 프로그램 종료");
			 menu = scan.nextInt();
			 switch(menu) {
			 case 1 :
				 r1 = (int)(Math.random( )*(max-min+1)+min);
					
					if(r1==2) {
						r='S';
					}else if(r1==3) {
						r='R';
					}else {r='P';
					}
				 
				 
				 
				 
				 
				 System.out.println("S, R, P 중 입력 :");
				  my = scan.next().charAt(0);
				  if(my=='S') {
					  if(r=='S') {
						  System.out.println(" 무승부 ");
					   same = same+1;
					  }
					  else if(r=='P') {
						  System.out.println(" 이김 ");
						  win = win +1;
					  }else {
						  System.out.println(" 짐 ");
						  lose = lose +1;
					  }
				  }
				  
				  if(my=='P') {
					  if(r=='P') {
						  System.out.println(" 무승부 ");
						  same = same+1;
					  }else if(r=='R') {
						  System.out.println(" 이김 ");
						  win = win +1;
					  }else {
						  System.out.println(" 짐 ");
						  lose = lose+1;
					  }
					  }
				  if(my=='R') {
					  if(r=='R') {
						  System.out.println(" 무승부 ");
						  same = same +1;
					  }else if(r=='S') {
						  System.out.println(" 이김 ");
						  win = win +1;
					  }else {
						  System.out.println(" 짐 ");
						  lose = lose +1;
					  }
					  }
				  break;
				  
			 case 2 :
				 System.out.print(" (기록) " + "승 : " + win + " , " + "무 : "+ same + " , " + " 패 : " + lose);
				 System.out.println();
				 
				 break;
				 
			 case 3 :
				 
				 System.out.println("프로그램을 종료합니다. ");
				 			 }
		}while(menu != 3);
	}
	}	