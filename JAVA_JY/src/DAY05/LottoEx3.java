package DAY05;

import java.util.Arrays;
import java.util.Scanner;

    // LottoEx2 풀이   
public class LottoEx3 {

	public static void main(String[] args) {
		
		int []tmp = new int[7];
		int count = 0;
		int min = 1, max =45;
		
		while(count<tmp.length) {
			int r= (int)(Math.random() * (max-min+1) + min);
			
			int i;
			for(i=0;i<count;i++) {
				if(r==tmp[i]) {
					break;
				}
				
				
			}
			if(i==count) {
				tmp[count++]=r;
			}
		}
		
		int [] lotto = new int[6];
		System.arraycopy(tmp, 0, lotto, 0, 6);
		
		int bonus = tmp[6];
		
		Arrays.sort(lotto);
		System.out.print("당첨번호 : ");
		for(int i = 0; i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println(" [ " + bonus + " ] ");
		
		int [] user = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 번호 : ");
		for(int i =0;i<6;i++) {
			user[i]=scan.nextInt();
		}
		
		int samecount = 0;
		for(int i =0; i<lotto.length;i++) {
			for(int j =0;j<user.length;j++) {
				if(lotto[i]==user[j]) {
					samecount++;
					break;
				}
			}
		}
		
		switch(samecount) {
		case 6:
			System.out.println("1등!");
			break;
		case 5:
			int i;
			for(i=0 ; i<user.length;i++) {
				if(bonus==user[i]) {
					break;
				}
			}
			if(i==user.length) {
				System.out.println("3등!");
			}else {
				System.out.println("2등!");
			}
			
			break;
		case 4 :
			System.out.println("4등!");
			
			break;
			
		case 3 :
			System.out.println(" 5등! ");
			
			break;
			
		default : 
			System.out.println(" 꽝! ");			
		}		
	}
}