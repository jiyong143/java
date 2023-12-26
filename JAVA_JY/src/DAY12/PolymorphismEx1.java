package DAY12;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		/* 다형성 예제
		 * 1. 매개변수 다형성
		 * 
		 */
		Remocon r = new Remocon();
		Tv tv = new Tv();
		AirConditioner aircon = new AirConditioner();
		Projector projector = new Projector();
		r.turnOn(tv);
		r.turnOn(aircon);
		r.turnOn(projector);
		

	}

}

// 리모콘 : tv 나 에어컨 등을 켜는 기기
class Remocon{
	
	void turnOn(ElectronicProduct target) {
		if(target instanceof Tv) {
			System.out.println("Tv");
		}else if(target instanceof AirConditioner) {
			System.out.println("에어컨");
		}else if(target instanceof Projector) {
			System.out.println("프로젝터");
		}else {
			System.out.println("전자");
		}
		System.out.println("제품이 켜졌습니다.");
	}
	
}

class ElectronicProduct{
	
}

class Tv extends ElectronicProduct {
	
}

class AirConditioner extends ElectronicProduct {
	
}

class Projector extends ElectronicProduct{
}



