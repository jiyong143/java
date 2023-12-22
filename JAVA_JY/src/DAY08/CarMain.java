package DAY08;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		
		
		/*
		 *  Car : 클래스명, car : 인스턴스명, new : 인스턴스를 생성하는 연산자
		 *  Car() : 생성자, 멤버변수를 초기화 */
		 
		
		 Scanner scan = new Scanner(System.in);
		 /* Scanner : 클래스명
		  * scan : 인스턴스명
		  * Scanner(System.in) : 표준입력 이용하여 초기화 하는 생성자 */
		  
		 Car car = new Car();
		 
		 car.turn(); // 시동 킴
		 car.print();
		 car.turnLight(-1); // 좌깜 킴
		 car.print();
		 car.turnLight(1); // 우깜 킴
		 car.print();
		 car.turnLight(0);
		 car.print();
		 for(int i =0;i<10;i++) {
			 car.speedup();
			 
		 }
		 car.print();
		 
		 for(int i =0;i<10;i++) {
			 car.speeddown();
			 
		 }
		 car.print();
				 
				 
		
		

	}

}
