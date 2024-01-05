package TeamHw2;

public class MoneyMain {

	public static void main(String[] args) {
		
		
		/* 가계부 프로그램을 작성하세요
		 * 기한 1/12 팀 과제
		 * 월,일 ,메모(지출내역서),수입,지출
		 * 기능
		 * 1.기능
		 *  -수입(월 단위)
		 *  -지출,지출 내역서 입력기능(일 단위)
		 *  -지출 수정(날짜 지출액,내역)
		 *  2.기능
		 *  선택일 지출
		 *  -월 일 선택->지출,지출내역 조회
		 *  월 별 수입 총지출액
		 *  -(월)선택->월별 수입 지출 잔액 출력
		 * 가능하면 기록을 저장 불러오기 기능 구현
		 * 
		 * 
		 *  1. 수입
		 *	2. 지출, 지출 내역서
			3. 지출 수정
			메뉴선택 : 2

			월 입력 : 1
			일 입력 : 12
			지출비용 : 10100
			지출내역 : 치킨

-			--가계부 내역 기입---

			1. 수입
			2. 지출, 지출 내역서
			3. 지출 수정
			메뉴선택 : 3
			
			월 입력 : 1
			일 입력 : 12
			수정할 지출비용 : 10100
			수정할 지출내역 : 치킨
			or
			수정할 지출비용 : 0
			내역을 지움
			
			---가계부 내역 기입---
			
			1. 수입
			2. 지출, 지출 내역서
			3. 지출 수정
			메뉴선택 : 3
			
			월 입력 : 1
			일 입력 : 13(예)지출 x)
			해당 날짜에 지출 내역이없습니다.
			
			----------------------
			
			
			----가계부 프로그램----
			
			1. 가계부 내역 기입
			2. 조회
			메뉴선택 : 2
			
			-------조회-------
			1. 월 조회
			2. 일 조회
			메뉴선택 : 1
			
			월 선택:6
			수입:   지출:  잔액:  
			
			
			-------조회-------
			1. 월 조회
			2. 일 조회
			메뉴선택 : 2
			
			월 선택:1
			일선택:15
			-------------
			지줄:  지출내용:
					           */
		
		
		MoneyProgram mp = new MoneyProgram();
		
		mp.run();
		

	}

}
