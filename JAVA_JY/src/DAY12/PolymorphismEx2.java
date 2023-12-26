package DAY12;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		/* 다형성 예제
		 * 2. 포함 다형성
		 * - 자식 인스턴스들을 부모 인스턴스가 관리하는 것
		 */
		
		Rect[] rects= new Rect[10];
		Ellipse[]ellipse = new Ellipse[10];
		Line[]lines=new Line[10];
		
		int rectCount =0, ellipseCount =0, lineCount=0;
		
		rects[rectCount++]=new Rect();
		
		ellipse[ellipseCount++] = new Ellipse();
		
		lines[lineCount++] = new Line();
		
		lines[lineCount++] = new Line();
		
		rects[rectCount++] = new Rect();
		
		// 다형성을 이용한 방법
		Shape[] shapes = new Shape[30];
		
		int count =0;
		
		

		shapes[count++] =new Rect();
		
		shapes[count++] = new Ellipse();
		
		shapes[count++] = new Line();
		
		shapes[count++] = new Line();
		
		shapes[count++] = new Rect();
		
		for(int i=0; i<count;i++) {
			shapes[i].draw();
		}
	}
}
		
		
		
		
		
	



class Shape{
	void draw() {}
		
	
}



class Rect extends Shape{
	void draw() {
		System.out.println("사각형");
	}
}

class Ellipse extends Shape{
	void draw() {
		System.out.println("타원");
	}
}

class Line extends Shape{
	void draw() {
		System.out.println("선");
	}
}
