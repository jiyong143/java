package DAY14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		
		
		// 정수를 5개 입력받아 입력받은 정수를 리스트에 저장하고, 출력하는 코드 작성
		// 정수를 여러개 저장하기 위해 ArrayList 인스턴스 생성
		// 정수이기 때문에 Integer 를 추가, int 가 안되는 이유는 제네릭은 클래스만 올 수 있어서
		
		
		// 콘솔창에서 다양한 값을 입력받기 위한 Scanner 인스턴스 생성
		// 콘솔창에서 입력받아야 하기 때문에 표준 입력인 System.in 인스턴스를 전달
		Scanner scan = new Scanner(System.in); 
		
		
		
        ArrayList<Integer> list = new ArrayList<Integer>(); // list 생성
        
        
        // 입력받은 정수의 개수
        int count =5;
        
        
        // System에 있는 out 인스턴스에서 제공하는 print 메서드를 이용하여 콘솔창에 문자열을 출력
        System.out.println("정수 5개 입력 : "); // 정수 5개 입력
    
       
        // 5번 반복하기 위해 반복문 작성
     		
		for(int i =0;i<count;i++) {
			
			// 입력 버퍼에 있는 값중 정수 값을 가져옴
			// 정수가 아니면 예외 발생
			int tmp = scan.nextInt();
			
			// Collection 에서 제공하는 add 메서드를 이용해 리스트에 정수값을 추가
			// int인 tmp 가 Integer로 박싱이 되면서 리스트에 추가
			list.add(tmp);
		}
		// 입력한 5개의 정수를 list에 추가
		
		
		for(int tmp : list) {
			
			System.out.print(tmp); // list 의 5개 정수들 출력
		}

	}

}
