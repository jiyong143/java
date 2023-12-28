package DAY14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// 풀이 
public class LottoEx2 {

	public static void main(String[] args) {
		
		
		
		Set<Integer> lotto = new HashSet<Integer>();
		Set<Integer> user = new HashSet<Integer>();
		
		int bonus;
		
		int min=1, max=45;
		
		while(lotto.size()<6) {
			int r= (int)(Math.random()*(max-min+1)+min);
			lotto.add(r);
		}
		
		while(true) {
			bonus= (int)(Math.random()*(max-min+1)+min);
			
			if(!lotto.contains(bonus)) {
				break;
			}
		}
		System.out.println(lotto + ",보너스 : " + bonus);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호(중복되지 않는 6개) : ");
		while(user.size()<6) {
			int r= scan.nextInt();
			user.add(r);
		}
		
		int count =0;
		
		for(int tmp:user) {
			if(lotto.contains(tmp)) {
				count++;
			}
		}
		
		switch(count) {
		case 6 :
			System.out.println("1등입니다");
			break;
			
		case 5 :
			int rank=user.contains(bonus)?2:3;
			System.out.println(rank + "등입니다");
			break;
			
		case 4 : 
			System.out.println("4등 입니다.");
			break;
			
		case 3 :
			System.out.println("5등 입니다.");
			break;
		default :
			System.out.println("꽝");
		}
		
		
		
		
		
		

	}

}
