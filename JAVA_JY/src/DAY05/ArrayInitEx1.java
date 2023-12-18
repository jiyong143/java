package DAY05;

public class ArrayInitEx1 {

	public static void main(String[] args) {
		//arr1 배열에는 0번지부터 4번지까지 모두 0으로 초기화 됨
		//char 는 \0 , 정수는 0, 실수는 0.0 , boolean 는 false
		
		int arr1[] = new int[5];
		
		int arr2[]= new int[] {1,2,3,4,5};// 이렇게 번지에 숫자를 넣을 수 있다
		
		arr2 = new int[] {3,4,5,6,7}; // 초기화 가능
		
		int arr3[] = {1,2,3,4,5}; // 위 arr2 처럼 초기화는 불가능		
	}

}
