package DAY06;

import java.util.Scanner;
// AdvancedHw
public class HomeworkEx2 {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하세요
		 * 1~9 사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - S : 숫자가 있고, 위치가 같은 경우
		 * - B : 숫자가 있지만, 위치가 다른 경우
		 * - O : 일치하는 숫자가 하나도 없는 경우
		 * - 3S 가 되면 게임이 종료
		  
		 * 예
		 * 랜덤으로 생성된 숫자 : 3 9 1
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다. */
		
		int menu=0;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		do {
			System.out.println("=====================");
			System.out.println("메뉴");
			System.out.println(" 1. 새 게임 ");
			System.out.println(" 2. 기록 확인 ");
			System.out.println(" 3. 프로그램 종료");
			System.out.print(" 메뉴 선택 ");
			
			menu = scan.nextInt();
			
			if(menu==1) {
			
		
			int perfectsame =0;
		
		
			
		
		
		
		do {
			
		
			
			System.out.println("==============");
			System.out.println("메뉴");
		
        int min = 1,max=9;
		
		int count = 0;
		
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
		
		
		perfectsame = 0;
		int samecount;
		
		
		do {
			
		perfectsame =0;
		samecount=0;
			
		//
		
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
		
	}while(perfectsame!=3);
	System.out.println("게임 종료");
	
		}
		
	
		}while(menu!=3);
		System.out.println("프로그램 종료");
		
		}
		
	}
		
	
		
		



		
	

		
			
			
		
			
				
			
			
				
			
			
			
			
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
		
		
		
	