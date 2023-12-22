package DAY11.product;

import java.util.Scanner;

import DAY10.word.Word2;

public class ProductMain2 {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static Product1 [] list = new Product1[10];
	private static Product1[]saleList=new Product1[10];
	
	
	private static int count = 0;
	private static int saleCount = 0;

	public static void main(String[] args) {
		
		int menu;
		do {
			
			printMenu();
			
			menu=scan.nextInt();
			
			runMenu(menu);
			
			
		}while(menu!=5);
		
		System.out.println("프로그램 종료");			
		
	}

	public static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			storeProduct();
			break;
			
		case 2 :
			
			saleProduct();
			break;
			
		case 3:
			updateProduct();
			break;
			
		case 4 :
			printSaleList();
			break;
			
		case 5 :
			break;
			
		default :
			System.out.println("잘못된 메뉴");
		
		}
		
	}
	
	
	private static void printSaleList() {
		
		for(int i =0; i<saleCount;i++) {
			saleList[i].print();
		}		
	}

	private static void updateProduct() {
		
		System.out.print("제품명 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("금액 : ");
		int salePrice = scan.nextInt();
		
		for(int i=0;i<count;i++) {
			if(list[i].equals(name)) {
				list[i].updateSalePrice(salePrice);
				return;
			}
		}
		System.out.println("일치하는 제품이 없다고 출력");
	}
	
		
	private static void saleProduct() {
		// 등록된 제품 목록을 출력
		for(int i =0; i<count; i++) {
			list[i].print();
		}
		// 제품명 입력
		System.out.print(" 제품명 : ");
		scan.nextLine(); // 엔터 처리
		String name = scan.nextLine();
		// 판매 개수 입력
		
		System.out.print(" 수량 : ");
		int amount =scan.nextInt();
		// 기존 제품 수량을 변경
		
		// 반복문 : 등록된 제품 전체
		int index =-1;
		for(int i =0;i<count;i++) {
			if(list[i].equals(name)) {
				index=i;
			}
		}
		
		if(index==-1) {
			System.out.println("일치하는 제품이 없습니다.");
			return;
		}
		
		if(list[index].getAmount()<amount) {
			System.out.println("수량을 확인하세요");
			return;
		}
		
		list[index].updateAmount(-amount);
		   
		Product1 tmp=new Product1(name,amount,list[index].getBuyPrice(),
				list[index].getSalePrice());
		
		saleList[saleCount]=tmp;
		
		saleCount++;
		
		System.out.println("판매가 등록됐습니다.");
		
	}

	public static void storeProduct() {
		// 제품 정보 입력
		System.out.println("제품명 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("수량 : ");
		int amount = scan.nextInt();
		
		System.out.print("구매 가격 : ");
		int buyPrice = scan.nextInt();
		
		System.out.print("판매 가격 : ");
		
		int price = scan.nextInt();
		
		// 일치하는 제품 정보가 있으면 수량을 변경하고 
		for(int i =0; i<count;i++) {
			if(list[i].equals(name)) {
				list[i].updateAmount(amount);
				return;
			}
		}
		// 없으면 추가
		
		list[count]=new Product1(name,amount,buyPrice,price);
		count++;
	
	
	if(count==list.length) {
		list = expandList(list);
	}
	
	}
	
	/**
	 * 주어진 list 를 확장하는 메서드
	 * @param list를 확장할 메서드
	 * @return 주어진 list에 크기 10만큼 늘어난 배열을 반환
	 */
	

	private static Product1[] expandList(Product1 [] list) {
			
	    Product1[]tmpList = new Product1[list.length+10];
				
	    System.arraycopy(list, 0, tmpList, 0, list.length);
		 		
	    return tmpList;
	}
				
				
	public static void printMenu() {
		
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
