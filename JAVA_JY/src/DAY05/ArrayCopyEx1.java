package DAY05;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		//배열 복사 예제
		int arr1[] = new int[] {1,2,3,4,5};
		int arr2[] = arr1; // 이것이 되는지 궁금...
		for(int i = 0; i<5;i++) {
			System.out.println(arr2[i]); // 되는 것 같지만 이것은 복사가 아니라 공유다
		}
		
		int arr3[] = new int[arr1.length];
		
		int arr4[] = new int[arr1.length];
		
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		

		
		for(int i =0; i< 5;i++) {
			System.out.print(arr4[i] + " ");
		}
		
		int arr5[] = new int[arr1.length];
		System.arraycopy(arr1, 1, arr5, 0, 2); // arr1 배열에 1번지부터 2개 복사 arr5 배열에 0번지부터 복사
		
		System.out.println("\narr5 확인 : ");
		
		for(int i = 0 ; i<5;i++) {
			System.out.println(arr5[i] + " ");
		}		
	}

}
