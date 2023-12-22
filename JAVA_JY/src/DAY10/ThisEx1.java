package DAY10;

public class ThisEx1 {

	public static void main(String[] args) {
		point pt1 = new point();
		pt1.print();
		point pt2 = new point(1,2);
		pt2.print();

	}

}


// 점을 나타내는 point 클래스 만들기


// public 하면 클래스 이름과 파일 이름 같아야 함
class point{
	private int x,y;

	public int getX() {
		return this.x; // 여기서의 this 는 생략 가능
	}

	public void setX(int x) {
		
		// 여기서는 this 를 반드시 써야 한다
		//  멤버변수와 매개변수를 구별하기 위해서
		this.x = x;
	}
	
	public point(int x, int y) {
		// this 를 잘못 사용하면 객체 초기화 완료 안될 수 있어서 조심해서 사용
		this.x = x;
		this.y = y;
		System.out.println(" 매개변수 2개 생성자 ");
	}
	
	public point() {
		// 이 위치에 this 생성자 이외의 다른 실행문이 오면 안됨
		
 		this(0,0); // x=0, y=0 으로 초기화 하기위해 위에 있는 생성자 호출
		System.out.println(" 기본 생성자 ");
	}
	
	public point(int x) {
		this.x = x;
	}
	
	
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// getter 와 setter 필요
	
	
	
	
}