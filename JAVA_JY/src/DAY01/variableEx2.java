package DAY01;

public class variableEx2 {

	public static void main(String[] args) {
		// 정수형 변수 선언 예제
		byte num1 = 1;
		System.out.println(num1);
		byte num2 = 128; //byte 는 127까지 표현 가능해서 128을 저장할 수 없다

		byte num3 = (byte)(127+1); //byte 의 양수 표현 범위를 넘어서 오버플로우 발생하여 -128이 됨
		System.out.println(num3);
		
		byte num4 = (byte)(-128-1); //byte 의 음수 표현 범위를 넘어서 언더플로우가 발생하여 127이 됨
		System.out.println(num4);
		
		int num5 = 128;
		System.out.println(num5);
		
		int num6 = 123456789123; // int 역시 양수 표현 범위를 넘어서 저장할 수 없다
		
		int num7 = 010; // 8진수  10 > 10진수 8
		int num8= 0x10; // 16진수 10 > 10진수 16
		int num9 = 0b10;// 2진수  10 > 10진수 2
		
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		
		long num10 = 123456789123L;// 큰수로 초기화하는 경우 기본 타입이 int 여서 뒤에 접미사 L 붙인다
		System.out.println(num10);		
	}

}
