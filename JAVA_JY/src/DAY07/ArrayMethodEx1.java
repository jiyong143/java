package DAY07;

import java.util.Scanner;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
		// 1에서 45 사이의 중복되지않는 랜덤한 수 6개를 만드는 코드 작성( 메서드 이용)
		
		
		
		
		int arr[]=new int[5];
		int min=1,max=5;
		if(createRandomArray(min,max,arr)) {
			System.out.println("배열 생성 성공!");
			for(int tmp : arr){
				System.out.print(tmp + " ");
			}
			System.out.println();
		}else {
			System.out.println("배열 생성 실패!");
			} //
		
		
		// 1에서 45 사이의 중복되지 않는 수 6개를 입력하는 코드 (contains 메서드 이용)
		
		int user[] = new int[6];
		int count = 0;
		Scanner scan = new Scanner(System.in);
				
		System.out.println(" 정수 6개 입력(중복 X, 1~45) : ");
		while(count<user.length) {
			int num = scan.nextInt();
			if(!contains(user,count,num)&&(num>=min&&num<=max)) {
				user[count]=num;
				count++;
			}
		}
		for(int tmp : user) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		scan.close();
		

	}
	
	
	/* min ~ max 사이의 중복되지 않는 랜덤한 수를 배열에 만들고 생성여부를 알려주는 메서드
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	// 첫 번째 메서드 :배열이 주어지고 배열의 0번지부터 n개 중에서 num와 같은 값이 있는지 없는지 알려주는 메서드
	public static boolean contains(int[]arr,int n ,int num) {
		
		if(arr==null||arr.length==0) {
			return false;
		}
		if(arr.length < n) {
			n=arr.length;
		}
		for(int i =0;i<n;i++) {
			if(arr[i]==num) {
				return true;
			}
		}		
		return false;
	}
	
	
	// 두번째 메서드 : min ~max 사이의 중복되지 않는 랜덤한 수를 배열에 만들어주고 생성여부를 알려주는 메서드 */
	
	
	public static boolean createRandomArray(int min, int max, int []arr) {
		
		if(max<min) {
			int tmp=min;
			min=max;
			max=tmp;
		}
				
		if(arr.length>max-min+1) {
			return false;
		}
				
		int count =0;
		
		while(count<arr.length) {
			int r =random(min,max);
			
			if(!contains(arr,count,r)) {
				arr[count]=r;
				count++;
			}			
		}				
		return true;
	}
	
		
	// 세번 째 메서드 : 두 수 사이의 랜덤한 값을 반환하는 메서드
	public static int random(int min, int max) {
		if(max<min) {
			int tmp = max;
			max=min;
			min=tmp;
		}
				
		return (int)(Math.random()*(max-min+1)+min);
	}
}