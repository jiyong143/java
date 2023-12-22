package DAY09.board;

import java.util.Scanner;

import DAY08.Student;

public class BoardMain {
	
	  private static Scanner scan = new Scanner(System.in);
	
	  private static board[] boardList= new board[5]; // 게시글 목록(배열) 생성

	 
	  
	  private static int count = 0; // 현재 등록된 게시글 개수

	  public static void main(String[] args) {
		/* 게시판에서 게시글 관리를 위한 콘솔 프로그램을 작성
		 * 1) 제한사항 정리
		 * 
		 *  1. 접근제어 없음(로그인, 회원가입 필요 없음) 대신 아이디 입력
		 *  2. 게시판은 1개
		 *  3. 게시글 제목과 내용은 한 줄만 가능
		 *  4. 작성일을 직접 입력
		 * 
		 * 2) 필요한 기능을 정리해서 메뉴로 출력
		 *  
		 *  메뉴
		 *  1. 게시글 목록 조회 
		 *  2. 게시글 등록
		 *  3.프로그램 종료 
		 *  
		 *  메뉴 선택 : 1
		 *  
		 *  게시글 목록
		 *  2. 가입인사 2023-12-20 asd 1
		 *  1. 공지 2023-12-19 admin 3
		 *  
		 *  메뉴
		 *  1. 게시글 상세 조회
		 *  2. 게시글 수정
		 *  3. 게시글 삭제
		 *  4. 뒤로가기
		 *  
		 *  메뉴 선택 : 2
		 *  수정할 게시글 번호 : 2
		 *  제목: 가입인사입니다.
		 *  내용: 만나서 반갑습니다.
		 *  
		 *  게시글 목록
		 *  2. 가입인사입니다. 만나서 반갑습니다. 2023-12-20 asd 2
		 *  1. 공지 2023-12-19 admin 3
		 *  
		 *  수정이 완료됐습니다.
		 *  
		 *  게시글 목록
		 *  2. 가입인사입니다. 만나서 반갑습니다. 2023-12-20 asd 2
		 *  1. 공지 2023-12-19 admin 3
		 *  
		 *  메뉴
		 *  1. 게시글 상세 조회
		 *  2. 게시글 수정
		 *  3. 게시글 삭제
		 *  4. 뒤로가기
		 *  
		 *  메뉴 선택 : 3
		 *  삭제할 게시글 번호 : 2
		 *  
		 *  게시글 목록
		 *  1. 공지 2023-12-19 admin 3
		 *  
		 *  게시글이 삭제됐습니다.
		 *  
		 *  게시글 목록
		 *  1. 공지 2023-12-19 admin 3
		 *  
		 *  메뉴
		 *  1. 게시글 상세 조회
		 *  2. 게시글 수정
		 *  3. 게시글 삭제
		 *  4. 뒤로가기
		 *  
		 *  메뉴 선택 : 4
		 *  
		 *  메뉴
		 *  1. 게시글 목록 조회 
		 *  2. 게시글 등록
		 *  3. 프로그램 종료 
		 *  
		 *  메뉴 선택 : 2
		 *  
		 *  게시글을 입력하시오
		 *  
		 *  새 게시물  새로운 게시물입니다 2023-12-21 wer 0
		 *  (이것이 게시글 목록에 추가)
		 *  
		 *  
		 *  
		 *  
		 *   
		 *  
		 *  메뉴
		 *  1. 게시물 목록 조회
		 *  2. 게시글 등록
		 *  3. 프로그램 종료
		 *  메뉴 선택 : 1
		 *  게시글 목록
		 *  3. 텍스트 2023-12-20 qwe 0
		 *  2. 가입인사입니다. 2023-12-20 asd 2
		 *  메뉴
		 *  1. 게시글 상세 조회
		 *  2. 게시글 수정
		 *  3. 게시글 삭제
		 *  4. 뒤로가기
		 *  메뉴 선택 :
		 *  
		 
		 * 3) 기능을 구현  */
		
		// board 클래스의 생성자 매개변수 순으로 입력
		/*board bd = new board(1, "공지","테스트","2023-12-20","admin");
		bd.printInfo();
		bd.update("공지-수정", "테스트-수정");
		bd.printInfoDetail();

		board[] bds = new board[100];// 배열 생성 */
		
		
		board [] boardList;
		
		int menu;
		do {
			
			printMenu();
		
			menu = scan.nextInt();
			
			runMenu(menu);
			
	}while(menu!=3);
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	  // 메서드 정의 시작
	  
	/**
	 * menu 가 주어지면 menu에 맞는 기능을 실행하는 메서드
	 * @param menu 실행할 메뉴의 번호
	 */



	private static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			
			//게시글 목록을 출력, 번호가 높은 순으로
			
			for(int i =count;i>0;i--) {
				boardList[i-1].printInfo();
			}
			
			
			printSubMenu();
			
			
			int submenu = scan.nextInt();
			
			
			runSubMenu(submenu);
			
			
			break;
			
		case 2 :
			
			insertBoard();			
			
					
			break;
			
		case 3 :
			System.out.println("프로그램 종료");
			break;
			
	    default :
	    	System.out.println("잘못된 메뉴입니다.");
		}
				
	}


	/** 게시글 정보를 입력받아 게시글을 등록하는 메서드 */

	private static void insertBoard() {
		
		scan.nextLine();
		
		System.out.print("제목 : ");
		String title = scan.nextLine();
		
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		
		System.out.print("일자 : ");
		String date = scan.next();
		
		System.out.print("작성자 : ");
		String writer = scan.next();
		
		board bd = new board(title, contents, date, writer);
		
		
		
		// 생성된 인스턴스를 배열에 저장 (몇번지)
		boardList[count]=bd;
		
		++count;// 저장된 개수를 1증가
		
		if(count < boardList.length) {
			return;
		}
				
		board []tmpList = new board[boardList.length+5];
		
		System.arraycopy(boardList,0,tmpList,0,count);
		
		boardList = tmpList;
		
	}
	
	// 주메뉴 출력 메서드

	private static void printMenu() {
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1.게시글 목록 조회");
		System.out.println("2.게시글 등록");
		System.out.println("3.프로그램 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 선택 : ");
	}
	
	// 서브메뉴  출력 메서드
	
	private static void printSubMenu() {
		System.out.println("-----------");
		System.out.println(" 서브 메뉴");
		System.out.println(" 1. 게시글 상세 조회 ");
		System.out.println(" 2. 게시글 수정 ");
		System.out.println(" 3. 게시글 삭제 ");
		System.out.println(" 4. 뒤로가기 " );
		System.out.println("-------------");
		System.out.print(" 메뉴 선택 : ");
			
	}
	
	
	// 서브메뉴 실행 메서드
	
	private static void runSubMenu(int submenu) {
		int num;
		switch(submenu) {
		
		case 1 :
			
			printBoardDetail();
									
			break;
			
		case 2:
						
			updateBoard();
									
			break;
			
		case 3 :
						
			deleteBoard();
			
			break;
			
		case 4 :
			System.out.println("메인 메뉴로 이동");
			
			printMenu();
			
			break;
			
	    default :
	    	
	    	System.out.println("서브 메뉴 다시 선택");
		}
	}

	private static void deleteBoard() {
		
		System.out.println("삭제할 게시글 번호 : ");
		
		
		int num = scan.nextInt();
		
		int index = -1;
		for(int i =0; i<count;i++) {
			if(num==boardList[i].getNum()) {
				index=i;
				break;
			}
		}
		
		if(index==-1) {
			System.out.println("일치하는 게시글이 없습니다.");
			return;
		}
		count--;
		
		if(index==count) {
			return;
		}
		
		
		board [] tmpList = new board[boardList.length];
		
		System.arraycopy(boardList,0,tmpList,0,boardList.length);
		
		System.arraycopy(tmpList,index+1,boardList,index,count-index);		
	}

	private static void updateBoard() {
		
		System.out.println("게시글 수정");
		System.out.print("게시글 선택 : ");
		
		int num = scan.nextInt();
		 
		 
		
		for(int i =0; i<count;i++) {
			if(num==boardList[i].getNum()) {
				
			
				scan.nextLine();
				 
				System.out.print("수정할 제목 : ");
				
				String title = scan.nextLine();
				
				System.out.println("수정할 내용 : ");
				
				String contents = scan.nextLine();
		
				boardList[i].update(title, contents);
				
				return;
			}
		}
		System.out.println("일치하는 게시물이 없습니다.");
	}
				
		
	private static void printBoardDetail() {
		System.out.println("게시글상세 조회");
		System.out.print("게시글 선택 : ");
		
		int num = scan.nextInt();
		
		for(int i =0; i<count; i++) {
			if(num== boardList[i].getNum()) {
				
				boardList[i].printInfoDetail();
				return;
			}
		}
		
		System.out.println("일치하는 게시글이 없다.");
		
	}
	   		
				
}