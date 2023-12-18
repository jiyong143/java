package DAY06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		
		/* 단어를 입력받아서 단어 각 알파벳이 몇번 나왔는지 출력하는 코드 작성 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영어 단어를 입력하세요 : ");
		
		String str = scan.next();
		
		int [] arr = new int[26];
		
		for(int i =0; i< str.length(); i++) {
			
			char ch = str.charAt(i);
			
			arr[ch-'a']++;			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				char ch = (char)('a'+i);
				System.out.println(ch + " : " + arr[i] + " 개 ");
			}			
		}
		// 다른 방법
		System.out.println("=============");
		char ch = 'a';
		for(int count:arr) {
			if(count !=0) {
				System.out.println(ch + " : " + count);
			}
		}
		scan.close();						
	}
}