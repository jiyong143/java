package DAY01;

public class typecastingEx2 {
    //강제(명시적) 자료형 변환 예제 
	public static void main(String[] args) {
		
		int num1 = (int)3.14;
		System.out.println(num1);//소수점이 사라져서 자동으로 변환이 안됨.. 그래서 강제로 해야함
		
		byte num2 =(byte)num1;// num1이 3이 저장돼 있어서 바로 저장할 수 있어 보여도 강제로 해야 함
		
		byte num4 = (byte)128;
		
		//에러가 발생하지는 않지만 필요에 의해 형변환을 하는 경우
		System.out.println(1/2);
		

	}

}
