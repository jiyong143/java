package DAY11.product;

import java.util.Scanner;

import DAY10.word.Word2;

public class ProductMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	
	private static int count=0; // 현재 제품 목록의 개수
	
	private static Product [] productList = new Product[5];

	public static void main(String[] args) {
		
		
		/* 제품을 관리하는 프로그램 구현
		 * 메뉴
		 * 1. 제품 입고
		 * - 제품을 판매하기 위해 다른 곳에서 제품을 구매
		 * 2. 제품 판매
		 * - 입고된 제품을 판매
		 * 3. 제품 수정[가격]
		 * 4. 제품 매출 내역 조회
		 * 5. 종료
		 */
		
		int menu;
		
		do {			
			printMenu();
			
			menu = scan.nextInt();
			
			runmenu(menu);
						
		}while(menu!=5);
		System.out.println("프로그램을 종료합니다.");
	
	}

	// 메서드 정의 공간
	
	
	// 메뉴 작동 메서드
	
	private static void runmenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			insertProduct();
			
			break;
			
		case 2 :
			
			printProductList();
						
			System.out.print(" 판매할 제품 선택 : ");
			
			int sellNum = scan.nextInt();
			
			runSell(sellNum);
				
			break;
			
		case 3 :
			
			printProductList();
			
			System.out.print(" 가격을 수정할 제품 선택 : ");
			
			int updateNum = scan.nextInt();
			
			System.out.print(" 수정할 가격 입력 : ");
			
			int updatecost = scan.nextInt();
			
			updateCost(updateNum,updatecost);
			
			break;
			
		case 4 :
			
			
			break;
			
		case 5 :
			
			System.out.println(" 프로그램 종료 ");
			break;
			
		default : 
			
			System.out.println(" 잘못된 메뉴 선택 ");
			
		}
		
	}
	
	// 제품 목록 중 선택한 제품의 가격을 입력한 가격으로 수정하는 메서드
	
	private static void updateCost(int updateNum, int updatecost) {
		
		for(int i =0; i< count;i++) {
			if(updateNum==productList[i].getNum()) {
				productList[i].setCost(updatecost);
			}
		}
		System.out.println("일치하는 제품 번호가 없습니다.");
		
	}



	// 제품 목록 출력 메서드
	
    private static void printProductList() {
		
    	for(int i = count;i>0;i--) {
			productList[i-1].printInfo();			
		} 
	}



    // 제품 입고 시 정보 입력 메서드

	private static void insertProduct() {
		
		System.out.print(" 제품명 입력 : ");
		String name = scan.next();
		
		System.out.print(" 제품 가격 입력 : ");
		int cost = scan.nextInt();
		
		System.out.print(" 제품 수량 입력 : ");
		int number = scan.nextInt();
		
		System.out.print(" 제품 구입 출처 입력 : ");
		String where = scan.next();
		
		Product product = new Product(name, cost, number, where);// 인스턴스 생성
		
		productList[count]=product;
		
		count++;				
	}

    // 제품 번호 입력시 해당 제품 판매 메서드

	private static void runSell(int sellNum) {
		
		for(int i =0; i<count;i++) {
			if(sellNum==productList[i].getNum()) {
				System.out.print("판매할 개수 선택 : ");
				
				int sellNumber = scan.nextInt();
				
				if(sellNumber>productList[i].getNumber()) {
					System.out.println("판매 개수 부족");
					break;
				}
												
				int restNumber= productList[i].getNumber()-sellNumber; // 남은 수량 변수 지정
				
								
				switch(restNumber) {
				
				case 0 :
					
					// 삭제
					
					 deleteProduct(i);
										
					 break;
					
				default :
					
					productList[i].setNumber(restNumber);
					
				}
			}
		}
		System.out.println(" 일치하는 제품이 없습니다. ");
	}
				
		
	// 판매 후 남은 수량이 0개가 된 제품 목록에서 삭제하는 메서드	
	// i 는 삭제하는 배열의 번지
	private static void deleteProduct(int i) {
		
        count--;
		
		System.out.println("삭제 완료");
		
		if(i==count) {
			return;
		}
		
		Product[]tmpList = new Product[productList.length];
		
		System.arraycopy(productList, 0, tmpList, 0, productList.length);
		
		System.arraycopy(tmpList, i+1, productList, i, count-i);				
	}




    // 메뉴 출력 메서드

	private static void printMenu() {
		
		System.out.println("---------");
		System.out.println(" 메뉴 ");
		System.out.println(" 1. 제품 입고 ");
		System.out.println(" 2. 제품 판매 ");
		System.out.println(" 3. 제품 수정 [가격] ");
		System.out.println(" 4. 제품 매출 내역 조회 ");
		System.out.println(" 5. 종료 ");
		System.out.println("---------");
		System.out.print("메뉴 선택 : ");
		
	}
	
	

}
