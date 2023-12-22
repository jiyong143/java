package DAY08;

public class ArgsMethodEx1 {

	public static void main(String[] args) {
		
		// 가변 매개변수를 이용한 예제 ( 밑에 두 함수 차이 인식 )
		
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3)); 
		
		System.out.println(sum2(new int[0]));
		System.out.println(sum2(new int[] {1}));
		
		

	}
	
	/* 기능 : 주어진 정수들의 합을 계산하여 알려주는 메서드
	 * 매개변수 : 정수들 => int ...nums
	 * 리턴 타입 : int
	 * 메서드명 : sum */

	public static int sum(int ...nums) {
		int sum=0;
		if(nums.length == 0) {
			return 0;
		}
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	

	public static int sum2(int []nums) {
		int sum=0;
		if(nums.length == 0) {
			return 0;
		}
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	
	
	
	
	
	
}
