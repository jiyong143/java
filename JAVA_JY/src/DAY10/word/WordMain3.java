package DAY10.word;

import java.util.Scanner;

// WordMain 풀이
public class WordMain3 {

	private static Scanner scan = new Scanner(System.in);
	
	private static Word2 [] list = new Word2[10];
	
	private static int count =0;
	
	public static void main(String[] args) {
		
		int menu;
		
		do {
			printMenu();
			
			menu= scan.nextInt();
			
			runMenu(menu);
		    
	}while(menu!=5);
		
	}
	
	//메서드 정의 공간
	
	public static void printMenu() {
		System.out.println("----------");
		System.out.println(" 1. 단어 등록 ");
		System.out.println(" 2. 단어 검색 ");
		System.out.println(" 3. 단어 수정 ");
		System.out.println(" 4. 단어 삭제 ");
		System.out.println(" 5. 종료 ");
		System.out.println("----------");
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			insertWord();
			
			break;
			
		case 2 : 
			
			searchWord();
			break;
			
		case 3 :
			
			updateWord();
			break;
			
		case 4 :
			deleteWord();
			
			break;
			
		case 5:
			System.out.println("프로그램 종료!");
			break;
			
		default :
			System.out.println("잘못된 메뉴 선택");
		}
				
	}
	
	
	public static void insertWord() {
		// 단어와 뜻 입력
		System.out.println("단어 : ");
		String word = scan.next();
		
		System.out.println("의미 : ");
		scan.nextLine();
		String meaning = scan.nextLine();
		
		Word2 tmp = new Word2(word,meaning);
		
		list[count] = tmp;
		
		count++;
				
		for(int i =0; i<count;i++) {
			list[i].print();
		} // 입력 잘 됐는지 확인
		
		if(count== list.length) {
			expandWordList();
		}
		
		// 단어와 뜻을 이용하여 Word의 인스턴스를 생성
		
		
		// 위에서 생성한 인스턴스를 단어장에 저장
		
		// 저장된 단어의 개수를 1 증가
	}
	
	public static void expandWordList() {
		// 기존 단어장보다 큰 새 단어장 생성
		Word2[]tmpList = new Word2[list.length+10];
		// 새 단어장에 기존 단어들을 복붙
		System.arraycopy(list, 0, tmpList, 0, count);
		//새 단어장을 단어장이라고 선언
		list = tmpList;
	}
	
	public static void searchWord() {
		
		System.out.println("단어 : ");
		String word = scan.next();
		
		for(int i =0; i<count;i++) {
			if(list[i].equals(word)) {
				list[i].print();
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");		
	}
	
	public static void updateWord() {
		
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.print("의미 : ");
		scan.nextLine(); // 엔터 처리
		
		String meaning = scan.nextLine();
		for(int i =0; i<count;i++) {
			if(list[i].equals(word)) {
				
				list[i].update(meaning);
				System.out.println("단어 수정 완료");
				return;
			}
		}
		
		System.out.println("일치하는 단어가 없습니다.");		
	}
	
	
	public static void deleteWord() {
		System.out.print("단어 : ");
		String word = scan.next();
		
		int index=-1;
		for(int i=0;i<count;i++) {
			
			if(list[i].equals(word)) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("일치하는 단어 없음");
			return;
		}
		
		count--;
		
		System.out.println("삭제 완료");
		
		if(index==count) {
			return;
		}
		
		Word2[]tmpList = new Word2[list.length];
		
		System.arraycopy(list, 0, tmpList, 0, list.length);
		
		System.arraycopy(tmpList, index +1, list, index, count-index);
		
	}
}
