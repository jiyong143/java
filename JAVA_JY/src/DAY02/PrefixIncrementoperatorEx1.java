package DAY02;

public class PrefixIncrementoperatorEx1 {
    //증감 연산자 예제
	public static void main(String[] args) {
		int num1 = 1, num2 = 1;
		//num1은 전위형 증가 연산자, num2는 후위형 증가 연산자
		System.out.println("증가 전: num1 = "+ num1 + ", num2 = "+ num2);
		System.out.println("증가 중: num1 = "+ ++num1 + ", num2= " + num2++);
		System.out.println("증가 후: num1 = "+ num1 + ", num2 = "+ num2);
		
		System.out.println("========================");
		
		
	}

}
