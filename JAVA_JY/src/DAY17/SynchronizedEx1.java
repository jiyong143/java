package DAY17;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEx1 {

	public static void main(String[] args) {
		
		

	}

}


@AllArgsConstructor

class Customer extends Thread{
	private BankBook bankBook;	
	private String name;
	private int balance;
	
	@Override
	public void run() {
		System.out.println("입금 중 : " + name);
		bankBook.deposit(10000);
	}
	
	public void deposit(int money) {
		
		this.balance +=money;
		
		// 2초 동안 현재 쓰레드를 일시중지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
		
	}
		
	
}

@Data
@AllArgsConstructor
class BankBook{
	
	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
	private int balance;
	private String name;
	
	
	
}