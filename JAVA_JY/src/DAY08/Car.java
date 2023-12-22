package DAY08;

// 클래스와 객체
public class Car {
	// - 정보 : 멤버 변수
	// - 무게 : 단위는 톤으로, 브랜드, 분류, 색상, 바퀴 종류 ,차명, 년식
	
	double weight;
	String brand;
	String category; // 0 : 소형 ,1 : 중형 , 2 : 대형 으로 할 수 있음
	
	String color; // int 가능
	
	String [] tires;
	
	String carName;
	
	int year;
	
	boolean power; // 시동
	
	int speed; // 현재 속력
	
	boolean leftLight;
	
	boolean rightLight;
	
	// - 기능 : 메서드
	// - 가속, 감속, 시동 on off , 깜빡이 on off
	
	
	
	
	// 시동을 켜기와 끄기
	// 시동이 켜져있으면 꺼지고, 반대는 마찬가지
	
	public void turn() {
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	
	
	// 가속
	
	public void speedup() {
		speed++;		
	}
	
	// 감속
	
	public void speeddown() {
		speed--;
	}
	
	// 좌측 우측 깜빡이 켜기 끄기 , 위 : 우측1, 가운데 0, 아래 : 좌측 -1
	
	public void turnLight(int direction ) {
		switch(direction) {
		case 1 :
			rightLight = true; leftLight = false; break;
			
		case -1:
			rightLight = false; leftLight = true; break;
			
		case 0 : 
			rightLight = false; leftLight = false; break;
		}
		
	}
	
	public void print() {
		System.out.println("---------------");
		System.out.println("시동 : " + power);
		System.out.println("속력 : " + speed);
		System.out.println("좌깜 : " + leftLight);
		System.out.println("우깜 : " + rightLight);
		System.out.println("---------------");
	}
	
	
	
	
	
	

}
