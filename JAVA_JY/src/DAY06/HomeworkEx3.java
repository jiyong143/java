package DAY06;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkEx3 {

	
	// Hw 풀이
	public static void main(String[] args) {
		
		int menu;
		
		Scanner scan = new Scanner(System.in);
		int records[] = new int[5];
		String names[]=new String[5];
		int rankCount = 0;
		
		for(int i =0;i<records.length;i++) {
			records[i]=Integer.MAX_VALUE;
		}
		
		do {
			
			System.out.println(" 메뉴 ");
			System.out.println(" 1. 새 게임 ");
			System.out.println(" 2. 기록 확인 ");
			System.out.println(" 3. 프로그램 종료 ");
			System.out.print(" 메뉴 선택 : ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1 :
				int min = 1,max=9;
				
				int count = 0;
				
				int recordCount = 0;
				
				int arr [] = new int[3];
				
				while(count<arr.length) {
					
					int r = (int)(Math.random( )*(max-min+1)+min);
					
					int i;
					for(i =0;i<count;i++) {
						if(arr[i] == r) {
							break;
						}
					}
					
					if(i == count) {
						arr[count++] = r;
						
					}
				}
				for(int i =0; i<arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
				
				System.out.println();
				
				// 중복하지 않는 1 에서 9 사이 3개 정수를 컴터가 만듬
				
				
				int perfectsame = 0;
				int samecount;
				
				
				
				
				do {
					
				perfectsame =0;
				samecount=0;
					
				
				System.out.print("1에서 9 사이의 중복하지 않는 3개의 정수를 입력 : ");
				
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int num3 = scan.nextInt();
				
				int myarr [] = new int[] {num1,num2,num3};
				
				
				
				for(int i =0;i<3;i++) {
					if(myarr[i]==arr[i]) {
						perfectsame = perfectsame +1;
						
					}
				}
				System.out.println("완전히 같은 숫자의 개수 : " + perfectsame);
				
				
				
				for(int i =0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(myarr[i]==arr[j]) {
							samecount = samecount + 1;
						}
						
					}
				} 
				
				System.out.println("같은 숫자의 개수 : " + samecount );
				
				
				
				switch(perfectsame) {
				case 3:
					System.out.println("결과 : 3S");
					System.out.println("정답입니다.");
					break;
				case 2 :
					System.out.println("결과 : 2S");
					break;
				case 1 :
					if(samecount==2) {
						System.out.println("결과 : 1S2B");
					}else {
						System.out.println("결과 :  1S");
					}
					break;
				case 0 :
					if(samecount==3) {
						System.out.println("결과 : 3B");
					}else if(samecount==2) {
						System.out.println("결과 : 2B");
					}else if(samecount==1) {
						System.out.println("결과 : 1B");
					}
					else {System.out.println("결과 : O");
					}
					break;
					}
				
				recordCount++;
				
				
				
			}while(perfectsame!=3);
			System.out.println("게임 종료");
			
				if(rankCount<5||records[rankCount-1]>recordCount) {
					
					System.out.print(" 이름 : ");
					String name = scan.next();
					rankCount = rankCount<5?rankCount+1:rankCount;
					int index = 0;
					for(int i =0;i<rankCount;i++) {
						if(recordCount<records[i]) {
							index=1;
							break;
						}
					}
					
					// 이전 기록들을 뒤로 한칸 씩 밈
					for(int i = rankCount-1;i>index;i--) {
						records[i]=records[i-1];
						names[i]=names[i-1];
					}
					records[index]=recordCount;
					names[index]=name;
									
				}
				
				break;
				
				
				
			case 2 :
				
				if(rankCount==0) {
					System.out.println(" 기록이 없습니다. ");
				}else {
					for(int i =0;i<rankCount;i++) {
						System.out.println(i+1 + "등 :" + records[i] + "회 -" + names[i]);
					}
				}
					
				
				break;
				
			case 3 :
				System.out.println(" 프로그램 종료 ");
				break;
				
			default :
				System.out.println("메뉴 잘못 입력");
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}while(menu!=3);
		System.out.println("프로그램 종료합니다.");
		
		scan.close();

}
	
}
