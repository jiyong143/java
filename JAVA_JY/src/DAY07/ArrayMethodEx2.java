package DAY07;

public class ArrayMethodEx2 {

	public static void main(String[] args) {
		
		
		
		int [] arr1 = new int[5];
		initArray1(arr1);
		printArray(arr1);
		

	}
	
	/* 기능 : 정수 배열에 1부터 순차적으로 저장하는 메서드(잘못된 메서드)
	 * 매개변수 : 정수 배열 => int []arr
	 * 리턴타입 : 없음 => void
	 * 메서드명 : initArray1
	 */
	
	
	public static void printArray(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	public static void initArray1(int []arr) {
		arr = new int[10];
		for(int i =0; i<arr.length;i++) {
			arr[i]=i+1;
		}
	}
	
	
	/* 기능 : 정수 배열에 1부터 순차적으로 저장하는 메서드(올바른 메서드)
	 * 매개변수 : 정수 배열 => int []arr
	 * 리턴타입 : 없음 => void
	 * 메서드명 : initArray2
	 */
	
	
	
	
	/* 기능 : 정수가 주어지면 정수 크기에 배열을 생성하고 배열에 1부터 순차적으로 저장하여 만들어진 배열을 알려주는 메서드(다른 메서드)
	 * 매개변수 : 정수 배열 => int []arr
	 * 리턴타입 : 없음 => void
	 * 메서드명 : initArray3
	 */
	
	
	
	

}
