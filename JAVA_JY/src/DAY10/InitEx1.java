package DAY10;

public class InitEx1 {

	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.num1);// num1 은 int 의 기본값으로 초기화
		System.out.println(B.num2);//  "
		System.out.println(b.num3);//    " => 명시적 초기화로 덮어씀 B
		System.out.println(B.num4);//   " => 명시적 초기화로 덮어씀 B
		System.out.println(b.num5);//기본값 0 -> 명시적 초기화 10 -> 초기화 블록 3
		System.out.println(B.num6);//기본값 0 -> 명시적 초기화 20 -> 초기화 블록 4
		System.out.println(b.num7);

	}

}

class B{
	int num1;
	int num3 =1;
	int num5;
	int num7 =30;
	{
		num5 = 3;
		num7 =500;
	}
	static int num2;
	static int num4 =2;
	static int num6;
	static {
		num6 =4;
	}
	public B() {
		num7 =5;
	}
	
}
