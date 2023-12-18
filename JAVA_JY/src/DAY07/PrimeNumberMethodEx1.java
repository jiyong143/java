package DAY07;

public class PrimeNumberMethodEx1 {

	public static void main(String[] args) {
	
		int num =3;
		if(isPrimeNumber(num)) {
			System.out.println(num + " 는 소수 ");
		}else {
			System.out.println(num +" 는 소수가 아님 ");
		}
		
		if(isPrimeNumber2(num)) {
			System.out.println(num + " 는 소수");
		}else {
			System.out.println(num + " 는 소수가 아님 ");
		}
		
		for(int i =1;i<=100;i++) {
			if(isPrimeNumber(i)==true) {
				System.out.print(i + " ");
			}
		}
		
	}
		// 주어진 num가 소수인지 아닌지 판별하는 코드를 작성(메서드 이용)
		/* 기능  : 주어진 정수가 소수이면 소수라고 알려주고 아니면 아니라고 알려주기
		 * 매개변수 int num
		 * 리턴타입 : boolean
		 * 메서드명: ispimenumber 
		 */
		
	public static boolean isPrimeNumber(int num) {
		
		int count =0;
		for(int i =1;i<=num;i++) {
			if(isDivisor(num,i)) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
		
	}
	
	
	public static boolean isDivisor(int num1 ,int num2) {
		
		return num1 % num2 ==0;
	}
	
	public static boolean isPrimeNumber2(int num) {
		for(int i =2; i<num;i++) {
			if(isDivisor(num,i)) {
				return false;
			}
		}
		
		
		return num != 1;
	}
		
	

}
