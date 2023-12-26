package DAY12.Protected2;

import DAY12.Protected1.A;

public class B extends A {
	
	public void print() {
		//System.out.println("num1" + num1); private 여서 에러발생
		//System.out.println("num2" + num2); default 여서 다른 패키지에 있는 클래스에서는 접근 안됨
		System.out.println("num3" + num3); // protected 여서 다른 패키지 상관 없이 자식 클래스에서 접근 가능 
		System.out.println("num4" + num4); // public 이어서 접근 가능
	}

}
