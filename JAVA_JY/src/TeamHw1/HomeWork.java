package TeamHw1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HomeWork implements HomeWorkProgram {
	
	static Scanner scan = new Scanner(System.in);
	
	// wordList list 생성
	static List<DataClass>wordList = new ArrayList<DataClass>(); 
	
	private final int EXIT =4;
	
	

	// 프로그램 실행 메서드
	
	@Override
	public void run() {
		
		int menu =0;
		
		do {
			printMenu();
			
			try {
				
				menu = scan.nextInt();
				
				runMenu(menu);
				
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴 입력");
				scan.nextLine(); // 입력 오류 방지
			}
			
			
		}while(menu!=EXIT);
		
	}

	
	
	// 메인메뉴 출력 메서드

	@Override
	public void printMenu() {		
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1.단어 추가,삭제");
		System.out.println("2.스펠링,품사,뜻 수정 또는 뜻 추가");
		System.out.println("3.단어 조회");
		System.out.println("4.종료");
		System.out.println("-----------------");
		System.out.print("메뉴 입력 :");		
	}

		
	
	
	
	// 메인메뉴 실행 메서드
	
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		
		case 1 :
			
			wordManager();
			
			break;
			
		case 2 :
			 
			updateManager();
			
			break;
			
		case 3 :
			
			selectManager();
			
			break;
			
		case 4 :
			System.out.println("프로그램 종료");
			break;
			
		default : 
			
			throw new InputMismatchException("잘못된 메뉴 입력");
		}
	}

	
	
	
	
	// 메인메뉴 3번째 항목 실행 메서드
	
	public void selectManager() {
		
		System.out.println("단어 조회 기능을 선택했습니다.");
		
		if(wordList.size()==0) {
			System.out.println("조회할 단어가 없음");
			return;
		}
		//조회되는 단어를 보여줌
		boolean tf=true; //만약 num이 1아니여도 출력하기위한 장치 
		for(DataClass tmp:wordList) {
			if(tmp.getNum()==1) {
				System.out.println("단어:"+tmp.getWord());
				tf=false;
			}
		}
		
		//테스트
		/*if(tf) {
			for(DataClass tmp:wordList) {
				if(tmp.getNum()==0) {
					System.out.println("단어:"+tmp.getWord());
					break;
				}
			}
		}*/
		
		//조회할 단어 선택 
		System.out.println("-----------------");
		System.out.print("조회 할 단어 입력 : ");
		//조회할 단어 입력
		String word=scan.next();
		System.out.println("-----------------");
		//단어 품사 뜻을 보여줌
		
		for(DataClass tmp:wordList) {
			if(tmp.getNum()==1&&tmp.getWord().equals(word)) {
				System.out.println("단어:"+tmp.getWord()+" 품사:"+tmp.getWdClass());
				System.out.println("뜻:"+tmp.getDef());
			}
		}
		System.out.println("입력한 단어가 없습니다.");
		
		//뜻만 보여줌
		for(DataClass tmp:wordList) {
			if(tmp.getNum()==0&&tmp.getWord().equals(word)) {
				if(tf) {
					System.out.println("단어:"+tmp.getWord()+" 품사:"+tmp.getWdClass());
					tf=false;
				}
				System.out.println("뜻:"+tmp.getDef());
			}
		}
		
	}
		
	
	
	
	
	// 메인메뉴 2번째 항목 실행 메서드
	
	public void updateManager() {
		
		printUpdateSubMenu();
		
		int updateSubMenu = scan.nextInt();
		
		runUpdateSubMenu(updateSubMenu);	
		
	}
	
	
	
	
	
    // 메인메뉴 1번째 항목 서브메뉴 출력 메서드
	
	public void printWordSubMenu() {
		
		System.out.println("단어 추가 및 삭제 기능을 선택했습니다.");
		System.out.println("------------");
		System.out.println("메뉴");
		System.out.println("1.단어 추가");
		System.out.println("2.단어 삭제");
		System.out.println("------------");
		System.out.print("메뉴 입력 : ");
	}
	
	
	
	
	
	// 메인메뉴 2번째 항목 서브메뉴 출력 메서드
	
	public void printUpdateSubMenu() {
		System.out.println("수정 및 뜻 추가 기능을 선택했습니다.");
		System.out.println("------------");
		System.out.println("메뉴");
		System.out.println("1.스펠링 수정");
		System.out.println("2.품사 수정");
		System.out.println("3.뜻 수정"); 
		System.out.println("4.뜻 추가");
		System.out.println("------------");
		System.out.print("메뉴 입력 : ");		
	}

	
	
	
	
	// 메인메뉴 1번째 항목 실행 메서드
	
	public void wordManager() {
		
		printWordSubMenu();
		
		int wordSubMenu=scan.nextInt();
		
		runWordSubMenu(wordSubMenu);		
	}

	
	
	
	
	// 메인메뉴 1번째 항목의 서브메뉴 실행 메서드
	
	public void runWordSubMenu(int wordSubMenu) {
		
		switch(wordSubMenu) {
		
		case 1 :
			
			insertWord(); // 단어 추가 (스펠링,품사,뜻 순으로  모두 입력)
			
			break;		
			
			
		case 2 :
			
			deleteWord(); // 입력한 단어를 단어장에서 모두 삭제
			
			break;
			
		default :
							
			throw new InputMismatchException("잘못된 메뉴 입력");
		}
		
	}
			
				
	
	
	
	// 메인메뉴 2번째 항목의 서브메뉴 실행 메서드

	public void runUpdateSubMenu(int updateSubMenu) {
		
		switch(updateSubMenu) {
		
		case 1 :
			
			updateSpelling(); // 스펠링 수정 메서드 : 단어장에 있는 특정 단어의 스펠링을 모두 수정
			
			break;
			
		case 2 :
			
			updateWdClass(); // 품사 수정 메서드 : 단어와 뜻을 입력해서 품사를 수정
			
			break;
			
		case 3 :
			
			
			updateDef(); // 뜻 수정 메서드 : 단어와 뜻을 입력해서 수정하되 뜻이 기존에 있는 것이 아니여야 하고, 수정후 품사도 다시 입력해서 바꿔야 한다.
			
			
			break;
			
		case 4 :
			
			
			addDef(); // 뜻 추가 메서드 : 단어 입력후 기존에 없는 뜻과 품사를 입력한다
			
			
			break;
			
		default :
			
			throw new InputMismatchException("잘못된 메뉴 입력");
		}
	}
			
				
		
	
		
	// 뜻 추가 메서드 : 단어 입력 후 기존에 없던 새로운 뜻을 추가하고 대응하는 품사도 같이 입력해서 단어장에 추가한다.

	public void addDef() {
		
	System.out.println("뜻 추가 기능을 선택했습니다.");
		System.out.print("뜻을 추가할 단어 입력 :");
		String word=scan.next();
		for(DataClass tmp:wordList) {
			if(tmp.getWord().equals(word)) {
				System.out.print("추가할 새로운 뜻 입력 :");
				String newDef=scan.next();
				//중복 시 메세지출력
				if(tmp.getDef().equals(newDef)) {
					System.out.println("이미 있는 뜻입니다.");
					return;
				}
				System.out.print("새로운 뜻의 품사 입력 : ");
				String newWdClass = scan.next();
				
				wordList.add(new DataClass(word, newWdClass, newDef, 0));
				//System.out.println(wordList); //테스트
				return;
			}
		}
		System.out.println("없는 단어 입니다");
	}
		
		
	
	
	
	// 뜻 수정 메서드 : 단어와 뜻을 입력해서 수정하되 뜻이 기존에 있는 것이 아니여야 하고, 수정후 품사도 다시 입력해서 바꿔야 한다.

	public void updateDef() {
		
		System.out.println("뜻 수정 기능을 선택했습니다.");
		//수정할 단어와 뜻을 입력받음
		System.out.print("뜻을 수정할 단어 입력 :");
		String word=scan.next();
		System.out.print("수정하려는 뜻 입력 : ");
		String def=scan.next();
		//일치하면 수정함
		for(DataClass tmp:wordList) {
			if((tmp.getWord().equals(word))&&(tmp.getDef().equals(def))) {
				System.out.print("수정할 뜻 입력 : ");
				String newDef=scan.next();
				//수정하는 뜻이 존재하면 메세지 출력
				
				// 해당 단어안에서만 해야한다...
				for(DataClass stmp:wordList) {
					if(stmp.getDef().equals(newDef)) {
						System.out.println("이미 존재하는 뜻입니다.");
						return; // 다시 수정하려는 뜻 입력
					}
				}
				//같은 뜻이 없으면 수정
				tmp.setDef(newDef);
				
				// 뜻을 수정했으니 품사도 입력해서 바꾸자
				
				System.out.print("바꾼 뜻의 품사를 수정하시겠습니까?[ 0 : No , 1 : Yes ]");
				
				try {
				int select = scan.nextInt();
				
				// 품사 수정을 원한 경우
				if(select==1) {
					System.out.print("수정할 품사 입력 : ");
					String newWdClass = scan.next();
					
					tmp.setWdClass(newWdClass);
					// 품사 수정을 원하지 않는 경우
				}else if(select==0) {				
				System.out.println("뜻 수정을 완료했습니다.");
				}
				
				}catch(InputMismatchException e) {
					System.out.println("다시 선택해주세요");
					scan.nextLine();
				}
				return;
			}
		}
		//일치하는 단어나 뜻이 없으면 메세지 출력
		System.out.println("단어나 뜻을 잘못 입력했습니다.");
	}
		
		
	
	
	
	// 품사 수정 메서드 : 단어와 뜻을 입력받아 기존 품사를 수정
	
	public void updateWdClass() {
		
		//수정할 단어와 뜻을 입력받음
		System.out.print("품사를 수정할 단어 입력 : ");
        String word=scan.next();
		System.out.print("단어의 뜻 입력  : ");
		String def=scan.next();
		//일치하면 수정함
		for(DataClass tmp:wordList) {
			if((tmp.getWord().equals(word))&&(tmp.getDef().equals(def))) {
				System.out.print("수정할 품사 입력 : ");
				String newWdClass =scan.next();
				tmp.setWdClass(newWdClass);
			}
		}
		System.out.println("단어나 뜻을 다시 입력하세요.");		
	}
						
		
	
	
	// 스펠링 수정 메서드 : 입력한 단어의 스펠링을 모두 바꾼다
	
	 public void updateSpelling() {
		
		 System.out.print("스펠링을 수정할 단어 입력 : ");
		 
		 String word = scan.next();
		 
		 System.out.print("새롭게 수정할 단어 입력 : ");
		 
		 String newWord = scan.next();
		 
		 boolean tf =true;
		 for(DataClass tmp : wordList) {
			 if(tmp.getWord().equals(word)) {
				 tmp.setWord(newWord);
				 tf=false;
				 
			 }
		 }
		 if(tf) {
			 System.out.println("입력한 단어가 없습니다.");
		 }		 	
	}
	
	 	 

	// 단어 전체 삭제 메서드 : 입력한 단어를 모두 삭제

	public void deleteWord() {
		
		System.out.println("단어 삭제 기능을 선택했습니다.");
		System.out.print("삭제할 단어 입력 :");
		String word=scan.next();
		//삭제 확인용
		boolean t=false;
		//해당 단어를 전부삭제 
		Iterator<DataClass> it=wordList.iterator();
		while(it.hasNext()) {
			String n=(String)it.next().getWord();
			if(n.equals(word)) {
				it.remove(); // 입력한 word를 단어장에서 하나하나 모두 삭제
				t=true;
			}
		}
		// t가 true 라는 것은 입력한 word가 단어장에 최소한 1개라도 있다는 뜻
		if(t) {
			System.out.println("입력한 단어를 삭제했습니다.");
			return;
		}
		System.out.println("삭제할 단어가 없습니다.");
	}
		
	
	
	

	// 새로운 단어 추가 메서드 : 단어,품사,뜻 순으로 무조건 모두 입력하여 단어장에 추가

	public void insertWord() {
		
		System.out.println("단어 추가를 선택했습니다.");
		System.out.print("추가할 단어 입력 : ");
		String word=scan.next();
		//같은 단어가 있으면 메세지를 출력후 종료
		for(DataClass tmp:wordList) {
			if(tmp.getWord().equals(word)) {
				System.out.println("같은 단어가 있습니다.");
				return;
			}
		}
		System.out.print("품사 입력 : ");
		scan.nextLine();
		String wdclass=scan.nextLine();
		System.out.print("뜻 입력 : ");
		String def=scan.next();
		wordList.add(new DataClass(word, wdclass, def, 1));
		//System.out.println(wordList); //테스트		
	}
		
	
	
	
}

