package DAY06;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		
		// 정수 num 가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
		
		int money = 0; // 배팅하는 돈
		int totalMoney = 10000; // 내가 현재 갖고 있는 돈 , 게임 시작시 주어지는 금액은 10000원
		int num;
		
		while(totalMoney>0) {
			
		//num가 1에서 100 사이의 랜덤한 수를 생성
		
		int min = 1, max = 100;
		num = (int)(Math.random()*(max-min+1)+min);
		
		// 사용자가 게임에 투입할 금액을 입력하는 코드 (1~ 현재 금액)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배팅할 금액을 입력하시오(1~totalmoney) : ");
		
		money = scan.nextInt();
		
		if(money>totalMoney) {
			money=totalMoney; // 전 재산을 다 건 경우
		}
		// 이거랑 money = money > totalMoney ? totalMoney : money; 와 같다
		
		//사용자가 0 또는 1을 입력받는 코드를 작성
		
		System.out.print("0(짝수) 또는 1(홀수) 을 입력하세요 : ");
		
		int user = scan.nextInt();
		
		if(num % 2== 0) {
			System.out.println(num + "은" +" 짝수 입니다. ");
		}else {
			System.out.println(num + "은" +" 홀수 입니다. ");
	}
		
		// 사용자가 입력한 값이 맞았는지 틀렸는지 출력하는 코드 작성
		
		if(user==num % 2) {
			System.out.println(" 사용자 승 ! ");
			totalMoney  += money;
		}else {
			System.out.println(" 사용자 패 ! ");
			totalMoney  -= money;
		}
		
		System.out.println("현재 금액 : " + totalMoney);
		
		}
		System.out.println("배팅금액이 없어서 게임을 종료");		
	}
}