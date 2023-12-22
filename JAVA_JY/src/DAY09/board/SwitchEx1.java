package DAY09.board;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch 문 안에 지역 변수를 선언하는 경우 발생 가능한 문제점
		
		for(int i =0; i<5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i =0; i<5;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// switch 문은 지역변수를 밖에서 선언해서 사용하는 것이 좋다
	
		int menu = 2;
		
		int num;
		switch(menu) {
		case 1 :
			num =10;
			System.out.println(num);
			break;
			
		case 2 :
			num =20;
			System.out.println(num);
			break;
		}
	}

}
