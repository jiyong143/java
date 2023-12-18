package DAY05;

import java.util.Arrays;

public class ArraySortEx1 {

	public static void main(String[] args) {
		//배열 정렬 방법
		
		int arr[] = new int[] {1,3,5,7,2,4,6,8};
		
		//버블정렬
		/* 옆에 인접한 값들을 비교하여 정렬하는 방식 */
		
		for(int i =0; i<arr.length -1 ; i++) {
			for(int j =0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp; //  순서를 바꿔주는 방법
				}
			}
		} // 정렬 완료
		  
		// 제대로 됐는지 확인
		
		for(int i =0; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}// 잘 됐음
		
		int arr2[] = {1,3,5,7,9,2,4,6,8};
		
		
		Arrays.sort(arr2); // 오름차순으로 정렬해줌
		
		for(int i =0; i<arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		} // 확인
		
	
	}
}
