package DAY10.word;

import java.util.Scanner;

import DAY09.board.board;

public class WordMain {
	
	
	private static Scanner scan = new Scanner(System.in);
	
	private static Word [] wordList = new Word[5]; // 단어 배열
		  
	private static int count = 0; // 현재 등록된 단어의 개수

	public static void main(String[] args) {
		/*  영어 단어장 프로그램 만들기
		 * 1. 기능 정리
		 * 
		 *메뉴
		 *1. 단어 목록 조회
		 *2. 새 단어 입력
		 *3. 프로그램 종료
		 *메뉴 선택 : 2
		 *
		 *
		 *
		 *
		 * 
		 * 2. 틀 작성
		 * 
		 * 3. 필요한 메서드 구현
		 */
				
		int menu;
		
		do {
			
			printMenu();
		
			menu = scan.nextInt();
			
			runMenu(menu);
			
	}while(menu!=3);
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	
	// 메서드 정의 시작
	
	
	// runSubMenu() 메서드
	
	private static void runSubMenu(int submenu) {
		int num;
		switch(submenu) {
		
		case 1 :
			
			printWordDetail();
									
			break;
			
		case 2:
						
			updateWord();
									
			break;
			
		case 3 :
						
			deleteWord();
			
			break;
			
		case 4 :
			System.out.println("메인 메뉴로 이동");
			
			printMenu();
			
			break;
			
	    default :
	    	
	    	System.out.println("서브 메뉴 다시 선택");
		}
	}
				
	
	// 주메뉴 출력 메서드
	
	private static void printMenu() {
		
		System.out.println("----------------");
		System.out.println(" 메뉴 ");
		System.out.println(" 1.단어장 목록 조회 ");
		System.out.println(" 2.새 단어 등록 ");
		System.out.println(" 3.프로그램 종료 ");
		System.out.println("-----------------");
		System.out.print("메뉴 선택 : ");		
	}
	
	
	
	// 서브메뉴 출력 메서드
	
	private static void printSubMenu() {
		
		System.out.println("----------------");
		System.out.println(" 서브 메뉴 ");
		System.out.println(" 1. 단어 세부 조회 ");
		System.out.println(" 2. 단어 수정 ");
		System.out.println(" 3. 단어 삭제 ");
		System.out.println("-----------------");
		System.out.print("메뉴 선택 : ");			
	}
	
	

	// 단어 입력 메서드
	
    private static void insertWord() {
		
		scan.nextLine();
		
		System.out.print(" 품사 : ");
		String kind = scan.nextLine();
		
		System.out.print(" 단어 : ");
		String word = scan.nextLine();
		
		System.out.print( " 의미  : ");
		String mean = scan.next();
		
		System.out.print(" 예 : ");
		String ex = scan.next();
		
		Word wor = new Word(kind, word, mean, ex);
		
		wordList[count]=wor;
		
		count++;
		
		if(count== wordList.length) {
			expandWordList();
		}
		
    }
						
		
    // 배열의 크기 확장 메서드
    
    private static void expandWordList() {
    	    	
    	// 기존 단어장보다 큰 새 단어장 생성
        Word[]tmpList = new Word[wordList.length+10];
    			// 새 단어장에 기존 단어들을 복붙
        System.arraycopy(wordList, 0, tmpList, 0, count);
    			//새 단어장을 단어장이라고 선언
        wordList = tmpList;		
	}
    
    
    
    
	// runmenu 메서드
    
    private static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			
			//게시글 목록을 출력, 번호가 높은 순으로
			
			for(int i =count;i>0;i--) {
				wordList[i-1].printWord();
			}
			
			
			printSubMenu();
			
			
			int submenu = scan.nextInt();
			
			
			runSubMenu(submenu);
			
			
			break;
			
		case 2 :
			
			insertWord();
			
								
			break;
			
		case 3 :
			System.out.println("프로그램 종료");
			break;
			
	    default :
	    	System.out.println("잘못된 메뉴입니다.");
		}
				
	}
    
    
    // 단어 상세 조회 메서드
    
    private static void printWordDetail() {
		System.out.println("게시글상세 조회");
		System.out.print("게시글 선택 : ");
		
		int num = scan.nextInt();
		
		for(int i =0; i<count; i++) {
			if(num== wordList[i].getNum()) {
				
				wordList[i].printWordDetail();
				return;
			}
		}		
		System.out.println("일치하는 단어가 없다.");		
	}
    
    
    // 단어 수정 메서드
         
    private static void updateWord() {
		
		System.out.println("단어 수정");
		System.out.print(" 단어 선택 : ");
		
		int num = scan.nextInt();
		 
		 
		
		for(int i =0; i<count;i++) {
			if(num==wordList[i].getNum()) {
							
		        scan.nextLine();
				 
				System.out.print("수정할 단어 : ");
				
				String word = scan.nextLine();
				
				System.out.println("수정할 의미 : ");
				
				String mean = scan.nextLine();
		
				wordList[i].update(word, mean);
				
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}
				
		
    // 단어 삭제 메서드
        
    private static void deleteWord() {
    	
		
		System.out.println("삭제할 단어 번호 : ");
		
		
		int num = scan.nextInt();
		
		int index = -1;
		for(int i =0; i<count;i++) {
			if(num==wordList[i].getNum()) {
				index=i;
				break;
			}
		}
		
		if(index==-1) {
			System.out.println("일치하는 단어가 없습니다.");
			return;
		}
		count--;
		
		if(index==count) {
			return;
		}
		
		
		Word [] tmpList = new Word[wordList.length];
		
		System.arraycopy(wordList,0,tmpList,0,wordList.length);
		
		System.arraycopy(tmpList,index+1,wordList,index,count-index);		
	}
    
    
}
    
    

