package DAY05;

public class RandomArrayEx2 {

	public static void main(String[] args) {
		/* 1에서 9 사이의 중복되지 않은 랜덤한 수 3개를 저장하는 예제 */
		 
		int i;
		int min =1, max =9;
		int arr[] = new int[3];
		int count = 0; // 배열에 저장된 중복되지 않는 수의 개수
		// 배열에 중복되지 않은 수 3보다 작으면 반복
		
		while(count < 3) {
			int r = (int)(Math.random( )*(max-min+1)+min);
			
			boolean duplicated = false; // 중복 여부를 알려주는 변수로, true 이면 중복,false 이면 중복이 아니다
			for( i = 0; i<count;i++);
			if(arr[i]==r) {
				break;
			}
		}
		if(!duplicated){
			arr[count]=r;
			count++;
				
			}
			
		}
		

	}

}
