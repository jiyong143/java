package DAY05;

import java.util.Arrays;

// 향상된 for 문

public class EnhancedForLoopEx1 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};
		
		for(int i =0; i<arr.length;i++) {
			int tmp = arr[i];
			System.out.print(tmp+ " ");
		}
		System.out.println();
		
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

}
